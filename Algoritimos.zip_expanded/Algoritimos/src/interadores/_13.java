//13. Imprimir listas semelhantes.
package interadores;

import java.util.Scanner;

import sun.text.normalizer.Replaceable;
import sun.text.normalizer.ReplaceableString;

public class _13 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("**********************EXERCICIO (A)*********************************");

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

		System.out.println("**********************EXERCICIO (B)*********************************");
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

		System.out.println("**********************EXERCICIO (C)*********************************");
		System.out.println(" ");
		// c.
		// 1
		// 2
		// aqui é o meio da lista
		// 4
		// 5

		for (int num = 1; num <= 5; num = num + 1) {
			String meio = "Aqui é o meio da lista";

			if (num == 3) {
				System.out.println(meio);
			}

			else {

				System.out.println(num + "\n");

			}
		}

		System.out.println("");
		System.out.println("**********************EXERCICIO (D)*********************************");
		System.out.println(" ");
		// d.
		// 1
		// 2
		// aqui é um dos meios da lista
		// aqui é outro dos meios da lista
		// 5
		// 6

		for (int num = 1; num <= 6; num = num + 1) {
			String meio = "Aqui é o meio da lista";
			String meio2 = "Aqui é o outro meio da lista";

			if (num == 3) {
				System.out.println(meio);
			}

			else if (num == 4) {
				System.out.println(meio2);
			} else {
				System.out.println(num + "\n");
			}
		}

		System.out.println("");

		// e. 1
		// 2
		// aqui é um terço da lista
		// 4
		// 5
		// aqui é um terço da lista
		// 7
		// 8
		// aqui é um terço da lista

		System.out.println("**********************EXERCICIO (E)*********************************");
		System.out.println(" ");

		for (int num = 2; num <= 9; num = num + 1) {
			String tx0 = "Aqui é um terço da lista";
			String tx1 = "Aqui é um terço da lista";
			String tx2 = "Aqui é um terço da lista";

			if (num == 3) {
				System.out.println(tx0);
			}

			else if (num == 6) {
				System.out.println(tx1);
			} else if (num == 9)
				System.out.println(tx2);
			else {
				System.out.println(num + "\n");
			}
		}

		System.out.println("");

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

		System.out.println("**********************EXERCICIO (E)*********************************");
		System.out.println(" ");

		System.out.println("______________");
		System.out.println("||||||||||||||||||||||||||||||");
		System.out.println("##############");
		System.out.println("********************");
		System.out.println("______________");
		System.out.println("||||||||||||||||||||||||||||||");
		System.out.println("##############");
		System.out.println("********************");
		System.out.println("______________");
		System.out.println("||||||||||||||||||||||||||||||");
		System.out.println("##############");
		System.out.println("********************");

		System.out.println("");

	}

}
