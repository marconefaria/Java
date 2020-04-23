import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class test {
	
	@Test
	void test_informal() {
		FormatadorNome fn = new Informal();
		Autoridade a = new Autoridade("Marcone", "Faria", fn);
		assertEquals("Marcone", a.getTratamento());
	}
	
	@Test
	void test_respeitoso() {
		FormatadorNome fn = new Respeitoso("masculino");
		Autoridade a = new Autoridade("Marcone", "Faria", fn);
		assertEquals("Sr. Faria", a.getTratamento());
	}
	
	@Test
	void test_comTitulo() {
		FormatadorNome fn = new ComTitulo("Excelentíssimo");
		Autoridade a = new Autoridade("Marcone", "Faria", fn);
		assertEquals("Excelentíssimo Marcone Faria", a.getTratamento());
	}
	
	@Test
	void test_anotherGender() {
		FormatadorNome fn = new Respeitoso("transgender");
		Autoridade a = new Autoridade("Marcone", "Faria", fn);
		assertEquals("Genero fornecido incopatível com a base de dados!", a.getTratamento());
	}

}
