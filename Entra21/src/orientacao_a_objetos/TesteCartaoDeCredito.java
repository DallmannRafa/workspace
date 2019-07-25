package orientacao_a_objetos;

public class TesteCartaoDeCredito {

	public static void main(String[] args) {
		
		CartaoDeCredito Ca1 = new CartaoDeCredito();
		CartaoDeCredito Ca2 = new CartaoDeCredito();
		
		Ca1.IDCartao = 425;
		Ca1.ValidadeCartao = "03/25";
		
		Ca2.IDCartao = 734;
		Ca2.ValidadeCartao = "06/23";
		
		System.out.println(Ca1.IDCartao + " / " + Ca1.ValidadeCartao);
		System.out.println(Ca2.IDCartao + " / " + Ca2.ValidadeCartao);
	}

}
