//1.	Escreva no console para digitar um n�mero inteiro, leia o n�mero inteiro digitado e imprima o n�mero no console.
package exercicios.scanner;

import java.util.Scanner;

public class scanner1_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int _idade;
		System.out.println("Digite a idade do Aluno:");
		_idade = scanner.nextInt();
		if (_idade >= 18) {
			System.out.println("Apto � se alistar para o Exerc�to");
		} else {
			System.out.println("N�o Apto � se alistar");
		}
		scanner.close();
	}
}
