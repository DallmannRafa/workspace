package Interfaces;

public class Conta {
	private double Saldo;
	private String Extrato = "";
	
	public double getSaldo() {
		return Saldo;
	}
	public void setSaldo(double saldo) {
		Saldo = saldo;
	}
	public String getExtrato() {
		return Extrato;
	}
	public void setExtrato(String extrato) {
		Extrato = extrato;
	}
}
