package orientacao_a_objetos;

public class TesteConta {

	public static void main(String[] args) {
		
		
		Agencia A1 = new Agencia(2);
		Agencia A2 = new Agencia(3);
		Conta C1 = new Conta(A2);
		Conta C2 = new Conta(A1);
		
		A1.setIDAgencia(73);
		A2.setIDAgencia(84);
		
		C1.setIDConta(153235);
		C1.setLimite(3000.00);
		C1.setSaldo(2399.99);
		
		C2.setIDConta(194305);
		C2.setLimite(4000.00);
		C2.setSaldo(1599.99);
		
		System.out.println(C1.getIDConta() + " / " + C1.getSaldo() + " / " + C1.getLimite() + " / " + C1.getAgencia().getIDAgencia());
		System.out.println(C2.getIDConta() + " / " + C2.getSaldo() + " / " + C2.getLimite() + " / " + C2.getAgencia().getIDAgencia());
		
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
