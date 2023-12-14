package buclesEjerciciosProfe;

import java.util.Scanner;

public class Ejercicio4FactorialConFor {

	public static void main(String[] args) {
		
		//We declare a variable to enter a number by the user.
		int num = 0;
		//We declare a counter variable that starts at 1.
		int resultadoFact = 1;
		
		//We introduce the scanner to enter values ​​in the variable num.
		Scanner sc = new Scanner(System.in);
		
		//The program asks the user for a number on the screen and it is stored.
		System.out.println("Escribe un número entero para calcular el factorial:");
		num = sc.nextInt ();
		
		//For loop.
		//First the first condition is evaluated only once (int i = 1;)
		//Second condition is met  (i++). an accumulator variable that goes from 2 to 2.
		//Finally, the purpose condition is checked. (i<=num;).
		for (int i = 1; i<=num; i++ ) {
			
			//The variable counter will take the value of the counter multiplied by i. 
			resultadoFact= resultadoFact*i;
			
		}
		System.out.println("!" + num + "=" + resultadoFact); //Finally the result will be shown on the screen.
	}

}
