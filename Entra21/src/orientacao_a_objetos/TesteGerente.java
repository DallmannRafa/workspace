package orientacao_a_objetos;

public class TesteGerente {

	public static void main(String[] args) {
		
		Gerente G1 = new Gerente();
		
		G1.Salario = 3000;
		
		System.out.println(G1.Salario);
		
		G1.AumentaSalario();
		System.out.println(G1.Salario);
		
		G1.AumentaSalarioTaxa(50);
		System.out.println(G1.Salario);

	}

}
