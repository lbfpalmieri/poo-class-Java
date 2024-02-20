package classesAbstratas;

public class Principal {

	public static void main(String[] args) {
		
		AlunoEnsinoMedio alunoEnsinoMedio = new AlunoEnsinoMedio();
		AlunoEnsinoSuperior alunoEnsinoSuperior = new AlunoEnsinoSuperior();
		
		alunoEnsinoMedio.nome = "Lucas";
		alunoEnsinoMedio.teste = 8;
		alunoEnsinoMedio.prova = 9;
		
		System.out.println("Aluno do ensino medio");
		System.out.println("Nome: " + alunoEnsinoMedio.nome);
		System.out.println("Media: " + alunoEnsinoMedio.getMedia());
		
		alunoEnsinoSuperior.nome = "Cletin";
		alunoEnsinoSuperior.teste = 8;
		alunoEnsinoSuperior.prova = 9;
		
		System.out.println("Aluno do ensino Superior");
		System.out.println("Nome: " + alunoEnsinoSuperior.nome);
		System.out.println("Media: " + alunoEnsinoSuperior.getMedia());
	}
}
