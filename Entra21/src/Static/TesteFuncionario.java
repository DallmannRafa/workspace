package Static;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario F1 = new Funcionario();
		F1.ValeRefDiario = 12.56;
		System.out.println(F1.ValeRefDiario);
		
		F1.ReajusteVale(50);
		System.out.println(F1.ValeRefDiario);

	}

}
