package Interfaces;

public class TesteConta {

	public static void main(String[] args) {
		ContaCorrente CC1 = new ContaCorrente();
		ContaPoupanca CP1 = new ContaPoupanca();
		
		GeradorExtrato extrato = new GeradorExtrato();
		
		CC1.Deposita(3000);
		CC1.Deposita(111.11);
		CC1.Saca(1255.99);
		
		CP1.Deposita(5999.99);
		CP1.Saca(12.55);
		CP1.Saca(2499.99);
		
		System.out.println(extrato.GeraExtrato(CC1));
		System.out.println(extrato.GeraExtrato(CP1));

	}

}
