package orientacao_a_objetos;

public class Agencia {
	private int IDAgencia, numAgencia;
	
	Agencia (int num) {
		
	this.numAgencia = num;
	}

	public int getIDAgencia() {
		return IDAgencia;
	}

	public void setIDAgencia(int iDAgencia) {
		IDAgencia = iDAgencia;
	}

	public int getNumAgencia() {
		return numAgencia;
	}

	public void setNumAgencia(int numAgencia) {
		this.numAgencia = numAgencia;
	}
	
}
