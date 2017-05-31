//12. Imprimir uma lista semelhante a lista abaixo:
//1_10
//2_9
//3_8
//4_7
//5_6
//6_5
//7_4
//8_3
//9_2
//10_1
package interadores;

import java.util.Scanner;

public class _12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a = 1;
		int b = 10;
		for (; a <= 10; a++) {
			System.out.println(a + "_" + b);
			b--;

		}
	}
}
