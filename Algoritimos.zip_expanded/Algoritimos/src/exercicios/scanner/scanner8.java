//8.	Escreva no console para digitar um número inteiro, leia o número inteiro digitado. 
//Escreva no console para digitar outro número inteiro, leia o número inteiro digitado. 
//Imprima no console true se o primeiro número digitado é maior que 5 e o segundo número menor que 10. Caso contrário imprima false.
package exercicios.scanner;

import java.util.Scanner;

public class scanner8 {

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
		if (_numeroA > 5 & _numeroB < 10) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

}
