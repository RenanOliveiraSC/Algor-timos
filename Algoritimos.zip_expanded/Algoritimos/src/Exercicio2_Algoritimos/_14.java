//14)	Imprima somente n�meros que s�o m�ltiplos de 100, de -100 � 100;
package Exercicio2_Algoritimos;

public class _14 {

	public static void main(String[] args) {
		for(int n=-100; n<=100; n++){
			if(n % 100==0){
				System.out.println(n);
			}
		}
	}
}
