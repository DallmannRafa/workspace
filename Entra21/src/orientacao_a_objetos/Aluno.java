package orientacao_a_objetos;

public class Aluno {
	private String NomeAluno, DTNascAluno;
	private int RGAluno;
	private Turma turma;
	public String getNomeAluno() {
		return NomeAluno;
	}
	public void setNomeAluno(String nomeAluno) {
		NomeAluno = nomeAluno;
	}
	public String getDTNascAluno() {
		return DTNascAluno;
	}
	public void setDTNascAluno(String dTNascAluno) {
		DTNascAluno = dTNascAluno;
	}
	public int getRGAluno() {
		return RGAluno;
	}
	public void setRGAluno(int rGAluno) {
		RGAluno = rGAluno;
	}
	public Turma getTurma() {
		return turma;
	}
	public void setTurma(Turma turma) {
		this.turma = turma;
	}
}
