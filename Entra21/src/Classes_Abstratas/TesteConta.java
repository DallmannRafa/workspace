package Classes_Abstratas;

public class TesteConta {

	public static void main(String[] args) {
		
		ContaPoupanca C1 = new ContaPoupanca();
		
		C1.setIDConta(83);
		C1.Deposito(1500);
		C1.Saque(300);
		C1.Deposito(400);
		C1.Saque(700);
		
		System.out.println(C1.ImprimeExtrato());
	}

}
