//6.	Escreva no console para digitar um n�mero inteiro, leia o n�mero inteiro digitado. 
//Escreva no console para digitar outro n�mero inteiro, leia o n�mero inteiro digitado. 
//Imprima no console o resultado da divis�o dos dois n�meros.
package exercicios.scanner;

import java.util.Scanner;

public class scanner6 {

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
		{
			System.out.println(_numeroA / _numeroB);
		}
	}
}
