package buclesEjerciciosProfe;

import java.util.Scanner;

public class Ejercicio21Profe {

	public static void main(String[] args) {
		
		int n = 0;
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un número: ");
		n = sc.nextInt();
		
		for (int i = 0; i<=n; i++) {
			
			if (i==n)
				System.out.println(5*i-3);
				
			else
				System.out.print(5*i-3 + ",");
			
			sum=sum+i;
			
			
		}
		System.out.print("El resultado de la suma es: " + sum);

	}

}
