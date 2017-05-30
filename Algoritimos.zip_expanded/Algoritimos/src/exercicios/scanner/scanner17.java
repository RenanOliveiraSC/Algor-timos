//Peça para o usuário digitar um número. Guarde o número que o usuário digitou.
//Some o número que o usuário digitou com 5. Imprima o resultado da soma. Pegue o
//resultado e some com 5 novamente. Imprima o resultado da soma.
package exercicios.scanner;

import java.util.Scanner;

public class scanner17 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i;
		System.out.println("Digite um número:");
		i = scanner.nextInt();
		i = i + 5;
		System.out.println(i);
		int resultado = i + 5;
		System.out.println(resultado);
	}
}
