package orientacao_a_objetos;

public class Gerente {
	double Salario;
	
	public void AumentaSalario () {
		this.Salario += this.Salario * 0.1;
	}
	
	public void AumentaSalarioTaxa (double taxa) {
		this.Salario += this.Salario * (taxa / 100);
	}
	
}
