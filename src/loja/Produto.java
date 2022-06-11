package loja;
import java.util.Scanner;

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
	
	public String getCategoria() {
		return this.categoria;
	}
	
	public double custoProduto() {
		
		double custoProduto = (this.preço*this.desconto/100);
		return custoProduto;
	}
	
	void atualizarProduto(Produto p) {
		Scanner s = new Scanner(System.in);
		System.out.println("O que deseja atualizar?");
		System.out.println("1 - Estoque");
		System.out.println("2 - Desconto");
		System.out.println("3 - Preco");
		int opçaoAtualizar = s.nextInt();
		switch(opçaoAtualizar) {
		case 1:
			System.out.println("Qual o novo estoque?");
			int qtdEstoque = s.nextInt();
			p.atualizarEstoque(qtdEstoque);
			break;
		case 2:
			System.out.println("Qual o novo desconto?");
			double desconto = s.nextInt();
				if(desconto > 1 || desconto < 0) {
					System.out.println("Desconto invalido! Insira um valor entre 0 e 1.");
				}
				else
			p.atualizarDesconto(desconto);
			break;
		case 3:
			System.out.println("Qual o novo preco?");
			double preço = s.nextInt();
			p.atualizarPreco(preço);
			break;
		}
	}
	void atualizarEstoque(int qtd) {
		this.estoque = qtd;
	}
	
	void atualizarDesconto(double valor) {
		this.desconto = valor;
	}
	
	void atualizarPreco(double valor) {
		this.preço = valor;
	}
}
