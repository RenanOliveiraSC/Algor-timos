//8)	Imprima apenas n�mero m�ltiplos de 2, de 0 at� o n�mero digitado pelo usu�rio;
package Exercicio2_Algoritimos;

import java.util.Scanner;

public class _08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num;
		System.out.println("Digite o Primeiro n�mero Inteiro:");
			num = scanner.nextInt();
		System.out.println("O n�mero digitado �: " + num);
		int numD = num;
		for (numD=0; numD<100; numD++){
			if((numD %2) == 0){
				System.out.println(numD);
			}
		}
	}
}