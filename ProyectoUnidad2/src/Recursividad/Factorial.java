package Recursividad;
import java.util.Scanner;
public class Factorial {

		static long factorial(long n) {
			
			return factorialDeColaAux(n,1);
			
		}
		
		//Private -> Esta función no la puuede editar el usuario
		static long factorialDeColaAux(long n, long acumulador) {
			
			if (n==0) 
				return acumulador;
			else
				return factorialDeColaAux (n-1, n*acumulador);
			
			
		}
		
		//Se simplifica la llamada
		//Public -> Dejas que esta sea la unica función que el usuario puede editar
       static long factorialDeCola(long n) {
    	   return factorialDeColaAux (n,1);
		}
		
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
		      long num; //número introducido por el usuario
		      Scanner sc = new Scanner(System.in);
		      System.out.print("Introduzca un número para calcular el factorial: ");
		      num = sc.nextInt();

			System.out.println(factorial(num));

		}

	}
