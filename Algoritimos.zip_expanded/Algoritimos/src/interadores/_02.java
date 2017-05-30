//2.	Utilizando for, imprimir no console um abaixo do outro, 
//valores de 5 a 100, somente valores múltiplos de 5.
package interadores;

import java.util.Scanner;

public class _02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		for (int num = 5; num <= 100; num += 5) {
			System.out.println(num);
		}
	}

}
