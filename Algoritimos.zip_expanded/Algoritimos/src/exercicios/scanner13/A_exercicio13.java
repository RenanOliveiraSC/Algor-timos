//Escreva no console para digitar um n�mero inteiro, leia o n�mero inteiro digitado. 
//Escreva no console para digitar outro n�mero inteiro, leia o n�mero inteiro digitado. 
//Escreva no console para digitar outro n�mero inteiro, leia o n�mero inteiro digitado. 
//Escreva no console para digitar outro n�mero inteiro, leia o n�mero inteiro digitado.
package exercicios.scanner13;

import java.util.Scanner;

public class A_exercicio13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int _numero1;
		System.out.println("Digite o Primeiro N�mero Inteiro");
		_numero1 = scanner.nextInt();
		System.out.println("O n�mero digitado �: " + _numero1);

		int _numero2;
		System.out.println("Digite o Primeiro N�mero Inteiro");
		_numero2 = scanner.nextInt();
		System.out.println("O n�mero digitado �: " + _numero2);

		int _numero3;
		System.out.println("Digite o Primeiro N�mero Inteiro");
		_numero3 = scanner.nextInt();
		System.out.println("O n�mero digitado �: " + _numero3);

		int _numero4;
		System.out.println("Digite o Primeiro N�mero Inteiro");
		_numero4 = scanner.nextInt();
		System.out.println("O n�mero digitado �: " + _numero4);

		// a. Imprima true se o valor do primeiro n�mero � menor ou igual a soma
		// do segundo n�mero com o terceiro e o quarto n�mero, for impar ou
		// maior que 10, caso contr�rio false.
		int soma1 = (_numero2 + _numero3 + _numero4);
		if (_numero1 <= soma1 && (soma1 % 2 != 0 || soma1 > 10)) {
			System.out.println("13-a = true");
		} else {
			System.out.println("13-a = false");
		}
		// b. Imprima true se a soma do primeiro d�gito mais o segundo mais o
		// terceiro mais o quarto d�gito for m�ltiplo de 10,
		// ou m�ltiplo de 5, ou o primeiro d�gito for 5, ou a soma do primeiro
		// d�gito mais o segundo e o terceiro d�gito,
		// for maior que 100.0, e o primeiro d�gito maior que 0.

		int soma2 = (_numero1 + _numero2 + _numero3 + _numero4);
		if (soma2 % 10 != 0 || soma2 % 5 != 0) {
			System.out.println("13-b = true ");
		} else {
			System.out.println("13-b = false");
		}
		// c. Imprima true se o resultado da quest�o a e o resultado da quest�o
		// b forem verdadeiras,
		// ou o resultado da quest�o a e o resultado da quest�o b forem falsas.

		if (soma1 == soma2 || soma2 == soma1) {
			System.out.println("13-c = true");
		} else {
			System.out.println("13-c = false");
		}
		// d. Imprima false se o valor do primeiro d�gito mais o segundo,
		// terceiro e quarto for maior que 10, caso contr�rio true.
		// for()
		if (soma1 > 10) {
			System.out.println("13-d = false");
		} else {
			System.out.println("13-d = true");
		}
		// e. Imprima false se o primeiro n�mero � maior que 10 ou o terceiro
		// n�mero for maior que 0,
		// ou o segundo n�mero mais o quarto n�mero for igual a 0. Caso
		// contr�rio true.
		if (_numero1 > 10 || _numero3 > 0 || (_numero2 + _numero4 == 0)) {
			System.out.println("13-e = false");
		} else {
			System.out.println("13-d = true");
		}

	}
}
