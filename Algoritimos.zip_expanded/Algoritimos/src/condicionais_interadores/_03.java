//3.	Pe�a para o usu�rio digitar dois n�meros, pegue os dois n�meros que o usu�rio digitou. 
//Multiplique os dois n�meros. Se o resultado da multiplica��o for m�ltiplo de 5 imprima �o resultado � m�ltiplo de 5�, 
//caso contr�rio, imprima �o resultado n�o foi o esperado�. Ap�s o teste da da condi��o do if, imprima o resultado da multiplica��o.
package condicionais_interadores;

import java.util.Scanner;

public class _03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1;
		int num2;
		int soma;
		System.out.println("Digite um n�mero:");
		num1 = scanner.nextInt();
		System.out.println("Digite outro n�mero:");
		num2 = scanner.nextInt();
		soma = num1 * num2;
		if (soma % 5 == 0) {
			System.out.println("O resultado � m�ltiplo de 5");
		} else {
			System.out.println("O resultado n�o foi esperado");
		}
		System.out.println("O resultado da multiplica��o � " + soma);
	}

}
