//12)	Imprima somente n�meros m�ltiplos de 15 que s�o pares, de 0 � 1000;
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