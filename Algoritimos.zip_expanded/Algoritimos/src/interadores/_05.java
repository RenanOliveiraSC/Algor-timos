
//5.	Utilizando for, imprimir no console um abaixo do outro, valores de -50 a 50, somente valores de 40 a 60.
package interadores;

import java.util.Scanner;

public class _05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		for (int n = -50; n <= 50; n++) {
			if (n % 40 == 0 && n % 60 == 0)
				System.out.println(n);
		}
	}
}
