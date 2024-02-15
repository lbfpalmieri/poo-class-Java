package aulaPooWorkspace;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		do {
			System.out.println("1 para aluno | 2 para professor");
			int op = teclado.nextInt();
			
			if(op == 1) {
				Aluno aluno = new Aluno();
				
				System.out.println("Digite nome do aluno: ");
				aluno.setNome(teclado.next());
				
				System.out.println("Digite nota do teste: ");
				aluno.setTeste(teclado.nextDouble());
				
				System.out.println("Digite nota da prova: ");
				aluno.setProva(teclado.nextDouble());
				
				System.out.println("Nome: " + aluno.getNome() + " | " + aluno.getMedia());
				
				System.out.println("0 para sair");
			}
			else if (op == 2) {
				Professor prof = new Professor();
				
				System.out.println("Digite o nome do professor: ");
				prof.setNome(teclado.next());
				
				System.out.println("Digite o salario: ");
				prof.setSalario(teclado.nextDouble());
				
				System.out.println("Deseja calcular Inss ou Salario liquido? 1 Inss | 2 Salario liquido.");
				op = teclado.nextInt();
				
				if(op == 1)
					System.out.println("Inss: " + prof.getInss());
				else if (op == 2) 
					System.out.println("Salario liquido: " + prof.getSalarioLiquido());
				
				System.out.println("0 para sair");
			}
			
		} while (teclado.nextInt() !=  0);
		System.out.println("ByeBye");	
	}
}
