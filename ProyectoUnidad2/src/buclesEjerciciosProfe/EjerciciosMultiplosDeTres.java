package buclesEjerciciosProfe;

import java.util.Scanner;

public class EjerciciosMultiplosDeTres {

	//Programa va a coger un numero n pòr pantalla, mostrará desde n hasta 3, todos los multiplos de 3.
	
	//Normal: Con derecremnto
	
	//Primero, version
	//Segundo con prog dinámica. Pensando en como mejorar el algotirmo para poder hacer el decremento
	
	
	public static void main(String[] args) {
		
		//VERSIÓN NORMAL
				//for (int i=n; i>=3; i--) {
				//if (i%3 == 0){
					//System.out.println (i);
		
		int n = 0;
		int imultTresCercano = 0;
		
        Scanner sc = new Scanner(System.in);
		
		System.out.println ("Introduce un número para mostrar los multiplos de 3:");
		n = sc.nextInt();
		
		
		imultTresCercano = n - (n%3);
		//Ejemplo n=11, el resto sería 2. 11-2 seria 9. Y 9 es el multiplo de 3 inferior y cercano a n (11). 
		
		
		//VERSIÓN EFICIENTE Y DINÁMICA
		for (int i= imultTresCercano; i>=3; i=i-3) {
			System.out.println (i + " , ");
		}

		}

	}

