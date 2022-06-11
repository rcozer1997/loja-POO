package loja;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.List;
import java.util.Date;

public class Loja {
	ArrayList<Produto> listaProdutos = new ArrayList <>();
	ArrayList<Cliente> listaClientes = new ArrayList <>();
	ArrayList<NotaFiscal> listaNotas = new ArrayList <>();

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
       	if(desconto > 1 || desconto < 0) {
       		System.out.println("Desconto invalido! Insira um valor entre 0 e 1.");
       		return;
       	}
       	else
       System.out.println("Estoque: ");
       int estoque = s.nextInt();
       
       Produto p = new Produto(codigo,estoque, nome, categoria, preco, desconto);
       listaProdutos.add(p);

	}
	
	void cadastrarNota(int codigoCount) {
			
		   Date dataAtual = new Date();
	       Scanner s = new Scanner(System.in);
	   
	       System.out.println("Digite os dados da Nota Fiscal: ");
	       System.out.println("CPF do comprador: ");
	       String cpf = s.nextLine();
	       
	       Cliente comprador = buscaCliente(cpf);
	       	if(comprador == null) {
	       		System.out.println("Cliente nao existe!");
	       	}
	       	else
	       System.out.println("Metodo de Pagamento: ");
	       String metodo = s.nextLine();
	       Date data = dataAtual;
	       NotaFiscal n = new NotaFiscal(comprador, metodo, data); 
	       n.codigo = codigoCount;

	       listaNotas.add(n);
	     

		}
	

	void listarClientes() {
		
		System.out.println("---------------------------------------------------------");
		System.out.printf("%20s%15s%15s", "NOME", "CPF", "TELEFONE");
		System.out.println();
		System.out.println("---------------------------------------------------------");
		for(Cliente c : listaClientes) {
			
			System.out.println("---------------------------------------------------------");
			System.out.format("%20s%15s%15s", c.nome, c.cpf, c.telefone);
			System.out.println();
			System.out.println("---------------------------------------------------------");

			
			}
			
			
		}
	
	void listarProdutos() {
		System.out.println("-----------------------------------------------------------------------");
		System.out.printf("%20s%15s%15s%15s%15s%15s", "CODIGO", "NOME", "PRECO", "ESTOQUE", "CATEGORIA", "DESCONTO");
		System.out.println();
		System.out.println("-----------------------------------------------------------------------");
		for(Produto p : listaProdutos) {
			
			System.out.println("-----------------------------------------------------------------------");
			System.out.format("%20s%15s%15s%12s%15s%10s", p.codigo, p.nome, p.preço, p.estoque, p.categoria, p.desconto);
			System.out.println();
			System.out.println("-----------------------------------------------------------------------");

			
			}
			
		}
	void listarNotas() {
		System.out.println("-----------------------------------------------------------------------");
		System.out.printf("%10s%30s%15s%20s", "CODIGO", "METODO DE PAGAMENTO", "COMPRADOR", "DATA");
		System.out.println();
		System.out.println("-----------------------------------------------------------------------");
		for(NotaFiscal n : listaNotas) {
			System.out.println("-----------------------------------------------------------------------");
			System.out.format("%10s%20s%24s%40s", n.codigo, n.metodoPagamento, n.getCompradorNome(), n.data);
			System.out.println();
			System.out.println("-----------------------------------------------------------------------");
		}
	}
	
	void listarItensCategoria() {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite a categoria que deseja ver: ");
		String categoria = s.nextLine();
		System.out.printf("%20s%15s%15s%15s", "CODIGO", "NOME", "PRECO", "ESTOQUE");
		System.out.println();
		System.out.println("-----------------------------------------------------------------------");
			for(int i = 0; i<listaProdutos.size();i++){
				Produto p = listaProdutos.get(i);
				if(p.getCategoria().equals(categoria)) {
					
					System.out.println("-----------------------------------------------------------------------");
					System.out.format("%20s%15s%15s%15s", p.codigo, p.nome, p.preço, p.estoque);
					System.out.println();
					System.out.println("-----------------------------------------------------------------------");
				}
			}
		}
	
	
	Cliente buscaCliente(String cpf) {
		
		
		Cliente cliente = null;
		  for(int i = 0; i < listaClientes.size(); i++)
	       {
	           Cliente c = listaClientes.get(i);

	           if(c.getCPF().equals(cpf)) {
	        	   cliente = c;
	        	   break;
	           }
	     
	       }
		return cliente;
		
	}
	
	public Produto buscaProduto(int codigo) {
		
		Produto produto = null;
		  for(int i = 0; i < listaProdutos.size(); i++)
	       {
	           Produto p = listaProdutos.get(i);

	           if(p.getCodigo() == (codigo))
	        	   produto = p;
	        	   break;
	       }
		return produto;
		
	}
	
	NotaFiscal buscaNota(int codigo) {
		
	
		NotaFiscal nota = null;
		  for(int i = 0; i < listaNotas.size(); i++)
	       {
	           NotaFiscal n = listaNotas.get(i);

	           if(n.getCodigo() == (codigo)) {
	        	   nota = n;
	        	   break;
	           }
	           else if(!listaNotas.contains(n)) {
	        	   System.out.println("Nota não existe!");
	           }
	       }
		return nota;
	}


	void removerCliente(String cpf) {
			Cliente c = buscaCliente(cpf);
	        listaClientes.remove(c);
	        if(c == null) {
	        	System.out.println("Cliente nao existe!");
	        }
	        else
	        System.out.println("Cliente removido!");
     
	}
	
	void removerProduto(int codigo) {
		Produto p = buscaProduto(codigo);
		listaProdutos.remove(p);
		if(p == null) {
			System.out.println("Produto nao existe!");
		}
		else
		System.out.println("Produto removido!");

}
	void removerNota(int codigo) {
		NotaFiscal n = buscaNota(codigo);
		listaNotas.remove(n);
		if(n == null) {
			System.out.println("Nota nao existe!");
		}
		else
		System.out.println("Nota removida!");

}
	
	void adicionarItemNota() {
		
		   Scanner s = new Scanner(System.in);
	       
	       System.out.println("Digite os dados: ");
	       System.out.println("Codigo do produto: ");
	       int codigoProduto = s.nextInt();
	       System.out.println("Codigo da nota: ");
	       int codigoNota = s.nextInt();
	       System.out.println("Quantidade de itens: ");
	       int qtd = s.nextInt();     
	       Produto p = buscaProduto(codigoProduto);
	       NotaFiscal n = buscaNota(codigoNota);
	       	if(p == null) {
	       		System.out.println("Produto nao existe!");
	       	}
	       	else if(n == null) {
	       		System.out.println("Nota fiscal nao existe!");
	       	}
	       	else {
	       double custoUnitario;
	       custoUnitario = p.custoProduto();
	       p.estoque-= qtd;
	       
	       ItemCompra itemCompra = new ItemCompra(p, qtd,custoUnitario);
	       
	       n.adicionarItem(itemCompra);
	       	}
	  
	}
	
	void exibirRelatorio() {
		System.out.println("---------------------------------------------------------");
		System.out.println("Numero de clientes cadastrados: " + listaClientes.size());
		System.out.println("Numero de produtos cadastrados: " + listaProdutos.size());
		System.out.println("Numero de compras: " + listaNotas.size());
		System.out.println("---------------------------------------------------------");
	}
	
	void exibirNotaFiscal(int codigo) {
		NotaFiscal n = buscaNota(codigo);
			if(n == null) {
				System.out.println("Nota Fiscal nao existe!");
			}
			else
				
			System.out.println("------------------------------------------------------------------------");
			System.out.printf("%15s%20s%15s%20s", "PRODUTO", "QUANTIDADE", "VALOR UNITARIO", "VALOR TOTAL");
			System.out.println();
			System.out.println("------------------------------------------------------------------------");
			System.out.println("------------------------------------------------------------------------");
			System.out.format("%20s", n.listaItensCompra);
			System.out.println();
			System.out.println("------------------------------------------------------------------------");
			
	
	}
}
