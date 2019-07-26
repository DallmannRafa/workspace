package orientacao_a_objetos;

public class CartaoDeCredito {
	private int IDCartao, NumCartao;
	private String ValidadeCartao;
	private Cliente cliente;
	
	CartaoDeCredito (int num) {
		
		this.NumCartao = num;
	}

	public int getIDCartao() {
		return IDCartao;
	}

	public void setIDCartao(int iDCartao) {
		IDCartao = iDCartao;
	}

	public int getNumCartao() {
		return NumCartao;
	}

	public void setNumCartao(int numCartao) {
		NumCartao = numCartao;
	}

	public String getValidadeCartao() {
		return ValidadeCartao;
	}

	public void setValidadeCartao(String validadeCartao) {
		ValidadeCartao = validadeCartao;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
}
