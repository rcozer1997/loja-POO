package loja;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Loja l = new Loja();
		int opçao;
		int codigoNotaCount = 0;
		do {
		System.out.println("--------------Bem vindo a loja! O que quer fazer?---------------");
		System.out.println("1 - Cliente");
		System.out.println("2 - Produtos");
		System.out.println("3 - Notas Fiscais");
		System.out.println("4 - Exibir Relatorio");
		System.out.println("0 - Sair da loja");

		Scanner s = new Scanner(System.in);
		opçao = s.nextInt();
		switch(opçao) {
		case 1:
			System.out.println("--------------Opcoes para Clientes---------------");
			System.out.println("1 - Cadastrar Cliente");
			System.out.println("2 - Listar Clientes");
			System.out.println("3 - Remover Clientes");
			System.out.println("0 - Voltar");
			System.out.println("--------------------------------------------------");
			System.out.println();
			
			int opçaoCliente = s.nextInt();
			switch(opçaoCliente) {
			case 1:
				l.cadastrarCliente();
				break;
			case 2:
				l.listarClientes();
				break;		
			case 3:
			System.out.println("Digite o CPF do cliente:");
			String cpf = s.nextLine();
			s.nextLine();
			l.removerCliente(cpf);
				break;
			case 0:
				break;
			}
			break;	
			
		case 2:	
			System.out.println("--------------Opcoes para Produtos---------------");
			System.out.println("1 - Cadastrar Produto");
			System.out.println("2 - Listar Produtos");
			System.out.println("3 - Remover Produtos");
			System.out.println("4 - Listar Categoria");
			System.out.println("5 - Atualizar Produto");
			System.out.println("0 - Voltar");
			System.out.println("------------------------------------------------------");
			System.out.println();
	
			int opçaoProduto = s.nextInt();
			switch(opçaoProduto) {
			case 1:
				l.cadastrarProduto();
				break;
			case 2:
				l.listarProdutos();
				break;		
			case 3:
				System.out.println("Digite o codigo do produto:");
				System.out.println("----------------------------------------------");

				int codigo = s.nextInt();
				l.removerProduto(codigo);
			break;
			case 4:
				l.listarItensCategoria();
				break;
			case 5:
				System.out.println("Digite o codigo do produto:");
				System.out.println("----------------------------------------------");

				codigo = s.nextInt();
				Produto p = l.buscaProduto(codigo);
					if(p == null) {
						System.out.println("Produto nao existe!");
						System.out.println("----------------------------------------------");

					}
					else
						p.atualizarProduto(p);
				break;
			case 0: 
				break;
			default: 
				System.out.println("Opcao invalida! Tente novamente.");
				System.out.println("----------------------------------------------");

				break;
			}
			break;
			case 3:
			System.out.println("--------------Opcoes para Notas Fiscais---------------");
			System.out.println("1 - Cadastrar Nota");
			System.out.println("2 - Listar Notas");
			System.out.println("3 - Remover Nota");
			System.out.println("4 - Adicionar item a uma nota fiscal");
			System.out.println("5 - Exibir uma nota fiscal");
			System.out.println("0 - Voltar");
			System.out.println("------------------------------------------------------");
			System.out.println();
			
			int opçaoNotas = s.nextInt();
			
			switch(opçaoNotas) {
			case 1:
				
				l.cadastrarNota(codigoNotaCount);
				codigoNotaCount++;
				
				break;
			case 2:
				l.listarNotas();
				break;
			case 3:
				System.out.println("Digite o codigo da nota fiscal:");
				System.out.println("----------------------------------------------");
				int codigo = s.nextInt();
				l.removerNota(codigo);
				break;
			case 4:
				l.adicionarItemNota();
				break;
			case 5:
				System.out.println("Digite o codigo da nota fiscal:");
				System.out.println("----------------------------------------------");
				int codigoNota = s.nextInt();
				l.exibirNotaFiscal(codigoNota);
				break;
			case 0:
				break;
			}
			break;
		
		case 4:
			System.out.println("--------------Relatorio da Loja---------------");
			l.exibirRelatorio();
			System.out.println("----------------------------------------------");

			break;
		case 0:
			System.out.println("----------------------------------------------");
			System.out.println("               Volte sempre! :)");
			System.out.println("----------------------------------------------");

			break;
		default:
			System.out.println("Opcao invalida! Tente novamente.");
			System.out.println("----------------------------------------------");
			break;
		}
		
		
	}while(opçao != 0);

}
}