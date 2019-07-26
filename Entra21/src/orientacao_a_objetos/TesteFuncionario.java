package orientacao_a_objetos;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario F1 = new Funcionario();
		Funcionario F2 = new Funcionario();
		
		F1.setNomeFuncionario("José");
		F1.setSalario(2399.99);
		
		F2.setNomeFuncionario("Ailton");
		F2.setSalario(1459.90);
		
		System.out.println(F1.getNomeFuncionario() + " / " + F1.getSalario());
		System.out.println(F2.getNomeFuncionario() + " / " + F2.getSalario());
		
		F1.AumentaSalario(255.99);
		F2.AumentaSalario(1009.90);
		
		System.out.println(F1.GetDadosFuncionario());
		System.out.println(F2.GetDadosFuncionario());
	}

}
