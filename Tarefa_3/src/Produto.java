
public class Produto {
	protected String nome;
	protected String codigo;
	protected double preco;
	
	public Produto(String nome, String codigo, double preco) {
		super();
		this.nome = nome;
		this.codigo = codigo;
		this.preco = preco;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Produto: código = " + codigo + ", nome = " + nome + ", preço = " + preco;
	}
	
}

/*@Override
public boolean equals(Object obj) {
	if (obj instanceof Produto) {
		Produto qualquer = (Produto) obj;
		return this.codigo.equals(qualquer.getCodigo());		
    }else {
      return false;
    }
  }

@Override
public int hashCode() {
	return this.codigo.charAt(0);
}

### Métodos manuais, em geral não apresentam erros mas o Eclipse gera métodos sobreescritos que tem funcionamento menlhor
*/
