//1.	Pe�a para o usu�rio digitar um n�mero, pegue o n�mero que o usu�rio digitou. 
//Verifique se o n�mero � maior que 10, caso sim, imprima �o valor digitado � maior que 10�, 
//caso contr�rio imprima �o valor digitado � menor que 10�.
package condicionais_interadores;

import java.util.Scanner;

public class _01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i;
		System.out.println("Digite um n�mero:");
		i = scanner.nextInt();
		if (i > 10) {
			System.out.println("o valor digitado � maior que 10");
		} else {
			System.out.println("o valor digitado � menor que 10");
		}
	}
}
