package orientacao_a_objetos;

public class Conta {
	private int IDConta;
	private double Saldo, Limite = 100.00;
	private Agencia agencia;
	private String extrato = "";
	
	Conta (Agencia agencia) {
		this.agencia = agencia;
	}
	
	public int getIDConta() {
		return IDConta;
	}

	public void setIDConta(int iDConta) {
		IDConta = iDConta;
	}

	public double getLimite() {
		return Limite;
	}

	public void setLimite(double limite) {
		Limite = limite;
	}

	public Agencia getAgencia() {
		return agencia;
	}

	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}

	public String getExtrato() {
		return extrato;
	}

	public void setExtrato(String extrato) {
		this.extrato = extrato;
	}

	public void setSaldo(double saldo) {
		Saldo = saldo;
	}

	public void Deposito (double valor) {
		this.Saldo += valor;
		this.extrato += "deposito + R$" + valor + "\n";
	}
	
	public void Saque (double valor) {
		this.Saldo -= valor;
		this.extrato += "saque - R$" + valor + "\n";
	}
	
	public String GetExtrato () {
		return this.extrato + "Saldo: R$" + this.Saldo;
	}

	public double getSaldo() {
		return this.Saldo;
	}

	public void Transferencia (Conta ContaDestino, int Valor) {
		this.Saldo -= Valor;
		ContaDestino.Saldo += Valor;
	}
			
}
