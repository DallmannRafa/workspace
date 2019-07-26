package Static;

public class Funcionario {
	private double ValeRefDiario, Salario;
	private String Nome;
	
	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public double getSalario() {
		return Salario;
	}

	public void setSalario(double salario) {
		Salario = salario;
	}

	public double getValeRefDiario() {
		return ValeRefDiario;
	}

	public void setValeRefDiario(double valeRefDiario) {
		ValeRefDiario = valeRefDiario;
	}

	public void ReajusteVale (double taxa) {
		this.ValeRefDiario += this.ValeRefDiario * (taxa / 100);
	}
	
	public double BonificacaoSalario () {
		double Bonificacao;
		Bonificacao = this.Salario * 0.1;
		this.Salario += Bonificacao;
		return Bonificacao;
	}
	
	public String DadosFuncionario () {
		String Dados;
		Dados = "Nome: " + this.getNome() + ", Salario: R$" + this.getSalario() + ", Bonificação: R$" + this.BonificacaoSalario();
		return Dados;
	}
}
