package orientacao_a_objetos;

public class TesteConta {

	public static void main(String[] args) {
		
		Conta C1 = new Conta();
		Conta C2 = new Conta();
		Agencia A1 = new Agencia();
		Agencia A2 = new Agencia();
		
		A1.IDAgencia = 73;
		A2.IDAgencia = 84;
		
		C1.IDConta = 153235;
		C1.Limite = 3000.00;
		C1.Saldo = 2399.99;
		C1.agencia = A2;
		
		C2.IDConta = 194305;
		C2.Limite = 4000.00;
		C2.Saldo = 1599.99;
		C2.agencia = A1;
		
		System.out.println(C1.IDConta + " / " + C1.Saldo + " / " + C1.Limite + " / " + C1.agencia.IDAgencia);
		System.out.println(C2.IDConta + " / " + C2.Saldo + " / " + C2.Limite + " / " + C2.agencia.IDAgencia);
	}

}
