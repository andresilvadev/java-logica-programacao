package algoritmosavancados;

public class AlgoritmoAvancado {

	public static void main(String[] args) {
		
		ListaAlunos lista = new ListaAlunos();
		
		Aluno aluno = new Aluno();
		aluno.nome = "Jon";		
		lista.adicionar(aluno);
		
		aluno = new Aluno();
		aluno.nome = "Sansa";		
		lista.adicionar(aluno);
		
		aluno = new Aluno();
		aluno.nome = "Brandon";		
		lista.adicionar(aluno);
		
		aluno = new Aluno();
		aluno.nome = "Arya";		
		lista.adicionar(aluno);
		
		for(int i = 0; i < lista.tamanho(); i ++) {
			Aluno a = lista.obter(i);
			System.out.println("Aluno: " + a.nome);
		}
	}

}
