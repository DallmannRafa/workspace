package orientacao_a_objetos;

public class Conta {
	int IDConta;
	double Saldo, Limite = 100.00;
	Agencia agencia;
	String extrato = "";
	
	Conta (Agencia agencia) {
		this.agencia = agencia;
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
