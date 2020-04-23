	/*classe que possui um método que retorna uma palavra retirada
	aleatóriamente de uma lista de palavras lida a partir de um arquivo.*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class BancoDePalavras {
	//calula um numero aleatorio e pega a palavra de acordo com a linha
	static Random random = new Random();
	static int indice;
	static int contador;
	
	public static String palavraAleatoria() throws FileNotFoundException {
		File file = new File("personagens");
		Scanner sc = new Scanner(file);
		
		List<String> palavras = new ArrayList<>();
		
		while (sc.hasNextLine()){
			String s = sc.nextLine();
			palavras.add(s);
		}
	    Collections.shuffle(palavras);
	    //System.out.println(palavras.toString());
	    
		sc.close();
		return palavras.get(0);
	}
}
