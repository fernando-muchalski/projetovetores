/*
 * Faça um programa que crie um vetor com 10 inteiros e 
 * inicialize-o com números de 1 a 10. Mostre o vetor
 */
public class Exercicio1 {
	public static void main(String[] args) {
		
		// declarar vetor com 10 inteiros
		int x[] = new int [10];
		
		// inicializar vetor
		for(int i = 0; i < 10; i++) {
			x[i]= i + 1;		
		}
		
		// mostrar vetor
		for(int i = 0; i < 10; i++ ) {
			System.out.println(x[i]);
		}
		
	}
}
