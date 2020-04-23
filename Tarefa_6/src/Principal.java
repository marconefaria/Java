import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Principal {

	public static void main(String[] args) throws ParseException {
		/*SimpleDateFormat df = new SimpleDateFormat("DD/MM/YYYY");
		d = df.parse("2/26/2000");*/
		
		String x = "26/02/2000";
		SimpleDateFormat sdf1= new SimpleDateFormat("dd/MM/yyyy"); //você pode usar outras máscaras
		Date dataUsuario = sdf1.parse(x);
		Pessoa p = new Pessoa(dataUsuario);
		
		System.out.println(p.getIdade());
		System.out.println(p.getSigno());
	}

}
