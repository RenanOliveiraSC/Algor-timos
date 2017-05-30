
//4.	Utilizando for, imprimir no console um abaixo do outro, valores de 10 a -10, somente valores negativos. 
package interadores;

import java.util.Scanner;

public class _04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		for (int n = 10; n >= -10; n--) {
			System.out.println(n);
		}
	}
}
