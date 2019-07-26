package Classes_Abstratas;

public class Gerente extends Funcionario{
	
	public double Bonificacao() {
		double Bonificacao;
		Bonificacao = this.getSalario() * 0.1;
		this.setSalario(this.getSalario() + Bonificacao);
		return Bonificacao;
	}

}
