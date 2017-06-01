//1.	Criar um array do tipo String com 10 posições;
package array_e_matriz;

import java.util.Scanner;

public class _01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String i[] = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J" };
		for (String valor : i) {
			System.out.print(valor);
		}
	}
}
