package Static;

public class Funcionario {
	double ValeRefDiario;
	
	public void ReajusteVale (double taxa) {
		this.ValeRefDiario += this.ValeRefDiario * (taxa / 100);
	}
}
