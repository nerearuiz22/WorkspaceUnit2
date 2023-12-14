package bucles.ejemplosenclase;

import java.util.Scanner;

public class ParesDesdeNHastaCero {

	public static void main(String[] args) {
		
		//Vamos a mostrar los pares desde n hasta 0
		
		int num = 0;
		int numAux;
		
        Scanner sc = newScanner(System.in);
		
		System.out.println ("Introduce un número para mostrar pares hasta el cero");
		num = sc.nextInt();
		
		numAux = num;
		
		if (numAux%2!=0) 
			numAux--;
		
		
		System.out.println ("Los números pares entre " + num + " y cero son:");
		
		for (int i = numAux; i>=0; i=i-2) {
			if (i==0)
				System.out.print (i);
			else 
				System.out.print (i + ", ");
		}
		
		
	}

}
