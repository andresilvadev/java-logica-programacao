package algoritmosavancados;

public class AlgoritmoAvancado {

	public static void main(String[] args) {
		
		ListaAlunos listaAlunos = new ListaAlunos();
		
		Aluno aluno = new Aluno();
		aluno.nome = "Jon";		
		listaAlunos.adicionar(aluno);
		
		Aluno aluno2 = new Aluno();
		aluno2.nome = "Sansa";		
		listaAlunos.adicionar(aluno2);
		
		Aluno aluno3 = new Aluno();
		aluno3.nome = "Brandon";		
		listaAlunos.adicionar(aluno3);
		
		Aluno aluno4 = new Aluno();
		aluno4.nome = "Arya";		
		
		listaAlunos.adicionar(aluno4);		
		iterar(listaAlunos);		
		
		
		listaAlunos.ordenar();
		iterar(listaAlunos);		
	
		
		listaAlunos.remover(aluno3);
		iterar(listaAlunos);
	}
	
	static void iterar(ListaAlunos listaAlunos) {
		for(int i = 0; i < listaAlunos.tamanho(); i ++) {
			Aluno a = listaAlunos.obter(i);
			if(a != null) {
				System.out.println("Aluno: " + a.nome);	
			}else {
				System.out.println("Aluno: Sem nome");
			}
		}
		System.out.println("---------------------------------");
	}

}
