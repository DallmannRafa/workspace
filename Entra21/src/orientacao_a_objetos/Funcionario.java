package orientacao_a_objetos;

public class Funcionario {
	
	String NomeFuncionario;
	double Salario;

	public void AumentaSalario (double acrescimo) {
		this.Salario += acrescimo;
	}
	
	public String GetDadosFuncionario () {
		String dados;
		dados = "Nome: " + this.NomeFuncionario + "\nSal�rio: R$" + this.Salario;
		return dados;
	}
	
}
