import java.io.FileNotFoundException;
import java.util.Scanner;
//import javafx.application.Application;

public class Principal /*extends FabricaMecanicaDoJogo*/{
	/*representa a classe com o método main(). É essa classe que é responsável por ler
	a entrada do usuário e por imprimir as informações no console. Nenhuma outra classe pode
	imprimir ou ler do console.*/
	static BancoDePalavras bp = new BancoDePalavras();
	static Scanner ler = new Scanner(System.in);
	static int contador = 1;
	static int fimJogo = 0;
	static String resposta = " ";
	static String palavra_aleatoria;
	static int pontuacao = 0;
	
	//nao pode ter herança, deve ser instaciado o objeto. implemente so a interface
	public static void main(String[] args) throws FileNotFoundException {
		/*classe Principal deve recuperar a instância de MecanicaDoJogo de FabricaMecanicaDoJogo e não
		pode conter nenhuma referência direta a uma das implementações, apenas a interface. Da mesma
		forma, as implementações de MecanicaDoJogo devem recuperar os embaralhadores de
		FabricaEmbaralhadores e também não pode conter nenhuma referência direta a implementações de
		Embaralhador, apenas a interface.*/
		
		System.out.println("#### Bem Vindo ao Jogo das Palavras Embaralhadas!!! ####");
		System.out.println("Dica: as palavras são relacionadas com a série La Casa De Papel...");
		
		MecanicaDoJogo mj = new FabricaMecanicaDoJogo();
		
		while(!mj.fimJogo(fimJogo)) {
			palavra_aleatoria = BancoDePalavras.palavraAleatoria();
			contador = 0;
			while(contador < 3) {
				System.out.println("Descubra qual é a palavra:\n");
				System.out.println("A palavra é: " + mj.embaralhador(palavra_aleatoria));
				System.out.println("Resposta:");
				
				resposta = ler.nextLine();
				
				if(mj.acerto(resposta, palavra_aleatoria)) {
					System.out.println("Você acertou!!!");
					pontuacao += mj.score();
					break;
				}
				contador++;
			}
			fimJogo++;
			System.out.println("Fim da rodada "+ fimJogo + "!!!\n");
		}
		System.out.println("Fim do jogo!!!");
		System.out.println("Sua pontuação é: "+ pontuacao);
		pontuacao = 0;
		
		System.out.println("\n Você deseja continuar?");
		System.out.println("Pressione 1 - Sim / 2 - Não");
		int menu = ler.nextInt();
		mj.proximaJogada(menu);
	}
}
