//4.	Pe�a para o usu�rio digitar dois n�meros, pegue os dois n�meros que o usu�rio digitou. 
//Se o primeiro n�mero que o usu�rio digitar e o segundo n�mero que o usu�rio digitou forem m�ltiplos de 7, 
//imprima �os dois n�meros s�o m�ltiplos de 7�, caso contr�rio imprima, �os dois n�meros n�o s�o m�ltiplos de 7�. 
package condicionais_interadores;

import java.util.Scanner;

public class _04 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int num1;
		int num2;
		System.out.println("Digite um n�mero:");
		num1 = scanner.nextInt();
		System.out.println("Digite outro n�mero:");
		num2 = scanner.nextInt();
		if (num1 % 7 == 0 && num2 % 7 == 0) {
			System.out.println("os dois n�meros s�o m�ltiplos de 7");
		} else {
			System.out.println("os dois n�meros n�o s�o m�ltiplos de 7");
		}
	}
}
