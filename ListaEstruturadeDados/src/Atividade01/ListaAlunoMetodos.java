package Atividade01;

public class ListaAlunoMetodos {

	private NomeAluno inicio;

	public ListaAlunoMetodos() {
		inicio = null;
	}

	// Adiciona aluno ao final da lista
	public void AdicionaFinal(Aluno aluno) {
		if (inicio == null) {
			NomeAluno n = new NomeAluno(aluno);
			inicio = n;
		} else {
			NomeAluno aux = inicio;
			while (aux.prox != null) {
				aux = aux.prox;
			}
			NomeAluno n = new NomeAluno(aluno);
			aux.prox = n;
		}
	}

	// Adiciona aluno ao inicio da lista
	public void AdicionaInicio(Aluno aluno) {
		NomeAluno n = new NomeAluno(aluno);
		n.prox = inicio;
		inicio = n;
	}

	// Remove aluno do final da lista
	public Aluno RemoveFinal() {
		Aluno r = null;
		if (inicio == null) {
			System.out.println("Lista Vazia");
		} else {
			if (inicio.prox == null) {
				r = inicio.aluno;
				inicio = null;
			} else {
				NomeAluno aux1 = inicio;
				NomeAluno aux2 = inicio;

				while (aux1.prox != null) {
					aux2 = aux1;
					aux1 = aux1.prox;
				}
				r = aux1.aluno;
				aux2.prox = null;
			}
		}
		return r;
	}

	
	//Escolhe posicao para adicionar 
	public void escolhePosicao(Aluno aluno, int pos) {
		NomeAluno Novo = new NomeAluno(aluno);

		if (pos == 1) {
			AdicionaInicio(aluno);
		} else {
			NomeAluno aux = inicio;
			int count = 1;

			while (aux.prox != null && count < pos - 1) {
				aux = aux.prox;
				count++;
			}

			if (count == pos - 1) {
				Novo.prox = aux.prox;
				aux.prox = Novo;
			} else {
				System.out.println("Posição Inválida!");
			}
		}
	}
	
	// Remove aluno do inicio da fila
	public Aluno RemoveInicio() {
		Aluno r = null;
		if (inicio==null){
			System.out.println("Lista Vázia");
		}
		else{
			r=inicio.aluno;
			inicio=inicio.prox;
		}
		return r;
	}
	
	
	// Escolhe a posicao para remover
	public Aluno escolheRemove(int pos) {
        Aluno e = null;
        int i=1;
        NomeAluno aux=inicio;
        	        
        if(inicio==null){
            System.out.println("Lista Vazia!");
            return e;
        }    
        if(pos==1){
            e = RemoveInicio();
            return e;
        }else{           
            while(aux.prox!=null){
                aux=aux.prox;
                i++;
            }
            if(pos>i || pos==0){
                System.out.println("Posição Invalida!");
                return e;
            }else if(pos==i){
                e=RemoveFinal();
                return e;
            }else{
                aux=inicio;
                NomeAluno aux2=aux;
                
                while(pos>1){
                    aux2=aux;
                    aux=aux.prox;
                    pos--;
                }
                e=aux.aluno;
                aux2.prox=aux.prox;
                return e;
            }
        }        
    }
	
	// Percorre a lista
	public String percorre(){
		NomeAluno aux=inicio;
		String r=" ";
		while(aux!=null){
			r=r+"\n"+aux.aluno.getNomeAluno();
			aux=aux.prox;
		}
		return r;
	}

}
