//1.	Escreva no console para digitar um número inteiro, leia o número inteiro digitado e imprima o número no console.
package exercicios.scanner;

import java.util.Scanner;

public class scanner1_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int _idade;
		System.out.println("Digite a idade do Aluno:");
		_idade = scanner.nextInt();
		if (_idade >= 18) {
			System.out.println("Apto à se alistar para o Exercíto");
		} else {
			System.out.println("Não Apto à se alistar");
		}
		scanner.close();
	}
}
