package Static;

public class TesteFuncionarios {

	public static void main(String[] args) {
		
		Gerente G1 = new Gerente();
		Telefonista T1 = new Telefonista();
		Secretaria S1 = new Secretaria();
		
		G1.setSalario(3000.00);
		T1.setSalario(1500.00);
		S1.setSalario(1800.00);
		
		System.out.println(G1.BonificacaoSalario());
		System.out.println(T1.BonificacaoSalario());
		System.out.println(S1.BonificacaoSalario());
		

	}

}
