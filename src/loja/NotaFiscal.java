package loja;
import java.util.ArrayList;

public class NotaFiscal {
	int codigo;
	String data, metodoPagamento;
	ArrayList<ItemCompra> listaItensCompra = new ArrayList<>();
	
	public NotaFiscal(int codigo, String data, String metodoPagamento, ArrayList<ItemCompra> listaItensCompra) {
		super();
		this.codigo = codigo;
		this.data = data;
		this.metodoPagamento = metodoPagamento;
		this.listaItensCompra = listaItensCompra;
	}

	@Override
	public String toString() {
		return "NotaFiscal [codigo=" + codigo + ", data=" + data + ", metodoPagamento=" + metodoPagamento
				+ ", listaItensCompra=" + listaItensCompra + "]";
	}
	
	
}
