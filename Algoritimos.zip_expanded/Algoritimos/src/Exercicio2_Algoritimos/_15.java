//15)	Imprima apenas n�meros do qual a divis�o por 3, retorne um n�mero inteiro, de -10 � 500;
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