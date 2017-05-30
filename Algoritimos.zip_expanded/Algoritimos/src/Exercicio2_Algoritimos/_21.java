//21)	Desenhe a seguinte pirâmide de números. O usuário determina a quantidade de linhas. Necessitará de 2 for.
package Exercicio2_Algoritimos;

import java.util.Scanner;

public class _21 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe a quantidade de linhas;");
		int qtdLinhas = scanner.nextInt();
		for (int linha = 0; linha < qtdLinhas; linha++){
			for(int coluna = 0; coluna <= linha; coluna++){
				System.out.print("1");
			}
		System.out.println("");
		}
			scanner.close();
	}
}