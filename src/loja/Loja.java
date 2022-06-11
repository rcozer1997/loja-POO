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
       System.out.println("Codigo: ");
       int codigo = s.nextInt();
       s.nextLine();
       System.out.println("Nome: ");
       String nome = s.nextLine();
       System.out.println("Preco: ");
       double preco = s.nextFloat();
       s.nextLine();
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
	       System.out.println("CPF do comprador: ");
	       String cpf = s.nextLine();
	       System.out.println("Metodo de Pagamento: ");
	       String metodo = s.nextLine();
	       
	       NotaFiscal n = new NotaFiscal(cpf, metodo); 
	       
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
	
	void buscaCliente(String cpf) {
		  for(int i = 0; i < listaClientes.size(); i++)
	       {
	           Cliente c = listaClientes.get(i);

	           if(c.getCPF().equals(cpf))
	           {
	       		  
	    	       }

	               break;
	           }
	       }
	
	
	void removerCliente(String cpf) {
			Scanner s = new Scanner(System.in);
			System.out.println("Digite o CPF:");
			cpf = s.nextLine();
			for(int i = 0; i < listaClientes.size(); i++)
	       {
	           Cliente c = listaClientes.get(i);

	           if(c.getCPF().equals(cpf))
	           {
	               
	               listaClientes.remove(c);
	               System.out.println("Cliente removido!");

	               break;
	           }
	       }

	}
	
	void removerProduto() {
		Scanner s = new Scanner(System.in);
		System.out.println("Digite o código do produto:");
		int codigo = s.nextInt();
		for(int i = 0; i < listaProdutos.size(); i++)
       {
           Produto p = listaProdutos.get(i);

           if(p.getCodigo() == codigo)
           {
               
               listaProdutos.remove(p);
               System.out.println("Produto removido!");

               break;
           }
       }

}
	void removerNota() {
		Scanner s = new Scanner(System.in);
		System.out.println("Digite o código da nota:");
		int codigo = s.nextInt();
		for(int i = 0; i < listaNotas.size(); i++)
       {
           NotaFiscal n = listaNotas.get(i);

           if(n.getCodigo() == codigo)
           {
               
               listaNotas.remove(n);
               System.out.println("Nota removida!");

               break;
           }
       }

}
	


	
}
