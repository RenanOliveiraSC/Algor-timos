//7.Utilizando for, imprimir no console um abaixo do outro, valores de 10 a 20, 
//somente valores múltiplos de 5 seguindo o exemplo da mensagem 
//(Este número é múltiplo de 5: <número>) ou múltiplos de 10 seguindo o exemplo da mensagem 
//(Este número é múltiplo de 10: <número>). Alterar o <número> para o valor da variável do contador.
package interadores;

import java.util.Scanner;

public class _07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		for (int n = 10; n <= 20; n++)
			if (n % 5 == 0 && n % 10 == 0) {
				System.out.println("Este número é múltiplo de 5:" + n);
				System.out.println("Este numero é multiplo de 10:" + n);

			}
	}
}
