//Imprima no console uma lista de 20 a 100, e no lugar do n�mero 25 imprima �Ol�;
package Exercicio2_Algoritimos;

public class _03 {

	public static void main(String[] args) {
		int num = 20;
		while (num <= 100) {
			if (num == 25) {
				System.out.println("Ol�");
			} else {
				System.out.println(num);
			}
			num++;

			if (num == 25) {
				System.out.println("Ol�");
			}

		}
	}
}