package loja;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Loja l = new Loja();
		int opçao;
		
		do {
		System.out.println("--------------Bem vindo a loja! O que quer fazer?---------------");
		System.out.println("1 - Cadastrar Cliente");
		System.out.println("2 - Listar Clientes");
		System.out.println("0 - Sair da loja");

		Scanner s = new Scanner(System.in);
		opçao = s.nextInt();
		switch(opçao) {
		case 1:
			l.cadastrarCliente();
			break;
		
		case 2:
			l.listarClientes();
			break;
		default:
			System.out.println("Opcao invalida! Tente novamente.");
			break;
		}
		
		
	}while(opçao != 0);

}
}