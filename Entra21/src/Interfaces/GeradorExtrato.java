package Interfaces;

public class GeradorExtrato {
	
	public String GeraExtrato (Conta conta) {
		String Dados;
		Dados = "EXTRATO\n" + conta.getExtrato() + "Saldo: R$" + conta.getSaldo();
		return Dados;
	}

}
