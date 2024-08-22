public class AulaVetores {

	public static void main(String[] args) {
		
		// declaração de vetor
		int y[];
		double d[];
		
		// criação de vetor
		y = new int[20];
		d = new double[50];
		
		// declaração com criação de vetor
		char x[] = new char[100];
		
		// declaração e criação direta
		int vetor[] = {1, 2, 3, 4};
		
		for( int i = 0; i < 20 ; i++ ) {
			// preenche com numeros impares
			y[ i ] = (i*2) + 1;
		}
		
		for( int i = 0; i < 50; i++ ) {
			// preencher com multiplos de 10
			d[ i ] = i * 10;
		}
		
		// mostrar o vetor na tela
		// y.length = tamanho do vetor = 20
		for( int i = 0 ; i <= y.length ; i++ ) {
			System.out.print(y[i] + ", ");
		}	
		
		System.out.println();
		
		for( int i = 0 ; i < d.length; i++ ) {
			System.out.print(d[i] + ", ");
		}
		
	}
}
