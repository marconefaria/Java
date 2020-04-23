	/*possui um método que retorna um embaralhador
	aleatóriamente.*/
import java.util.Random;

public class FabricaEmbaralhadores /*extends FabricaMecanicaDoJogo*/ {
	static Random random = new Random();
	static int num_aleatorio;
	//static Embaralhador e = new FabricaMecanicaDoJogo();
	
	public static int embaralha() {
		num_aleatorio = random.nextInt(2) + 1;
		switch(num_aleatorio) {
			case 1:
				return 1;
				//inverter
			case 2:
				return 2;
				//embaralha
		}
		return 0;
	}
}
