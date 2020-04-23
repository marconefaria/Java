import java.io.FileNotFoundException;
import java.util.Scanner;
//import javafx.application.Application;

public class Principal /*extends FabricaMecanicaDoJogo*/{
	/*representa a classe com o m�todo main(). � essa classe que � respons�vel por ler
	a entrada do usu�rio e por imprimir as informa��es no console. Nenhuma outra classe pode
	imprimir ou ler do console.*/
	static BancoDePalavras bp = new BancoDePalavras();
	static Scanner ler = new Scanner(System.in);
	static int contador = 1;
	static int fimJogo = 0;
	static String resposta = " ";
	static String palavra_aleatoria;
	static int pontuacao = 0;
	
	//nao pode ter heran�a, deve ser instaciado o objeto. implemente so a interface
	public static void main(String[] args) throws FileNotFoundException {
		/*classe Principal deve recuperar a inst�ncia de MecanicaDoJogo de FabricaMecanicaDoJogo e n�o
		pode conter nenhuma refer�ncia direta a uma das implementa��es, apenas a interface. Da mesma
		forma, as implementa��es de MecanicaDoJogo devem recuperar os embaralhadores de
		FabricaEmbaralhadores e tamb�m n�o pode conter nenhuma refer�ncia direta a implementa��es de
		Embaralhador, apenas a interface.*/
		
		System.out.println("#### Bem Vindo ao Jogo das Palavras Embaralhadas!!! ####");
		System.out.println("Dica: as palavras s�o relacionadas com a s�rie La Casa De Papel...");
		
		MecanicaDoJogo mj = new FabricaMecanicaDoJogo();
		
		while(!mj.fimJogo(fimJogo)) {
			palavra_aleatoria = BancoDePalavras.palavraAleatoria();
			contador = 0;
			while(contador < 3) {
				System.out.println("Descubra qual � a palavra:\n");
				System.out.println("A palavra �: " + mj.embaralhador(palavra_aleatoria));
				System.out.println("Resposta:");
				
				resposta = ler.nextLine();
				
				if(mj.acerto(resposta, palavra_aleatoria)) {
					System.out.println("Voc� acertou!!!");
					pontuacao += mj.score();
					break;
				}
				contador++;
			}
			fimJogo++;
			System.out.println("Fim da rodada "+ fimJogo + "!!!\n");
		}
		System.out.println("Fim do jogo!!!");
		System.out.println("Sua pontua��o �: "+ pontuacao);
		pontuacao = 0;
		
		System.out.println("\n Voc� deseja continuar?");
		System.out.println("Pressione 1 - Sim / 2 - N�o");
		int menu = ler.nextInt();
		mj.proximaJogada(menu);
	}
}
