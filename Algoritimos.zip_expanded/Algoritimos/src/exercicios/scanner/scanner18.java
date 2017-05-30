//Peça para o usuário digitar um número. Guarde o número que o usuário digitou.
//Subtraia o número por 5 e imprima o resultado. Pegue novamente o número que o
//usuário digitou e subtraia por 3 e imprima o resultado. Pegue o resultado da
//subtração por 5 e o resultado da subtração por 3 e imprima os dois resultado.
package exercicios.scanner;

import java.util.Scanner;

public class scanner18 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i;
		System.out.println("Digite um número:");
		i = scanner.nextInt();
		i = i - 5;
		System.out.println(i);
		int resultado = i - 3;
		System.out.println(resultado);
		int resultado2 = resultado - 5;
		System.out.println(resultado2);
		int resultadof = resultado2 - 3;
		System.out.println(resultadof);
	}

}
