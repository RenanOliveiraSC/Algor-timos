//10. Imprima somente números múltiplos de 15 que são pares, de 0 à 1000;
package interadores;

import java.util.Scanner;

public class _10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	

		for(int lista = 15; lista <= 1000; lista = lista + 15){
			if(lista % 2 == 0){
				System.out.println(lista);

			}
		}
	}
}
