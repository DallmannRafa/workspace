package orientacao_a_objetos;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario F1 = new Funcionario();
		Funcionario F2 = new Funcionario();
		
		F1.NomeFuncionario = "José";
		F1.Salario = 2399.99;
		
		F2.NomeFuncionario = "Ailton";
		F2.Salario = 1459.90;
		
		System.out.println(F1.NomeFuncionario + " / " + F1.Salario);
		System.out.println(F2.NomeFuncionario + " / " + F2.Salario);
		
		F1.AumentaSalario(255.99);
		F2.AumentaSalario(1009.90);
		
		System.out.println(F1.GetDadosFuncionario());
		System.out.println(F2.GetDadosFuncionario());
	}

}
