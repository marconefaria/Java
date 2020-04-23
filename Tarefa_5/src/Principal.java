
public class Principal {

	public static void main(String[] args) {
		FormatadorNome fn = new Informal();
		Autoridade a = new Autoridade("Marcone", "Faria", fn);
		System.out.println(a.getTratamento());
		
		FormatadorNome fn_1 = new Respeitoso("masculino");
		Autoridade a_1 = new Autoridade("Marcone", "Faria", fn_1);
		System.out.println(a_1.getTratamento());
		
		FormatadorNome fn_2 = new ComTitulo("Excelentíssimo");
		Autoridade a_2 = new Autoridade("Marcone", "Faria", fn_2);
		System.out.println(a_2.getTratamento());
		
	}

}
