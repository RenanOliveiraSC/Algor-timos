//Escreva no console para digitar um n�mero inteiro, leia o n�mero inteiro digitado. 
//Escreva no console para digitar outro n�mero inteiro, leia o n�mero inteiro digitado. 
//Imprima no console o resto do primeiro n�mero digitado com o segundo n�mero digitado, o multiplicando por 10.

package exercicios.scanner;

import java.util.Scanner;

public class scannerOnze {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int _numeroA;
		System.out.println("Digite um n�mero Inteiro:");
		_numeroA = scanner.nextInt();
		System.out.println("O n�mero digitado �: " + _numeroA);

		int _numeroB;
		System.out.println("Digite outro n�mero Inteiro:");
		_numeroB = scanner.nextInt();
		System.out.println("O n�mero digitado �: " + _numeroB);
		scanner.close();
		System.out.println((_numeroA % _numeroB) * 10); // (_numeroA +_numeroB *
														// 10);

	}
}
