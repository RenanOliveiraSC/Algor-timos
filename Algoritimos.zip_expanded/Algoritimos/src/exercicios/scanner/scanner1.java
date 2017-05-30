//1.	Escreva no console para digitar um número inteiro, leia o número inteiro digitado e imprima o número no console.
package exercicios.scanner;

import java.util.Scanner;

public class scanner1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int _numeroint;
		System.out.println("Digite um número Inteiro:");
		_numeroint = scanner.nextInt();
		System.out.println("O valor da soma é digitado é = " + _numeroint);
		scanner.close();
	}

}