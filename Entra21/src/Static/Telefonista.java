package Static;

public class Telefonista extends Funcionario{
	private String CodEstacaoTrabalho;

	public String getCodEstacaoTrabalho() {
		return CodEstacaoTrabalho;
	}

	public void setCodEstacaoTrabalho(String codEstacaoTrabalho) {
		CodEstacaoTrabalho = codEstacaoTrabalho;
	}
	
	public String DadosFuncionario () {
		String Dados;
		Dados = super.DadosFuncionario() + ", C�digo de esta��o de trabalho: " + this.CodEstacaoTrabalho;
		return Dados;
	}
}
