package aula2;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		ArrayList<Integer> listNumbers = new ArrayList<Integer>();
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite quantos numeros quer adicionar: ");
		int tamanho = teclado.nextInt();
		
		for (int i = 0 ; i < tamanho; i++) {
			System.out.println("Inserindo o " + i + " numero: " );
			listNumbers.add(teclado.nextInt());
		}
		
		System.out.println("Numeros inseridos:");
		for (int list : listNumbers) {
			System.out.println(list);			
		}
		
		int soma =0;
		System.out.println("A soma total do Array:");
		for(int listSoma : listNumbers) {
			soma += listSoma;
		}
		System.out.println(soma);
	}
}
