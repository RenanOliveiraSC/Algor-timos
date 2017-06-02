//6.	Criar um array do tipo int, com valores de 0 à 5.
package array_e_matriz;

import java.util.Scanner;

public class _06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("a. Imprimir todos os valores do array");
		int[] n = { 0, 1, 2, 3, 4, 5 };
		{
			for (int valor : n) {
				System.out.print(valor);
			}
			System.out.println("");

			System.out.println("b. Imprimir todos os valores do array de forma decrescente");
			for (int aux = 5; aux >= 0; aux--) {
				System.out.print(aux);

			}
		}

	}
}
