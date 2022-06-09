package loja;

public class ItemCompra {
	Produto produto;
	int quantidade;
	double custoUnidade;
	
	public ItemCompra(Produto produto, int quantidade, double custoUnidade) {
		super();
		this.produto = produto;
		this.quantidade = quantidade;
		this.custoUnidade = custoUnidade;
	}

	@Override
	public String toString() {
		return "ItemCompra [produto=" + produto + ", quantidade=" + quantidade + ", custoUnidade=" + custoUnidade + "]";
	}
	
	
}
