package Atividade01;

public class Aluno {

	private int ra;
	private String nomeAluno;
	private String turmaAluno;
	private String semestreAluno;

	// metodo dados do aluno
	public Aluno(int ra, String nomeAluno, String turmaAluno, String semestreAluno) {
		this.ra = ra;
		this.nomeAluno = nomeAluno;
		this.turmaAluno = turmaAluno;
		this.semestreAluno = semestreAluno;
	}

	public int getra() {
		return ra;
	}

	public void setra(int ra) {
		this.ra = ra;
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nome) {
		this.nomeAluno = nome;
	}

	public String getTurmaAluno() {
		return turmaAluno;
	}

	public void setTurmaAluno(String turma) {
		this.turmaAluno = turma;
	}

	public String getSemestreAluno() {
		return semestreAluno;
	}

	public void setSemestreAluno(String semestre) {
		this.semestreAluno = semestre;
	}

}
