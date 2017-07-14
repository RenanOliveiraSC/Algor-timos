//16)	Imprima apenas números que se divididos por 5 o resultado seja maior que 3, de 10 à 1000;
package Exercicio2_Algoritimos;

public class _16 {

	public static void main(String[] args) {
		for (int i = 10; i <= 1000; i++) {
			while (i % 5 == 0 && i > 3) {
				System.out.println(i);
			}
		}
	}
}