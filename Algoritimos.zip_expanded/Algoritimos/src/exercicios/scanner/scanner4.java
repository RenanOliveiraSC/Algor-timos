//4. Escreva no console para digitar um número inteiro, leia o número inteiro digitado. 
//Escreva no console para digitar outro número inteiro, leia o número inteiro digitado. 
//Imprima no console true se o primeiro número é maior que o segundo número digitado.
package exercicios.scanner;

import java.util.Scanner;

public class scanner4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numeroA;
		System.out.println("Digite um número Inteiro:");
		numeroA = scanner.nextInt();
		System.out.println("O texto digitado é: " + numeroA);
		scanner.close();
		{
			System.out.println(numeroA);
		}
	}
}