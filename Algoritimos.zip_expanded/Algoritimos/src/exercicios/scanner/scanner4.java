//4. Escreva no console para digitar um n�mero inteiro, leia o n�mero inteiro digitado. 
//Escreva no console para digitar outro n�mero inteiro, leia o n�mero inteiro digitado. 
//Imprima no console true se o primeiro n�mero � maior que o segundo n�mero digitado.
package exercicios.scanner;

import java.util.Scanner;

public class scanner4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numeroA;
		System.out.println("Digite um n�mero Inteiro:");
		numeroA = scanner.nextInt();
		System.out.println("O texto digitado �: " + numeroA);
		scanner.close();
		{
			System.out.println(numeroA);
		}
	}
}