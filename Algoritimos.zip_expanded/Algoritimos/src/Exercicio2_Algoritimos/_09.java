//9)	Imprima apenas n�meros m�ltiplos de 3, do n�mero digitado pelo usu�rio;
package Exercicio2_Algoritimos;

import java.util.Scanner;

public class _09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numero;
		System.out.println("Digite o Primeiro n�mero Inteiro:");
		numero = scanner.nextInt();
		System.out.println("O n�mero digitado �: " + numero);
		for (int numeroD= -1; numeroD<=numero; numeroD++){
		if(numeroD % 3 == 0){
			System.out.println(numeroD);
			}
		}
	}
}

