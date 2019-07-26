package Static;

public class Funcionario {
	private double ValeRefDiario;
	
	public double getValeRefDiario() {
		return ValeRefDiario;
	}

	public void setValeRefDiario(double valeRefDiario) {
		ValeRefDiario = valeRefDiario;
	}

	public void ReajusteVale (double taxa) {
		this.ValeRefDiario += this.ValeRefDiario * (taxa / 100);
	}
}
