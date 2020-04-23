
public class Autoridade {
	private String nome;
	private String sobrenome;
	private FormatadorNome formatadorNome;

	public Autoridade(String nome, String sobrenome, FormatadorNome fn) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.formatadorNome = fn;
	}
	
	public String getNome() {
		return nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}	
	
	public FormatadorNome getFormatadorNome() {
		return formatadorNome;
	}

	public String getTratamento() {
		// delega a formata��o do nome para a inst�ncia de FormatadorNome
		return getFormatadorNome().formatarNome(getNome(), getSobrenome());
	}
}
