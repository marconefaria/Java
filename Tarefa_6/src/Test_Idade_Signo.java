import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.Test;

class Test_Idade_Signo {

	@Test
	public void testMarcone() throws ParseException {
		String x = "26/02/2000";
		SimpleDateFormat sdf1= new SimpleDateFormat("dd/MM/yyyy");
		Date data = sdf1.parse(x);
		
		Pessoa p = new Pessoa(data);
		assertEquals("Peixes", p.getSigno());
		assertEquals(20, p.getIdade());
	}
	
	@Test
	public void testMariane() throws ParseException {
		String x = "24/05/1991";
		SimpleDateFormat sdf1= new SimpleDateFormat("dd/MM/yyyy");
		Date data = sdf1.parse(x);
		
		Pessoa p = new Pessoa(data);
		assertEquals("Gêmeos", p.getSigno());
		assertEquals(28, p.getIdade());
	}
	
	@Test
	public void testBeth() throws ParseException {
		String x = "28/06/1959";
		SimpleDateFormat sdf1= new SimpleDateFormat("dd/MM/yyyy");
		Date data = sdf1.parse(x);
		
		Pessoa p = new Pessoa(data);
		assertEquals("Câncer", p.getSigno());
		assertEquals(60, p.getIdade());
	}

}
