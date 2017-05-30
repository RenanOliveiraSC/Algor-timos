//4.	Peça para o usuário digitar dois números, pegue os dois números que o usuário digitou. 
//Se o primeiro número que o usuário digitar e o segundo número que o usuário digitou forem múltiplos de 7, 
//imprima “os dois números são múltiplos de 7”, caso contrário imprima, “os dois números não são múltiplos de 7”. 
package condicionais_interadores;

import java.util.Scanner;

public class _04 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int num1;
		int num2;
		System.out.println("Digite um número:");
		num1 = scanner.nextInt();
		System.out.println("Digite outro número:");
		num2 = scanner.nextInt();
		if (num1 % 7 == 0 && num2 % 7 == 0) {
			System.out.println("os dois números são múltiplos de 7");
		} else {
			System.out.println("os dois números não são múltiplos de 7");
		}
	}
}
