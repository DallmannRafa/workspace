package orientacao_a_objetos;

import Util.Teclado;

public class TesteFuncionario2 {

	public static void main(String[] args) {
		int escolha = 0;
		Funcionario F1 = new Funcionario();
			
		F1.NomeFuncionario = Teclado.lerTexto("Informe o nome do funionário:");
		
		while (escolha != 4) {
			escolha = Teclado.lerInt("Alterar o nome (1) \nAlterar salário (2) \nVisualizar dados (3) \nSair (4)");
			
			if (escolha == 1) {
				F1.NomeFuncionario = Teclado.lerTexto("Informe o nome do funionário:");
			} else if (escolha == 2) {
				F1.Salario = Teclado.lerDouble("Informe o salário");
			} else if (escolha == 3) {
				System.out.println(F1.NomeFuncionario + " / " + F1.Salario);
			}
		}
		

	}

}
