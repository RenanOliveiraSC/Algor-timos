//2.	Peça para o usuário digitar um número, pegue o número que o usuário digitou. 
//Verifique se o número é ímpar, caso sim, imprima “o valor digitado é ímpar”, caso contrário imprima “o valor é par”.

package condicionais_interadores;

import java.util.Scanner;

public class _02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i;
		System.out.println("Digite um número:");
		i = scanner.nextInt();
		if (i % 3 == 0) {
			System.out.println("o valor digitado é ímpar");
		} else {

			System.out.println("o valor digitado é par");
		}
	}
}