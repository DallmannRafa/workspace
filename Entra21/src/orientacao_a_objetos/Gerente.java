package orientacao_a_objetos;

public class Gerente {
	private double Salario;
	
	public double getSalario() {
		return Salario;
	}

	public void setSalario(double salario) {
		Salario = salario;
	}

	public void AumentaSalario () {
		this.Salario += this.Salario * 0.1;
	}
	
	public void AumentaSalarioTaxa (double taxa) {
		this.Salario += this.Salario * (taxa / 100);
	}
	
}
