//Pe�a para o usu�rio digitar um n�mero. Guarde o n�mero que o usu�rio digitou.
//Subtraia o n�mero por 5 e imprima o resultado. Pegue novamente o n�mero que o
//usu�rio digitou e subtraia por 3 e imprima o resultado. Pegue o resultado da
//subtra��o por 5 e o resultado da subtra��o por 3 e imprima os dois resultado.
package exercicios.scanner;

import java.util.Scanner;

public class scanner18 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i;
		System.out.println("Digite um n�mero:");
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
