package orientacao_a_objetos;

public class TesteAluno {

	public static void main(String[] args) {
		
		Aluno A1 = new Aluno();
		Aluno A2 = new Aluno();
		Turma T1 = new Turma();
		Turma T2 = new Turma();
		
		T1.Periodo = "Matutino";
		T1.Serie = 6;
		T1.Sigla = "OP";
		T1.TipoEnsino = "Fundamental";
		
		T2.Periodo = "Noturno";
		T2.Serie = 3;
		T2.Sigla = "OF";
		T2.TipoEnsino = "Médio";
		
		A1.DTNascAluno = "23/12/2000";
		A1.NomeAluno = "Pedro";
		A1.RGAluno = 9347283;
		A1.turma = T1;
		
		A2.DTNascAluno = "13/07/1998";
		A2.NomeAluno = "Otávio";
		A2.RGAluno = 7238943;
		A2.turma = T2;
		
		System.out.println(A1.NomeAluno + " / " + A1.DTNascAluno + " / " + A1.RGAluno + "\n" + 
						   A1.turma.Periodo + " / " + A1.turma.TipoEnsino + " / " + A1.turma.Serie + " / " + A1.turma.Sigla);
		System.out.println(A2.NomeAluno + " / " + A2.DTNascAluno + " / " + A2.RGAluno + "\n" + 
						   A2.turma.Periodo + " / " + A2.turma.TipoEnsino + " / " + A2.turma.Serie + " / " + A2.turma.Sigla);

	}

}
