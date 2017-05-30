//9)	Imprima apenas números múltiplos de 3, do número digitado pelo usuário;
package Exercicio2_Algoritimos;

import java.util.Scanner;

public class _09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numero;
		System.out.println("Digite o Primeiro número Inteiro:");
		numero = scanner.nextInt();
		System.out.println("O número digitado é: " + numero);
		for (int numeroD= -1; numeroD<=numero; numeroD++){
		if(numeroD % 3 == 0){
			System.out.println(numeroD);
			}
		}
	}
}

