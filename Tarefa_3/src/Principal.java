
public class Principal {

	public static void main(String[] args) {
		Produto p_1 = new Produto("Smartphone", "0001", 1200.00);
		Produto p_2 = new Produto("Notebook", "0002", 2200.00);
		ProdutoComTamanho p_3 = new ProdutoComTamanho("Blusa", "0003", 39.90, "P");
		ProdutoComTamanho p_4 = new ProdutoComTamanho("Blusa", "0004", 39.90, "M");
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adicionaProduto(p_1, 1);
		carrinho.adicionaProduto(p_2, 2);
		carrinho.adicionaProduto(p_3, 2);
		carrinho.adicionaProduto(p_4, 5);
		
		carrinho.removeProduto(p_4, 2);
		carrinho.removeProduto(p_2, 1);
		
		carrinho.calculaTotal();
	}

}
