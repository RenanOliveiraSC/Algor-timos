//15)	Imprima apenas números do qual a divisão por 3, retorne um número inteiro, de -10 à 500;
package Exercicio2_Algoritimos;

public class _15 {

	public static void main(String[] args) {
		for (int i = -10; i <= 500; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}
	}
}