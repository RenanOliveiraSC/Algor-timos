//2.	Pe�a para o usu�rio digitar um n�mero, pegue o n�mero que o usu�rio digitou. 
//Verifique se o n�mero � �mpar, caso sim, imprima �o valor digitado � �mpar�, caso contr�rio imprima �o valor � par�.

package condicionais_interadores;

import java.util.Scanner;

public class _02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i;
		System.out.println("Digite um n�mero:");
		i = scanner.nextInt();
		if (i % 3 == 0) {
			System.out.println("o valor digitado � �mpar");
		} else {

			System.out.println("o valor digitado � par");
		}
	}
}