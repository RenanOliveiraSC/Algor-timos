//6.	Criar um array do tipo int, com valores de 0 à 5.
package array_e_matriz;

import java.util.Collections;
import java.util.Scanner;

public class _06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] n = { 0, 1, 2, 3, 4, 5 };
		{
			for (int valor : n) {
				System.out.print(valor);
			}
			for (int valor : n) {
				System.out.print(Collections.reverse(valor));

			}
		}

		// a. Imprimir todos os valores do array

		// b. Imprimir todos os valores do array de forma decrescente
	}
}
