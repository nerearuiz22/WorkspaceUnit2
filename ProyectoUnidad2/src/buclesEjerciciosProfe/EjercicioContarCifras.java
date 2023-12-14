package buclesEjerciciosProfe;

import java.util.Scanner;

public class EjercicioContarCifras {

	public static void main(String[] args) {
		
		int num = 0;
		//Variable auxiliar para no perder el valor que me interesa.
		int numAux = 0;
		//Cont es 1 porque la última vez que hay quye contar el valor de numAux será 0.
		int cont = 1;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un número: ");
		num = sc.nextInt();
		
		numAux=num;
		
		while (numAux>0) {
			numAux = numAux/10;
			cont++;
		}
		
		System.out.print("El número " + num + " tiene " + cont + " cifras");
		
		
	//DEBERES FIN DE SEMANA
	//Una vez sabidas las cifras del número, mostrar cada cifra separada por comas 
	//Para el número 2345, mostrar 2,3,4,5.
	}
		for (int i = cont-1; i>=0; i--) {
			
		}
		

	}


