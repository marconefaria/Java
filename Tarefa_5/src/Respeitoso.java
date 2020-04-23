
public class Respeitoso implements FormatadorNome {
	private String genero;
	
	public Respeitoso(String genero) {
		this.genero = genero;
	}
	
	public String getGenero() {
		return genero;
	}
	
	@Override
	public String formatarNome(String nome, String sobrenome) {
		getGenero().toLowerCase();
		if(getGenero() == "masculino") {
			return "Sr. "+ sobrenome;
		} else if (getGenero() == "feminino") {
			return "Sra. "+ sobrenome;
		} else {
			//System.err.println("Genero fornecido incopatível com a base de dados!");
			//System.err.flush();
			return "Genero fornecido incopatível com a base de dados!"; 
		}
	}
}
