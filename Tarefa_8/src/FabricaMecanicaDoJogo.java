import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*retorna a MecanicaDoJogo que deve ser utilizada.*/

public class FabricaMecanicaDoJogo implements Embaralhador, MecanicaDoJogo{
	FabricaEmbaralhadores fe = new FabricaEmbaralhadores();
	private static MecanicaDoJogo mMecanica;
	
	public static MecanicaDoJogo get() {
        return  mMecanica;
	}
	
	@Override
	public String inverter(String palavra) {
		String invertida = new StringBuilder(palavra).reverse().toString();
		return invertida;
	}

	@Override
	public String trocarLetras(String palavra) {
		List<String> letters = Arrays.asList(palavra.split(""));
	    Collections.shuffle(letters);
	    StringBuilder palavra_embaralhada = new StringBuilder(palavra.length());
	    
	    for (String k : letters) {
	    	palavra_embaralhada.append(k);
	    }
	    return palavra_embaralhada.toString();
	}

	@Override
	public boolean fimJogo(int fim) {
		if(fim == 3) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public void proximaJogada(int alternativa) {
		switch(alternativa) {
			case 1:
			try {
				Principal.main(null);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
			case 2:
				System.exit(0);
			break;
			default:
				System.out.println("Opção selecionada inválida!!!");
			break;
		}
	}


	@Override
	public int score() {
		if(FabricaEmbaralhadores.embaralha() == 1) {
			return 10;
		}
		else {
			return 50;
		}
	}

	@Override
	public String embaralhador(String palavra) {
		String palavra_embaralhada;
		if(FabricaEmbaralhadores.embaralha() == 1) {
			palavra_embaralhada = inverter(palavra);
			return palavra_embaralhada;
		}
		else {
			palavra_embaralhada = trocarLetras(palavra);
			return palavra_embaralhada;
		}
	}


	@Override
	public boolean acerto(String palavra, String resposta) {
		if(palavra.equals(resposta)) {
			return true;
		}else {
			return false;
		}
	}

}
