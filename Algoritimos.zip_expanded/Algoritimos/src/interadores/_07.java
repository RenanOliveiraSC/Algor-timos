//7.Utilizando for, imprimir no console um abaixo do outro, valores de 10 a 20, 
//somente valores m�ltiplos de 5 seguindo o exemplo da mensagem 
//(Este n�mero � m�ltiplo de 5: <n�mero>) ou m�ltiplos de 10 seguindo o exemplo da mensagem 
//(Este n�mero � m�ltiplo de 10: <n�mero>). Alterar o <n�mero> para o valor da vari�vel do contador.
package interadores;

import java.util.Scanner;

public class _07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		for (int n = 10; n <= 20; n++)
			if (n % 5 == 0 && n % 10 == 0) {
				System.out.println("Este n�mero � m�ltiplo de 5:" + n);
				System.out.println("Este numero � multiplo de 10:" + n);

			}
	}
}
