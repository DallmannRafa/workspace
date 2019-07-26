package orientacao_a_objetos;

public class TesteCartaoDeCredito {

	public static void main(String[] args) {
		
		CartaoDeCredito Ca1 = new CartaoDeCredito(5);
		CartaoDeCredito Ca2 = new CartaoDeCredito(4);
		Cliente Cl1 = new Cliente();
		Cliente Cl2 = new Cliente();
		
		Cl1.setNome("Vitor");
		Cl2.setNome("Alberto");
		
		Ca1.setIDCartao(425);
		Ca1.setValidadeCartao("03/25");
		Ca1.setCliente(Cl1);
		
		Ca2.setIDCartao(734);
		Ca2.setValidadeCartao("06/23");
		Ca2.setCliente(Cl2);
		
		System.out.println(Ca1.getIDCartao() + " / " + Ca1.getValidadeCartao() + " / " + Ca1.getCliente().getNome());
		System.out.println(Ca2.getIDCartao() + " / " + Ca2.getValidadeCartao() + " / " + Ca2.getCliente().getNome());
	}

}
