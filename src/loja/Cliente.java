package loja;

public class Cliente {
	String cpf, nome, telefone;

	public Cliente(String cpf, String nome, String telefone) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.telefone = telefone;
	}

	public String toString() {
		return "Cliente [cpf=" + cpf + ", nome=" + nome + ", telefone=" + telefone + "]";
	}
	
	
	
}
