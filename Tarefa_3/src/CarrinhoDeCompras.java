import java.util.HashMap;

public class CarrinhoDeCompras {
	protected HashMap<Produto, Integer> produtos = new HashMap<Produto, Integer>();
	//recebe o codigo e a quantidade
	
	public void adicionaProduto(Produto novo_produto, int qtd) {
		int newqtd = 0;
		if(produtos.containsKey(novo_produto)) {
			newqtd = produtos.get(novo_produto) + qtd;
			produtos.put(novo_produto, newqtd);
			//atualiza quantidade
		}
		else{
			produtos.put(novo_produto, qtd);
			//insere o produtos
		}
	}
	
	public void removeProduto(Produto produto_del, int qtd_del) {
		int newqtd = 0;
		if(qtd_del == produtos.get(produto_del)) {
			produtos.remove(produto_del);
		}
		else {
			if(qtd_del < produtos.get(produto_del)) {
				newqtd = produtos.get(produto_del) - qtd_del;
				produtos.put(produto_del, newqtd);
			}
			else {
				System.err.println("Quantidade a ser removida maior que a quantidade atual!!!");
				System.err.flush();
				System.exit(0); 
			}
		}
	}
	
	public void calculaTotal() {
		double calcula = 0;
		System.out.println("### Carrinho de Compras: ###\n");
		for(Produto produto : produtos.keySet()) {
			calcula += produto.preco * produtos.get(produto);
			System.out.println(produtos.get(produto) + "X " + produto.toString());
		}
		System.out.println("\nTOTAL = " + calcula);
	}
}

/*Map<Integer, Contribuinte> contribuintes = new HashMap<Integer, Contribuinte>();
...
for (Integer codContribuinte  : contribuintes.keySet()) {
    Contribuinte c = contribuintes.get (codContribuinte );
    ....
}*/