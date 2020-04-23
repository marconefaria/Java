import java.io.FileNotFoundException;

public class Principal {

	public static void main(String[] args) throws FileNotFoundException, LeituraArquivoException {
		System.out.println(ProcessadorArquivo.processar("arquivo"));
	}

}
