package Recursividad;
import java.util.Scanner;
public class FactorialDeCola {
			
			static long factorial(long n)
			{
			 
			    //
			    if (n == 0)
			    	return 1;

			    else
			        return n*factorial(n-1);
			}

			
			static long factorialOverflow(long n)
			{
			    // Puede causar overflow
			    //
			    if (n == 100)
			    	return 1;

			    else
			        return n*factorialOverflow(n-1);
			}

			public static void main(String[] args) {
				
			      long num; //número introducido por el usuario
			      Scanner sc = new Scanner(System.in);
			      System.out.print("Introduzca un número para calcular el factorial: ");
			      num = sc.nextInt();

				System.out.println(factorial(num));
				
				System.out.println(factorialOverflow(num));

	}


