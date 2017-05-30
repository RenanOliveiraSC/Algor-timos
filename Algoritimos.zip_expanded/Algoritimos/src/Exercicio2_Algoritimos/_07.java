//7)	Imprima apenas números pares de 0 à 100;
package Exercicio2_Algoritimos;

public class _07 {

	public static void main(String[] args) {
		int num = 0;
		for(num = 1; num<=100; num++){
			if((num % 2) ==0){
				System.out.println(num);
			}
		}
	}
}
