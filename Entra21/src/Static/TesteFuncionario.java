package Static;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario F1 = new Funcionario();
		
		F1.setValeRefDiario(12.56);
		System.out.println(F1.getValeRefDiario());
		
		F1.ReajusteVale(50);
		System.out.println(F1.getValeRefDiario());

	}

}
