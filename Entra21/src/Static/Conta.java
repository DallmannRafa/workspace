package Static;

public class Conta {
	static int Contador = 0;
	int IDConta;
	
	Conta () {
		Contador++;
		this.IDConta = Contador;
	}
	
	static public String ZeraContador () {
		String ContasCriadas;
		ContasCriadas = "Havia na contagem " + Contador + " contas contadas.";
		Contador = 0;
		return ContasCriadas;
	}
	
}
