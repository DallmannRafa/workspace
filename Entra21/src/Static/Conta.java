package Static;

public class Conta {
	private static int Contador = 0;
	private int IDConta;
	
	Conta () {
		Contador++;
		this.IDConta = Contador;
	}
	
	public static int getContador() {
		return Contador;
	}

	public static void setContador(int contador) {
		Contador = contador;
	}

	public int getIDConta() {
		return IDConta;
	}

	public void setIDConta(int iDConta) {
		IDConta = iDConta;
	}

	static public String ZeraContador () {
		String ContasCriadas;
		ContasCriadas = "Havia na contagem " + Contador + " contas contadas.";
		Contador = 0;
		return ContasCriadas;
	}
	
}
