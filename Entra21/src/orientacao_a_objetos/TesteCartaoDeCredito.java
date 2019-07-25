package orientacao_a_objetos;

public class TesteCartaoDeCredito {

	public static void main(String[] args) {
		
		CartaoDeCredito Ca1 = new CartaoDeCredito();
		CartaoDeCredito Ca2 = new CartaoDeCredito();
		Cliente Cl1 = new Cliente();
		Cliente Cl2 = new Cliente();
		
		Cl1.nome = "Vitor";
		Cl2.nome = "Alberto";
		
		Ca1.IDCartao = 425;
		Ca1.ValidadeCartao = "03/25";
		Ca1.cliente = Cl1;
		
		Ca2.IDCartao = 734;
		Ca2.ValidadeCartao = "06/23";
		Ca2.cliente = Cl2;
		
		System.out.println(Ca1.IDCartao + " / " + Ca1.ValidadeCartao + " / " + Ca1.cliente.nome);
		System.out.println(Ca2.IDCartao + " / " + Ca2.ValidadeCartao + " / " + Ca2.cliente.nome);
	}

}
