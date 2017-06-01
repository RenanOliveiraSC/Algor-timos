//2.	Criar um array do tipo boolean com 3 posições;
package array_e_matriz;

import java.util.Scanner;

public class _02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		boolean pos[] = { true, false, true };
		{
			for (boolean valor : pos) {
				System.out.println(valor);
			}
		}
	}
}
