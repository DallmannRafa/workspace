package Static;

public class TesteConta {

	public static void main(String[] args) {
		
		System.out.println(Conta.Contador);
		Conta C1 = new Conta();
		System.out.println(Conta.Contador);
		Conta C2 = new Conta();
		System.out.println(Conta.Contador);
		
		System.out.println(C2.IDConta);
		System.out.println(C1.IDConta);
		
		System.out.println(Conta.ZeraContador());

	}

}
