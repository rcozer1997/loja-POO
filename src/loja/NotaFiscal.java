package loja;
import java.util.ArrayList;
import java.util.Date;
public class NotaFiscal {
	int codigo;
	Cliente comprador;
	Date data;
	String metodoPagamento;
	ArrayList<ItemCompra> listaItensCompra = new ArrayList<>();
	
	public NotaFiscal(Cliente comprador, String metodoPagamento, Date data) {
		super();
		this.comprador = comprador;
		this.metodoPagamento = metodoPagamento;
		this.data  = data;
	}

	@Override
	public String toString() {
		return "NotaFiscal [codigo=" + codigo + ", data=" + data + ", metodoPagamento=" + metodoPagamento
				+ ", listaItensCompra=" + listaItensCompra + "]";
	}
	
	public int getCodigo() {
		return this.codigo;
	}
	
	public String getCompradorNome() {
		return comprador.getNome();
	}
	
	
	void adicionarItem(ItemCompra item) {
		listaItensCompra.add(item);
	}
	

	/*
	double custoTotal() {
		
	}
	*/
	
}
