package bucles;

import java.util.Scanner;

public class DoWhileHarmonicos {
	
	
	
	 public static void main(String[] args) {
	        int i;
	        
	        i = 1;

//variable n, el tamaño de la serie. Necesitamos obtener este valor 
// de la consola

	        int n=1;
	        double elementoSerie=1;
	        double sumatorioSerie=elementoSerie;
	        Scanner sc = new Scanner(System.in);

			

				System.out.println("Cuantos elementos de la serie harmónicos quieres calcular? "
						+ "\nIntroduce un entero máyor que 1");
				
//variable n, el tamaño de la serie. Necesitamos obtener //este //valor de la consola

		
				n = sc.nextInt();
				
				
			do {
				
				System.out.println("El termino   " + i +  " para la serie harmónicos es "+ elementoSerie);
				i++;
				elementoSerie = elementoSerie +  (1/(double) i);
				sumatorioSerie=sumatorioSerie+ elementoSerie;
				
				
			} while (i<=n);
	
				
				System.out.println("\nEl sumatorio de los   " + n +  " elementos de la serie harmónicos es "+ sumatorioSerie);

				
				
	 }
}
