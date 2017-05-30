//4)	Imprima no console uma lista de 0 a 20 e de 30 a 40, utilizando apenas um for;
package Exercicio2_Algoritimos;

public class _04 {

	public static void main(String[] args) {
		for(int listaf = -1; listaf <= 30; listaf++){
			if (listaf>=20) {
				System.out.println(listaf +10);
			}else{ 
				System.out.println(listaf + 1);
			}
		}

	}
}