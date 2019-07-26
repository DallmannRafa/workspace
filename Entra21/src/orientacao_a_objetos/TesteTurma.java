package orientacao_a_objetos;

public class TesteTurma {

	public static void main(String[] args) {
		
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
		
		System.out.println(T1.getSigla() + " / " + T1.getPeriodo() + " / " + T1.getTipoEnsino() + " / " + T1.getSerie());
		System.out.println(T2.getSigla() + " / " + T2.getPeriodo() + " / " + T2.getTipoEnsino() + " / " + T2.getSerie());

	}

}
