package orientacao_a_objetos;

public class TesteTurma {

	public static void main(String[] args) {
		
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
		
		System.out.println(T1.Sigla + " / " + T1.Periodo + " / " + T1.TipoEnsino + " / " + T1.Serie);
		System.out.println(T2.Sigla + " / " + T2.Periodo + " / " + T2.TipoEnsino + " / " + T2.Serie);

	}

}
