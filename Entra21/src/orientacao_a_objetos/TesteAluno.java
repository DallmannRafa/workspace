package orientacao_a_objetos;

public class TesteAluno {

	public static void main(String[] args) {
		
		Aluno A1 = new Aluno();
		Aluno A2 = new Aluno();
		Turma T1 = new Turma();
		Turma T2 = new Turma();
		
		T1.setPeriodo("Matutino");
		T1.setSerie(6);
		T1.setSigla("OP");
		T1.setTipoEnsino("Fundamental");
		
		T2.setPeriodo("Noturno");
		T2.setSerie(3);
		T2.setSigla("OF");
		T2.setTipoEnsino("Médio");
		
		A1.setDTNascAluno("23/12/2000");
		A1.setNomeAluno("Pedro");
		A1.setRGAluno(9347283);
		A1.setTurma(T1);
		
		A2.setDTNascAluno("13/07/1998");
		A2.setNomeAluno("Otávio");
		A2.setRGAluno(7238943);
		A2.setTurma(T2);
		
		
		System.out.println(A1.getNomeAluno() + " / " + A1.getDTNascAluno() + " / " + A1.getRGAluno() + "\n" + 
						   A1.getTurma().getPeriodo() + " / " + A1.getTurma().getTipoEnsino() + " / " + A1.getTurma().getSerie() + " / " + A1.getTurma().getSigla());
		System.out.println(A2.getNomeAluno() + " / " + A2.getNomeAluno() + " / " + A2.getRGAluno() + "\n" + 
						   A2.getTurma().getPeriodo() + " / " + A2.getTurma().getTipoEnsino() + " / " + A2.getTurma().getSerie() + " / " + A2.getTurma().getSigla());

	}

}
