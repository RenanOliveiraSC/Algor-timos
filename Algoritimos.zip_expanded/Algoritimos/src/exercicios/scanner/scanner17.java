//Pe�a para o usu�rio digitar um n�mero. Guarde o n�mero que o usu�rio digitou.
//Some o n�mero que o usu�rio digitou com 5. Imprima o resultado da soma. Pegue o
//resultado e some com 5 novamente. Imprima o resultado da soma.
package exercicios.scanner;

import java.util.Scanner;

public class scanner17 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i;
		System.out.println("Digite um n�mero:");
		i = scanner.nextInt();
		i = i + 5;
		System.out.println(i);
		int resultado = i + 5;
		System.out.println(resultado);
	}
}
