package algoritmosavancados;

public class AlgoritmoAvancado {

	public static void main(String[] args) {
		
		ListaAlunos lista = new ListaAlunos();
		
		Aluno aluno = new Aluno();
		aluno.nome = "Jon";		
		lista.adicionar(aluno);
		
		Aluno aluno2 = new Aluno();
		aluno2.nome = "Sansa";		
		lista.adicionar(aluno2);
		
		Aluno aluno3 = new Aluno();
		aluno3.nome = "Brandon";		
		lista.adicionar(aluno3);
		
		Aluno aluno4 = new Aluno();
		aluno4.nome = "Arya";		
		lista.adicionar(aluno4);
		
		for(int i = 0; i < lista.tamanho(); i ++) {
			Aluno a = lista.obter(i);
			if(a != null) {
				System.out.println("Aluno: " + a.nome);	
			}else {
				System.out.println("Aluno: Sem nome");
			}
			
		}
		
		System.out.println("---------------------------------");
		
		lista.remover(aluno3);
		
		for(int i = 0; i < lista.tamanho(); i ++) {
			Aluno a = lista.obter(i);
			if(a != null) {
				System.out.println("Aluno: " + a.nome);	
			}else {
				System.out.println("Aluno: Sem nome");
			}
		}
	}

}
