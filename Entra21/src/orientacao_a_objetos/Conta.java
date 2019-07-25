package orientacao_a_objetos;

public class Conta {
	int IDConta;
	double Saldo, Limite = 100.00;
	Agencia agencia;
	String extrato = "";
	
	public void Deposito (double valor) {
		this.Saldo += valor;
		this.extrato += "deposito + R$" + valor + "\n";
	}
	
	public void Saque (double valor) {
		this.Saldo -= valor;
		this.extrato += "saque - R$" + valor + "\n";
	}
	
	public String GetExtrato () {
		return this.extrato;
	}

	public double getSaldo() {
		return this.Saldo;
	}

	
			
}
