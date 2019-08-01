package Testes;

public class TesteException {

	public static void main(String[] args) throws Exception{
		
		int valor = -10;
		
		if (valor < 0) {
			Exception erro = new Exception();
			throw erro;
		} else {
			System.out.println("ola");
		}

	}

}
