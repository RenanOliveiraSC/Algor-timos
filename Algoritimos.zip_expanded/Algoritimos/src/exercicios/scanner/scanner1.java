//1.	Escreva no console para digitar um n�mero inteiro, leia o n�mero inteiro digitado e imprima o n�mero no console.
package exercicios.scanner;

import java.util.Scanner;

public class scanner1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int _numeroint;
		System.out.println("Digite um n�mero Inteiro:");
		_numeroint = scanner.nextInt();
		System.out.println("O valor da soma � digitado � = " + _numeroint);
		scanner.close();
	}

}