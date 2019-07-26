package Static;

public class Gerente extends Funcionario{
	private String NomeUsuario, Senha;

	public String getNomeUsuario() {
		return NomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		NomeUsuario = nomeUsuario;
	}

	public String getSenha() {
		return Senha;
	}

	public void setSenha(String senha) {
		Senha = senha;
	}
	
	public double BonificacaoSalario () {
		double Bonificacao;
		Bonificacao = this.getSalario() * 0.2;
		this.setSalario(Bonificacao + this.getSalario());
		return Bonificacao;
	}
	
	public String DadosFuncionario () {
		String Dados;
		Dados = super.DadosFuncionario() + ", Usuário: " + this.NomeUsuario + ", Senha: " + this.Senha;
		return Dados;
	}
}
