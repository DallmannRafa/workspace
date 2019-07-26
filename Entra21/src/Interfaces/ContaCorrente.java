package Interfaces;

public class ContaCorrente extends Conta implements interfaceConta{

	
	public void Deposita(double Valor) {
		this.setSaldo(this.getSaldo() + Valor);
		this.setExtrato(this.getExtrato() + "Deposito - Valor: R$" + Valor + "\n");
	}

	
	public void Saca(double Valor) {
		this.setSaldo(this.getSaldo() - Valor);
		this.setExtrato(this.getExtrato() + "Saque - Valor: R$" + Valor + "\n");
	}

}
