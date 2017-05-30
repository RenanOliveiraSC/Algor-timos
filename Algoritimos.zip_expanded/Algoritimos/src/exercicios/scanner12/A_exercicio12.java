//Escreva no console para digitar um número inteiro, leia o número inteiro digitado. 
//Escreva no console para digitar outro número inteiro, leia o número inteiro digitado. 
//Escreva no console para digitar outro número inteiro, leia o número inteiro digitado. 

//a. Imprima o resultado do seguinte cálculo (primeiro número multiplicado pelo terceiro número mais, 
//o resultado somando com o segundo número elevado ao cubo). 

package exercicios.scanner12;

import java.util.Scanner;

public class A_exercicio12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int _numeroA;
		System.out.println("Digite o Primeiro número Inteiro:");
		_numeroA = scanner.nextInt();
		System.out.println("O número digitado é: " + _numeroA);

		int _numeroB;
		System.out.println("Digite o Segundo número Inteiro:");
		_numeroB = scanner.nextInt();
		System.out.println("O número digitado é: " + _numeroB);

		int _numeroC;
		System.out.println("Digite o Terceiro número Inteiro:");
		_numeroC = scanner.nextInt();
		System.out.println("O número digitado é: " + _numeroC);

		scanner.close();
		// a. Imprima o resultado do seguinte cálculo (primeiro número
		// multiplicado pelo terceiro número mais,
		// o resultado somando com o segundo número elevado ao cubo).
		double _resultadoA = (_numeroA * _numeroC + Math.pow(_numeroB, 3));
		System.out.println("O Resultado a da 12 é" + " " + _resultadoA);
		// b. Imprima true se o resultado é maior que zero, caso contrário
		// false.

		if (_resultadoA > 0) {
			System.out.println("true -b");
		} else {
			System.out.println("false -b");
		}
		// c. Imprima true se o resultado é maior que 10 ou maior que 1, caso
		// contrário false.
		if (_resultadoA > 10 && _resultadoA > 1) {
			System.out.println("true -c");
		} else {
			System.out.println("false -c");
			// d. Imprima true se o resultado é menor que 10 ou maior que 100,
			// caso contrário false
		}
		if (_resultadoA > 10 && _resultadoA > 100) {
			System.out.println("true -d");
		} else {
			System.out.println("false -d");
		}
		// e. Imprima true se o resultado é múltiplo de 10, caso contrário
		// false.
		if (_resultadoA % 10 == 0) {
			System.out.println("tru -e");
		} else {
			System.out.println("false -e");
		}
		// f. Imprima true se o resultado é múltiplo de 2 e múltiplo de 3, caso
		// contrário false.
		if (_resultadoA % 2 == 0) {
			System.out.println("tru -f");
		} else {
			System.out.println("false -f");
		}
	}
}