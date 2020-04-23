
public class CompraParcelada extends Compra {
	protected int qtd_parcelas;
	protected double juros_mensal;
	
	public CompraParcelada(double valor_compra, int qtd_parcelas, double juros_mensal) {
		super(valor_compra);
		this.qtd_parcelas = qtd_parcelas;
		this.juros_mensal = juros_mensal;
	}
	
	@Override
	public double total() {
		double valor_total;
		valor_total = valor_compra * Math.pow((1 + juros_mensal), qtd_parcelas);
		return valor_total;
	}
	
}
