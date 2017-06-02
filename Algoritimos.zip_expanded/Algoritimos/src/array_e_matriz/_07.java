//7.	Criar um array do tipo String, com valor de “A”, “B”, “C”, “D”, “E”, “F”
package array_e_matriz;

import java.util.Scanner;

public class _07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String[] letras = { "A", "B", "C", "D", "E", "F" };
		{
			System.out.println("a. Imprimir todos os valores do array");
			for (String valor : letras) {
				System.out.print(valor + " ");
			}
			System.out.println();

			System.out.println(
					"b. Imprimir todos os valores do array de forma contrário, ou seja, 'F', 'E', 'D', 'C', 'B', 'A' ");

			String[] letraB = new String[6];
			{
				letraB[0] = "A";
				letraB[1] = "B";
				letraB[2] = "C";
				letraB[3] = "D";
				letraB[4] = "F";

				for (int aux = 4; aux >= 0; aux--) {
					System.out.print(letraB[aux] + " ");
				}

				System.out.println();

				System.out.println("c. Imprimir todos os valores do array menos que tenha o valor “C”");

				String[] letraC = new String[6];
				{
					letraC[0] = "A";
					letraC[1] = "B";
					letraC[2] = "C";
					letraC[3] = "D";
					letraC[4] = "F";

					for (int aux = 0; aux <= 4; aux++) {
						if (aux != 2) {
							System.out.print(letraC[aux] + " ");
						}
					}
				}
			}
		}
	}
}
