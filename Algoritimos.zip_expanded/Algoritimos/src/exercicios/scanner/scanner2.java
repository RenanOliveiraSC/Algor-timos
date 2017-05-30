//2.	Escreva no console para digitar um texto, leia o texto digitado e imprima o texto no console. 
package exercicios.scanner;

import java.util.Scanner;

public class scanner2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String _texto;
		System.out.println("Digite um texto:");
		_texto = scanner.nextLine();
		System.out.println("O texto digitado é: " + _texto);
	}
}
