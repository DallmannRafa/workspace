package Static;

public class TesteConta {

	public static void main(String[] args) {
		
		System.out.println(Conta.getContador());
		Conta C1 = new Conta();
		System.out.println(Conta.getContador());
		Conta C2 = new Conta();
		System.out.println(Conta.getContador());
		
		System.out.println(C2.getIDConta());
		System.out.println(C1.getIDConta());
		
		System.out.println(Conta.ZeraContador());

	}

}
