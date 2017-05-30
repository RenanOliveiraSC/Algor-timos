//3.	Peça para o usuário digitar dois números, pegue os dois números que o usuário digitou. 
//Multiplique os dois números. Se o resultado da multiplicação for múltiplo de 5 imprima “o resultado é múltiplo de 5”, 
//caso contrário, imprima “o resultado não foi o esperado”. Após o teste da da condição do if, imprima o resultado da multiplicação.
package condicionais_interadores;

import java.util.Scanner;

public class _03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1;
		int num2;
		int soma;
		System.out.println("Digite um número:");
		num1 = scanner.nextInt();
		System.out.println("Digite outro número:");
		num2 = scanner.nextInt();
		soma = num1 * num2;
		if (soma % 5 == 0) {
			System.out.println("O resultado é múltiplo de 5");
		} else {
			System.out.println("O resultado não foi esperado");
		}
		System.out.println("O resultado da multiplicação é " + soma);
	}

}
