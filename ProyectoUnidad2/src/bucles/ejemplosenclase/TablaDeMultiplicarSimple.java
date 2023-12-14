package bucles.ejemplosenclase;

import java.util.Scanner;

public class TablaDeMultiplicarSimple {

	public static void main(String[] args) {
		
		//We declare the variable n to enter a number by the user.
		int num = 0;
		
		//We introduce the scanner to enter values ​​in the variable n.
		Scanner sc = new Scanner(System.in);
		
		//The program asks the user for a number on the screen and it is stored.
		System.out.println ("Escribe un número entre el 1 y el 10:");
		num=sc.nextInt();
		
		//While loop until the user enters a number between 1 and 10. As long as the user does not type it, the loop message will be repeated.
		
		while(num<1 || num>10)  {
			System.out.println ("Error. Debes escribir un número entre el 1 y el 10:");
			num=sc.nextInt();
		}
		
		//Multiplication table with for loop.
		
		//First, initialization is done only once.
		//Then the instructions inside the braces are executed.
		//Then the increment is done.
		//Finally the condition is evaluated.
		
		for (int i=1; i<=10; i++) {
			System.out.println(num + "x" + i + "=" + (num*i)); //The result of the loop is shown on the screen.
		}

	}

}
