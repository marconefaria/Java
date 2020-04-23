import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProcessadorArquivo {
	static Map<String,String> nulo = new HashMap<String,String>();
	
	public static Map processar(String nome_arquivo) throws LeituraArquivoException, FileNotFoundException {
		try{
			File file = new File(nome_arquivo);
			Scanner sc = new Scanner(file);
			int contador = 0;
			
			if(file.exists()) {
				if(file.length() == 0) {
					throw new LeituraArquivoException("Arquivo vazio");
				}
				else{
				Map<String,String> leitura = new HashMap<String,String>();
					while (sc.hasNextLine()){
						String s = sc.nextLine();
						String[] palavras = s.split("->");
						
						leitura.put(palavras[0], palavras[1]);
						contador = 0;
					}
					return leitura;
				}
			}
		}
		catch (IOException e){
			throw new LeituraArquivoException("Erro ao abrir o arquivo ");
		}
		return nulo;
	}
	
}
