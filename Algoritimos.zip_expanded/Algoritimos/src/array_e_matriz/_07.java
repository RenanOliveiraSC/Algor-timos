//7.	Criar um array do tipo String, com valor de “A”, “B”, “C”, “D”, “E”, “F”

//c.	Imprimir todos os valores do array menos que tenha o valor “C”

package array_e_matriz;

import java.util.Collections;
import java.util.Scanner;

public class _07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String[] letras = { "A", "B", "C", "D", "E", "F" };
		{
			// a. Imprimir todos os valores do array
			for (String valor : letras) {
				System.out.print(valor);
			}
			System.out.println();

			// b. Imprimir todos os valores do array de forma contrário, ou
			// seja, “F”, “E”, “D”, “C”, “B”, “A”
			Collections.sort(scanner.getLista());
			for (String valor1 : letras) {
				System.out.(valor1,getvalor1);
			}
		}
	}

}
