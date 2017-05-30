//8)	Imprima apenas número múltiplos de 2, de 0 até o número digitado pelo usuário;
package Exercicio2_Algoritimos;

import java.util.Scanner;

public class _08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num;
		System.out.println("Digite o Primeiro número Inteiro:");
			num = scanner.nextInt();
		System.out.println("O número digitado é: " + num);
		int numD = num;
		for (numD=0; numD<100; numD++){
			if((numD %2) == 0){
				System.out.println(numD);
			}
		}
	}
}