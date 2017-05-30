//1.	Peça para o usuário digitar um número, pegue o número que o usuário digitou. 
//Verifique se o número é maior que 10, caso sim, imprima “o valor digitado é maior que 10”, 
//caso contrário imprima “o valor digitado é menor que 10”.
package condicionais_interadores;

import java.util.Scanner;

public class _01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i;
		System.out.println("Digite um número:");
		i = scanner.nextInt();
		if (i > 10) {
			System.out.println("o valor digitado é maior que 10");
		} else {
			System.out.println("o valor digitado é menor que 10");
		}
	}
}
