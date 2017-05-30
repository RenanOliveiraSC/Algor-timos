//12)	Imprima somente números múltiplos de 15 que são pares, de 0 à 1000;
package Exercicio2_Algoritimos;

public class _12 {

	public static void main(String[] args) {
		for (int n = 0; n <= 1000; n++) {
			if (n % 15 == 0 && n % 2 == 0) {
				System.out.println(n);
			}
		}
	}
}