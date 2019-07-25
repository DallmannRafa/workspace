package orientacao_a_objetos;

public class TesteConta {

	public static void main(String[] args) {
		
		
		Agencia A1 = new Agencia(2);
		Agencia A2 = new Agencia(3);
		Conta C1 = new Conta(A2);
		Conta C2 = new Conta(A1);
		
		A1.IDAgencia = 73;
		A2.IDAgencia = 84;
		
		C1.IDConta = 153235;
		C1.Limite = 3000.00;
		C1.Saldo = 2399.99;
		
		C2.IDConta = 194305;
		C2.Limite = 4000.00;
		C2.Saldo = 1599.99;
		
		System.out.println(C1.IDConta + " / " + C1.Saldo + " / " + C1.Limite + " / " + C1.agencia.IDAgencia);
		System.out.println(C2.IDConta + " / " + C2.Saldo + " / " + C2.Limite + " / " + C2.agencia.IDAgencia);
		
		C1.Deposito(209.99);
		C2.Deposito(1555.90);
		
		System.out.println(C1.getSaldo());
		System.out.println(C2.getSaldo());
		
		C1.Saque(508.45);
		C2.Saque(233.67);
		
		System.out.println(C1.getSaldo());
		System.out.println(C2.getSaldo());
				
		System.out.println(C1.GetExtrato());
		System.out.println(C2.GetExtrato());
		
		C1.Transferencia(C2, 300);
		
		System.out.println(C1.getSaldo());
		System.out.println(C2.getSaldo());
	}

}
