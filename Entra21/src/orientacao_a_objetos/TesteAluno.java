package orientacao_a_objetos;

public class TesteAluno {

	public static void main(String[] args) {
		
		Aluno A1 = new Aluno();
		Aluno A2 = new Aluno();
		
		A1.DTNascAluno = "23/12/2000";
		A1.NomeAluno = "Pedro";
		A1.RGAluno = 9347283;
		
		A2.DTNascAluno = "13/07/1998";
		A2.NomeAluno = "Otávio";
		A2.RGAluno = 7238943;
		
		System.out.println(A1.NomeAluno + " / " + A1.DTNascAluno + " / " + A1.RGAluno);
		System.out.println(A2.NomeAluno + " / " + A2.DTNascAluno + " / " + A2.RGAluno);

	}

}
