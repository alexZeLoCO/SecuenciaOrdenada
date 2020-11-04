import java.util.Scanner;		//SCANNER
public class SecuenciaOrdenada {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);		//TECLADO
		int n=0;		//INICIALIZA N 
		int anterior;		//INICIALIZA VALOR ANTERIOR
		System.out.print("Introducir secuencia de n�meros: ");		//SOLICITA VALOR
		
		do {
			anterior = n;		//ACTUALIZA VALOR ANTERIOR
			n = teclado.nextInt();		//PIDE VALOR
			if (n!=0 && anterior>n) {		//SI EL VALOR ANTERIOR ES MAYOR AL ACTUAL
				System.out.print("Los valores de la secuencia no est�n ordenados de forma creciente.");		//OUTPUT
			} else {		//SI NO
				if(n==0) {		//S�LO PARA EL �LTIMO VALOR DE LA SECUENCIA
					System.out.print("La secuencia est� ordenada de forma creciente.");		//OUTPUT
				}
			}	
			
		} while (n!=0 && anterior<=n); 		//CONDICI�N
	
	}
}
