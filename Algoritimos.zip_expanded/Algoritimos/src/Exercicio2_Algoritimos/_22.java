//22)	Desenhe a seguinte pir�mide de n�meros. O usu�rio determina a quantidade de linhas. Necessitar� de 2 for.
package Exercicio2_Algoritimos;

import java.util.Scanner;

public class _22 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o n�mero de Linhas");
		int qtdLinhas = scanner.nextInt();
		for (int linha = 1; linha <= qtdLinhas; linha++) {
			for (int coluna = 1; coluna <= linha; coluna++) {
				if (linha < 10) {
					System.out.print("0" + linha + " ");
				} else {
					System.out.print(linha + " ");
				}
			}
			System.out.println("");
		}
		scanner.close();
	}
}