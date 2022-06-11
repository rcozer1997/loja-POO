package loja;
import java.util.ArrayList;

public class NotaFiscal {
	int codigo;
	Cliente comprador;
	String data, metodoPagamento;
	ArrayList<ItemCompra> listaItensCompra = new ArrayList<>();
	
	public NotaFiscal(String cpf_comprador, String metodoPagamento) {
		super();
		this.comprador.cpf = cpf_comprador;
		this.metodoPagamento = metodoPagamento;
	}

	@Override
	public String toString() {
		return "NotaFiscal [codigo=" + codigo + ", data=" + data + ", metodoPagamento=" + metodoPagamento
				+ ", listaItensCompra=" + listaItensCompra + "]";
	}
	
	public int getCodigo() {
		return this.codigo;
	}
}
