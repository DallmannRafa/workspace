package Classes_Abstratas;

public class TesteFuncionario {

	public static void main(String[] args) {

		Funcionario F1 = new Gerente();
		
		F1.setNome("Pedro");
		F1.setSalario(2500.01);

		System.out.println(F1.Bonificacao());
	}

}
