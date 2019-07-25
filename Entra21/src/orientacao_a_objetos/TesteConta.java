package orientacao_a_objetos;

public class TesteConta {

	public static void main(String[] args) {
		
		Conta C1 = new Conta();
		Conta C2 = new Conta();
		
		C1.IDConta = 153235;
		C1.Limite = 3000.00;
		C1.Saldo = 2399.99;
		
		C2.IDConta = 194305;
		C2.Limite = 4000.00;
		C2.Saldo = 1599.99;
		
		System.out.println(C1.IDConta + " / " + C1.Saldo + " / " + C1.Limite);
		System.out.println(C2.IDConta + " / " + C2.Saldo + " / " + C2.Limite);
	}

}
