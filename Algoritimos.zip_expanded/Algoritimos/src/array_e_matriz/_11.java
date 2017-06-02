//11.	Criar um array do tipo boolean de 6 posições. 
//Utilizando um for, popular o array aonde as posições forem pares colocar o valor true, e nas posições ímpares o valor false.
package array_e_matriz;

import java.util.Scanner;

public class _11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		boolean[] v = new boolean[6];
		for(int c = 0; c < 6 ; c++){
			if(c % 2 == 0){
				System.out.println("true");
			}
			else{
				System.out.println("false");
			}
		}
	}
}
