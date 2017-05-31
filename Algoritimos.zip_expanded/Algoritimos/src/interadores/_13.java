//13. Imprimir listas semelhantes.
package interadores;

import java.util.Scanner;

import sun.text.normalizer.Replaceable;
import sun.text.normalizer.ReplaceableString;

public class _13 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// a. 1 2 2 3 3 4 4 5 5 6 6 7 7 8 8 9
		for (int num = 1; num <= 9; num = num + 1) {
			if (num == 1 || num == 9) {
				System.out.print(num + " ");

			} else {
				System.out.print(num + " ");
				System.out.print(num + " ");
			}
		}
		System.out.println(" ");

		// b. 9 8 8 7 7 6 6 5 5 4 4 3 3 2 2 1
		for (int num = 9; num >= 1; num--) {
			if (num == 1 || num == 9) {
				System.out.print(num + " ");

			} else {
				System.out.print(num + " ");
				System.out.print(num + " ");
			}
		}
		System.out.println(" ");

		// c.
		// 1
		// 2
		// aqui é o meio da lista
		// 4
		// 5

		for (int num = 1; num <= 5; num++) {
			System.out.println(num + "\n");

			// "Aqui é o meio da lista"
		}

		System.out.println("A ( C ) Não está funcionando");

		// d.
		// 1
		// 2
		// aqui é um dos meios da lista
		// aqui é outro dos meios da lista
		// 5
		// 6

		// e. 1
		// 2
		// aqui é um terço da lista
		// 4
		// 5
		// aqui é um terço da lista
		// 7
		// 8
		// aqui é um terço da lista

		// f. ______________
		// ||||||||||||||||||||||||||||||
		// ##############
		// ********************
		// ______________
		// ||||||||||||||||||||||||||||||
		// ##############
		// ********************
		// ______________
		// ||||||||||||||||||||||||||||||
		// ##############
		// ********************
		// (observação, só pode ter impresso uma linha por interação do for)

	}

}
