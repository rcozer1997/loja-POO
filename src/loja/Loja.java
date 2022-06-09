package loja;
import java.util.ArrayList;
import java.util.Scanner;

public class Loja {
	ArrayList<Produto> listaProdutos = new ArrayList <>();
	ArrayList<Cliente> listaClientes = new ArrayList <>();
	ArrayList<NotaFiscal> listaNotas = new ArrayList <>();
	
	//Métodos para cadastro
	void cadastrarCliente() {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Digite os dados do cliente: ");
        System.out.println("Nome: ");
        String nome = s.nextLine();
        System.out.println("CPF: ");
        String cpf = s.nextLine();
        System.out.println("Telefone: ");
        String tel = s.nextLine();
        
        Cliente c = new Cliente(cpf,nome,tel);
        listaClientes.add(c);
        
        
	}
	
	void cadastrarProduto() {
       Scanner s = new Scanner(System.in);
       
       System.out.println("Digite os dados do produto: ");
       System.out.println("Código: ");
       int codigo = s.nextInt();
       System.out.println("Nome: ");
       String nome = s.nextLine();
       System.out.println("Preço: ");
       double preco = s.nextFloat();
       System.out.println("Categoria: ");
       String categoria = s.nextLine();
       System.out.println("Desconto: ");
       double desconto = s.nextFloat();
       System.out.println("Estoque: ");
       int estoque = s.nextInt();
       
       Produto p = new Produto(codigo,estoque, nome, categoria, preco, desconto);
       listaProdutos.add(p);

	}
	
	void cadastrarNota() {
	       Scanner s = new Scanner(System.in);
	       
	       System.out.println("Digite os dados da Nota Fiscal: ");
	       System.out.println("Código: ");
	       int codigo = s.nextInt();
	       System.out.println("Data: ");
	       String data = s.nextLine();
	       System.out.println("Método de Pagamento: ");
	       String metodo = s.nextLine();
	       
	       NotaFiscal n = new NotaFiscal(codigo, data, metodo,); //DUVIDA AQUI, DEVO PASSAR O ARRAY LISTACOMPRA? COMO?
	       
	       listaNotas.add(n);
	     

		}
	
	//Métodos de listagem
	
	void listarClientes() {
		for(Cliente c : listaClientes) {
			System.out.println(c);
		}
	}
	void listarProdutos() {
		for(Produto p : listaProdutos) {
			System.out.println(p);
		}
	
		}
	void listarNotas() {
		for(NotaFiscal n : listaNotas) {
				System.out.println(n);
		}
	}
	
	//Método buscar
}
