package Static;

public class TesteFuncionarios {

	public static void main(String[] args) {
		
		Gerente G1 = new Gerente();
		Telefonista T1 = new Telefonista();
		Secretaria S1 = new Secretaria();
		
		G1.setSalario(3000.00);
		T1.setSalario(1500.00);
		S1.setSalario(1800.00);
		
		G1.setNome("Mauricio");
		G1.setNomeUsuario("Mau");
		G1.setSenha("123456");
		
		T1.setNome("Maria");
		T1.setCodEstacaoTrabalho("f34");
		
		S1.setNome("Luana");
		S1.setNumRamal(4);
		
		System.out.println(G1.getSalario());
		System.out.println(T1.getSalario());
		System.out.println(S1.getSalario());
		
		System.out.println(G1.BonificacaoSalario());
		System.out.println(T1.BonificacaoSalario());
		System.out.println(S1.BonificacaoSalario());
		
		System.out.println(G1.getSalario());
		System.out.println(T1.getSalario());
		System.out.println(S1.getSalario());
		
		System.out.println(G1.DadosFuncionario());
		System.out.println(T1.DadosFuncionario());
		System.out.println(S1.DadosFuncionario());
		
	}

}
