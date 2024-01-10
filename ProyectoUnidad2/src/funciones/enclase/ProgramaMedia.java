package funciones.enclase;

import java.util.Scanner;

public class ProgramaMedia {

	public static void main(String[] args) {
		int num1,num2;
		double result;
		int media;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame el primer Numero");
		num1= sc.nextInt();
		
		System.out.println( "Dame el segundo Numero");
		num2= sc.nextInt();
		result = media(num1,num2);


		System.out.println( "La media es:" + result);
		
		public static double media( int x , int y ) {
			
			double calculo;
			
			calculo = (double) (x + y)  / 2;    
			return calculo;
			
			}
		
		public static long factorial (int n) {
			
			
			
		}
		
	}

}
