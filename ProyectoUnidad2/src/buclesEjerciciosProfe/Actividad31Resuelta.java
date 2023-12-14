package buclesEjerciciosProfe;

import java.util.Scanner;

public class Actividad31Resuelta {

	public static void main(String[] args) {
		
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero :");
		num = sc.nextInt();
		
		while (num!=0) {
			if (num%0==0) {
				System.out.println("El número es par");
			}else{
				System.out.println("El número NO es par");
			}
			
			if (num>=0){
				System.out.println("El número es positivo");
			}else{
				System.out.println("El número NO es positivo");
			}
		
			int cuadrado = Math.pow(num, 2);
			System.out.println(cuadrado);
			
		}
		
	}

}
