package orientacao_a_objetos;

public class TesteAgencia {

	public static void main(String[] args) {
		
		Agencia A1 = new Agencia(4);
		Agencia A2 = new Agencia(3);
		
		A1.IDAgencia = 25;
		A2.IDAgencia = 75;
		
		System.out.println(A1.IDAgencia);
		System.out.println(A2.IDAgencia);
		
	}

}
