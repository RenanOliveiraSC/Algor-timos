//Escreva no console para digitar um número inteiro, leia o número inteiro digitado. 
//Escreva no console para digitar outro número inteiro, leia o número inteiro digitado. 
//Escreva no console para digitar outro número inteiro, leia o número inteiro digitado. 
//Escreva no console para digitar outro número inteiro, leia o número inteiro digitado.
package exercicios.scanner13;

import java.util.Scanner;

public class A_exercicio13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int _numero1;
		System.out.println("Digite o Primeiro Número Inteiro");
		_numero1 = scanner.nextInt();
		System.out.println("O número digitado é: " + _numero1);

		int _numero2;
		System.out.println("Digite o Primeiro Número Inteiro");
		_numero2 = scanner.nextInt();
		System.out.println("O número digitado é: " + _numero2);

		int _numero3;
		System.out.println("Digite o Primeiro Número Inteiro");
		_numero3 = scanner.nextInt();
		System.out.println("O número digitado é: " + _numero3);

		int _numero4;
		System.out.println("Digite o Primeiro Número Inteiro");
		_numero4 = scanner.nextInt();
		System.out.println("O número digitado é: " + _numero4);

		// a. Imprima true se o valor do primeiro número é menor ou igual a soma
		// do segundo número com o terceiro e o quarto número, for impar ou
		// maior que 10, caso contrário false.
		int soma1 = (_numero2 + _numero3 + _numero4);
		if (_numero1 <= soma1 && (soma1 % 2 != 0 || soma1 > 10)) {
			System.out.println("13-a = true");
		} else {
			System.out.println("13-a = false");
		}
		// b. Imprima true se a soma do primeiro dígito mais o segundo mais o
		// terceiro mais o quarto dígito for múltiplo de 10,
		// ou múltiplo de 5, ou o primeiro dígito for 5, ou a soma do primeiro
		// dígito mais o segundo e o terceiro dígito,
		// for maior que 100.0, e o primeiro dígito maior que 0.

		int soma2 = (_numero1 + _numero2 + _numero3 + _numero4);
		if (soma2 % 10 != 0 || soma2 % 5 != 0) {
			System.out.println("13-b = true ");
		} else {
			System.out.println("13-b = false");
		}
		// c. Imprima true se o resultado da questão a e o resultado da questão
		// b forem verdadeiras,
		// ou o resultado da questão a e o resultado da questão b forem falsas.

		if (soma1 == soma2 || soma2 == soma1) {
			System.out.println("13-c = true");
		} else {
			System.out.println("13-c = false");
		}
		// d. Imprima false se o valor do primeiro dígito mais o segundo,
		// terceiro e quarto for maior que 10, caso contrário true.
		// for()
		if (soma1 > 10) {
			System.out.println("13-d = false");
		} else {
			System.out.println("13-d = true");
		}
		// e. Imprima false se o primeiro número é maior que 10 ou o terceiro
		// número for maior que 0,
		// ou o segundo número mais o quarto número for igual a 0. Caso
		// contrário true.
		if (_numero1 > 10 || _numero3 > 0 || (_numero2 + _numero4 == 0)) {
			System.out.println("13-e = false");
		} else {
			System.out.println("13-d = true");
		}

	}
}
