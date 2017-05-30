//6)	Imprima apenas números ímpares de 0 à 100;
package Exercicio2_Algoritimos;

public class _06 {

	public static void main(String[] args) {
		int _numero = 0;
		for (_numero = 1; _numero<=100; _numero++){
			if ((_numero % 2) == 0){
				System.out.println(_numero);
			}
		}
	}
}
