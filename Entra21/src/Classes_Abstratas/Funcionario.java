package Classes_Abstratas;

public abstract class Funcionario {
	private String Nome;
	private double Salario;
	
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
	
	public abstract double Bonificacao ();
	
	}
