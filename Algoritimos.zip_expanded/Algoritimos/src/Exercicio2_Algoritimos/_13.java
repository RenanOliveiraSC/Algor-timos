//13)	Imprima somente números divisíveis por 5, de 1000 à 0;
package Exercicio2_Algoritimos;

public class _13 {

	public static void main(String[] args) {
		for(int n=5; n<=1000; n++){
			if(n % 5 ==0){
				System.out.println(n);
			}
		}
	}
}
