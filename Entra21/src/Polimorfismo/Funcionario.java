package Polimorfismo;

public class Funcionario {
	private String IDFuncionario, RegistroPonto = "";

	public String getIDFuncionario() {
		return IDFuncionario;
	}

	public String getRegistroPonto() {
		return RegistroPonto;
	}

	public void setRegistroPonto(String registroPonto) {
		RegistroPonto = registroPonto;
	}

	public void setIDFuncionario(String iDFuncionario) {
		IDFuncionario = iDFuncionario;
	}
}
