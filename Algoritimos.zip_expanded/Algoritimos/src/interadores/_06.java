//6.	Utilizando for, imprimir no console um abaixo do outro, valores de 10 a 100, somente valores múltiplos de 5 ou 10.
package interadores;

import java.util.Scanner;

public class _06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		for (int n = 0; n <= 100; n++) {
			if (n % 5 != 0 || n % 10 != 0)
				;
			
			{
				System.out.println(n);
			}
		}
	}
