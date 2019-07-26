package Classes_Abstratas;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ContaPoupanca extends Conta{
	private double Saldo;
	SimpleDateFormat hora = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	
	public double getSaldo() {
		return Saldo;
	}

	public void setSaldo(double saldo) {
		Saldo = saldo;
	}

	public String ImprimeExtrato() {
		String Dados;
		Dados = "EXTRATO DE CONTA \n" + this.getExtrato() + "Saldo: R$" + this.getSaldo();
		return Dados;
	}
	
	public void Deposito (double Valor) {
		Date agora = new Date();
		this.setExtrato(this.getExtrato() + "Data: " + hora.format(agora) + ", (Depósito) Valor: R$" + Valor + "\n");
		this.setSaldo(this.getSaldo() + Valor);
	}
	
	public void Saque (double Valor) {
		Date agora = new Date();
		this.setExtrato(this.getExtrato() + "Data: " + hora.format(agora) + ", (Saque) Valor: R$" + Valor + "\n");
		this.setSaldo(this.getSaldo() - Valor);
	}
}
