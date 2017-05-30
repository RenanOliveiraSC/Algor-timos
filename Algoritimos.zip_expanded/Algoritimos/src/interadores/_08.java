//8.	Utilizando for, imprimir no console conforme exemplo abaixo (Utilizar System.out.print ao invés do System.out.println):
package interadores;

import java.util.Scanner;

public class _08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// a. 0,1,2,3,4,5,6,7,8,9,10;
		for (int num = 0; num <= 10; num++) {
			System.out.print(num + ",");
		}
		scanner.close();

		// b. 10,9,8,7,6,5,4,3,2,1
		for (int num = 10; num >= 10; num--) {
			System.out.print(num + ",");
		}
		scanner.close();

		// c. 0, 2, 4, 6, 8, 10
		for (int num = 0; num <= 10; num++) {
			if (num % 2 == 0) {
				System.out.print(num);
			}
		}
		scanner.close();

		// d. 10, 7, 4, 1
		for (int num = 10; num >= 1; num -= 3) {
			System.out.print(num);
		}
		scanner.close();

		// e.0,1,3,6,10,15,21,28
		for (int num = 0; num <= 28; num++) {

		}

	}
}
