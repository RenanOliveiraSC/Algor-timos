//Escreva no console para digitar um n�mero inteiro, leia o n�mero inteiro digitado. 
//Escreva no console para digitar outro n�mero inteiro, leia o n�mero inteiro digitado. 
//Escreva no console para digitar outro n�mero inteiro, leia o n�mero inteiro digitado. 

//a. Imprima o resultado do seguinte c�lculo (primeiro n�mero multiplicado pelo terceiro n�mero mais, 
//o resultado somando com o segundo n�mero elevado ao cubo). 

package exercicios.scanner12;

import java.util.Scanner;

public class A_exercicio12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int _numeroA;
		System.out.println("Digite o Primeiro n�mero Inteiro:");
		_numeroA = scanner.nextInt();
		System.out.println("O n�mero digitado �: " + _numeroA);

		int _numeroB;
		System.out.println("Digite o Segundo n�mero Inteiro:");
		_numeroB = scanner.nextInt();
		System.out.println("O n�mero digitado �: " + _numeroB);

		int _numeroC;
		System.out.println("Digite o Terceiro n�mero Inteiro:");
		_numeroC = scanner.nextInt();
		System.out.println("O n�mero digitado �: " + _numeroC);

		scanner.close();
		// a. Imprima o resultado do seguinte c�lculo (primeiro n�mero
		// multiplicado pelo terceiro n�mero mais,
		// o resultado somando com o segundo n�mero elevado ao cubo).
		double _resultadoA = (_numeroA * _numeroC + Math.pow(_numeroB, 3));
		System.out.println("O Resultado a da 12 �" + " " + _resultadoA);
		// b. Imprima true se o resultado � maior que zero, caso contr�rio
		// false.

		if (_resultadoA > 0) {
			System.out.println("true -b");
		} else {
			System.out.println("false -b");
		}
		// c. Imprima true se o resultado � maior que 10 ou maior que 1, caso
		// contr�rio false.
		if (_resultadoA > 10 && _resultadoA > 1) {
			System.out.println("true -c");
		} else {
			System.out.println("false -c");
			// d. Imprima true se o resultado � menor que 10 ou maior que 100,
			// caso contr�rio false
		}
		if (_resultadoA > 10 && _resultadoA > 100) {
			System.out.println("true -d");
		} else {
			System.out.println("false -d");
		}
		// e. Imprima true se o resultado � m�ltiplo de 10, caso contr�rio
		// false.
		if (_resultadoA % 10 == 0) {
			System.out.println("tru -e");
		} else {
			System.out.println("false -e");
		}
		// f. Imprima true se o resultado � m�ltiplo de 2 e m�ltiplo de 3, caso
		// contr�rio false.
		if (_resultadoA % 2 == 0) {
			System.out.println("tru -f");
		} else {
			System.out.println("false -f");
		}
	}
}