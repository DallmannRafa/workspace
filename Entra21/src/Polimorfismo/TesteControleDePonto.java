package Polimorfismo;

public class TesteControleDePonto {

	public static void main(String[] args) {
		
		Funcionario G1 = new Gerente();
		Funcionario T1 = new Telefonista();
		ControleDePonto ControlePonto = new ControleDePonto();
		
		G1.setIDFuncionario("123");
		T1.setIDFuncionario("567");
		
		ControlePonto.registroEntrada(G1);
		ControlePonto.registroEntrada(T1);
		
		System.out.println(G1.getRegistroPonto());
		System.out.println(T1.getRegistroPonto());

		ControlePonto.registroSaida(G1);
		ControlePonto.registroSaida(T1);
		
		System.out.println(G1.getRegistroPonto());
		System.out.println(T1.getRegistroPonto());
	}

}
