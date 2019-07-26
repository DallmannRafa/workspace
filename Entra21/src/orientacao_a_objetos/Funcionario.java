package orientacao_a_objetos;

public class Funcionario {
	
	private String NomeFuncionario;
	private double Salario = 1000;

	public String getNomeFuncionario() {
		return NomeFuncionario;
	}

	public void setNomeFuncionario(String nomeFuncionario) {
		NomeFuncionario = nomeFuncionario;
	}

	public double getSalario() {
		return Salario;
	}

	public void setSalario(double salario) {
		Salario = salario;
	}

	public void AumentaSalario (double acrescimo) {
		this.Salario += acrescimo;
	}
	
	public String GetDadosFuncionario () {
		String dados;
		dados = "Nome: " + this.NomeFuncionario + "\nSalário: R$" + this.Salario;
		return dados;
	}
	
}
