package Static;

public class Secretaria extends Funcionario{
	private int NumRamal;

	public int getNumRamal() {
		return NumRamal;
	}

	public void setNumRamal(int numRamal) {
		NumRamal = numRamal;
	}
	
	public String DadosFuncionario () {
		String Dados;
		Dados = super.DadosFuncionario() + ", Ramal: " + this.NumRamal;
		return Dados;
	}
}
