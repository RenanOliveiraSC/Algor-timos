//5.	Criar um array do tipo double, colocando os seguintes valores no array 1.0, 3.0, 5.0, 7.0.
package array_e_matriz;

import java.util.Scanner;

public class _05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double[] n = { 1.0, 3.0, 5.0, 7.0 };
		{
			for (double valor : n) {
				System.out.print(valor + " ");
			}
		}
	}
}
