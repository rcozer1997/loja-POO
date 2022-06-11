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
		return "ItemCompra [Produto=" + produto.nome + ", Quantidade=" + quantidade + ", CustoUnidade=" + custoUnidade + "]";
	}
	
	double custoTotal() {
		return this.custoUnidade * this.quantidade;
	}
	
	Produto getItemCompraProduto() {
		return this.produto;
	}

}
