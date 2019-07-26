package Classes_Abstratas;

public abstract class Conta {
	private int IDConta;
	private String Extrato = "";

	public int getIDConta() {
		return IDConta;
	}

	public void setIDConta(int iDConta) {
		IDConta = iDConta;
	}
	
	public String getExtrato() {
		return Extrato;
	}

	public void setExtrato(String extrato) {
		Extrato = extrato;
	}

	public abstract String ImprimeExtrato();
	
}
