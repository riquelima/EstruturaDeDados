package Lista05;

public class NO {
	
	public Curso dados;
	public NO proximo;
	public NO anterior;
	
	public NO(Curso curso) {
		dados = curso;
		proximo = null;
		anterior = null;
	}

}
