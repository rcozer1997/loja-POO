package loja;

public class Produto {
	int codigo, estoque;
	String nome, categoria;
	double preço, desconto;
	
	
	public Produto(int codigo, int estoque, String nome, String categoria, double preço, double desconto) {
		super();
		this.codigo = codigo;
		this.estoque = estoque;
		this.nome = nome;
		this.categoria = categoria;
		this.preço = preço;
		this.desconto = desconto;
	}


	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", estoque=" + estoque + ", nome=" + nome + ", categoria=" + categoria
				+ ", preço=" + preço + ", desconto=" + desconto + "]";
	}
	
	public int getCodigo() {
		return this.codigo;
	}
	
	public double custoProduto() {
		return this.preço-= this.desconto;
	}
	
	void atualizarEstoque(int qtd) {
		this.estoque += qtd;

	}
	
	void atualizarDesconto(double valor) {
		this.desconto += valor;
	}
	
	void atualizarPreco(double valor) {
		this.preço+= valor;
	}
}
