package aulas.Aula1;

public class Principal {

	public static void main(String[] args) {

		AlunoSuperior aluno = new AlunoSuperior();
		//aluno.nome = "Lucas";
		aluno.setNome("Lucas");
		aluno.setTeste(2);
		aluno.setProva(10);
		
		
		System.out.println(aluno.getNome() + ":" + aluno.getMedia());
		

	}

}
