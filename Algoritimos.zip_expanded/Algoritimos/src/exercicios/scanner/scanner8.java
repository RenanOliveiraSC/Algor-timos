//8.	Escreva no console para digitar um n�mero inteiro, leia o n�mero inteiro digitado. 
//Escreva no console para digitar outro n�mero inteiro, leia o n�mero inteiro digitado. 
//Imprima no console true se o primeiro n�mero digitado � maior que 5 e o segundo n�mero menor que 10. Caso contr�rio imprima false.
package exercicios.scanner;

import java.util.Scanner;

public class scanner8 {

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
		if (_numeroA > 5 & _numeroB < 10) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

}
