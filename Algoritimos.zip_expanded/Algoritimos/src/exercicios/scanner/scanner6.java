//6.	Escreva no console para digitar um número inteiro, leia o número inteiro digitado. 
//Escreva no console para digitar outro número inteiro, leia o número inteiro digitado. 
//Imprima no console o resultado da divisão dos dois números.
package exercicios.scanner;

import java.util.Scanner;

public class scanner6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int _numeroA;
		System.out.println("Digite um número Inteiro:");
		_numeroA = scanner.nextInt();
		System.out.println("O número digitado é: " + _numeroA);
		int _numeroB;
		System.out.println("Digite outro número Inteiro:");
		_numeroB = scanner.nextInt();
		System.out.println("O número digitado é: " + _numeroB);
		scanner.close();
		{
			System.out.println(_numeroA / _numeroB);
		}
	}
}
