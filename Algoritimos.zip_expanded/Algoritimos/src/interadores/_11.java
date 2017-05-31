//11. Imprima apenas números que se divididos por 5 o resultado seja maior que 3, de 10 à 1000;
package interadores;

import java.util.Scanner;

public class _11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		for (int n = 10; n <= 1000; n = n + 10) {
			if (n % 5 == 0) {
				System.out.println(n);
			}

		}
	}
}
