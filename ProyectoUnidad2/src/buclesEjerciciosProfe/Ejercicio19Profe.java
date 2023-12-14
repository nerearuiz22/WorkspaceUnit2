package buclesEjerciciosProfe;

import java.util.Scanner;

public class Ejercicio19Profe {

	public static void main(String[] args) {
		
		int n = 0;
		double sum = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un número: ");
		n = sc.nextInt();
		
		for (int i = 1; i<=n; i++)  {
			
			
			//Para evitar que salga la última coma al final
			if (i==n)
				System.out.println(1.0/i);
				
			else
			   System.out.print(1.0/i + ",");
			
			sum=sum+1.0/i;
		}
		
		System.out.print("El resultado de la suma es: " + sum);
	}

}
