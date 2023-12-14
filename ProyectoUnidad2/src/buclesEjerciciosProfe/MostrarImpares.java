package buclesEjerciciosProfe;

import java.util.Scanner;

public class MostrarImpares {

	public static void main(String[] args) {
		
		//variable to display odd numbers up to n
		int n = 0;
	
		//We introduce the scanner to enter values ​​in the variable n.
		Scanner sc = new Scanner(System.in);
		
		//The program asks the user for a number on the screen and it is stored.
		System.out.println ("Introduce un número para mostrar sus impares:");
		n = sc.nextInt();
		
		//For loop.
		//First the first condition is evaluated only once (int = 1;)
		//Second condition is met (i+=2). an accumulator variable that goes from 2 to 2.
		//Finally, the purpose condition is checked. (i<=n;)
		for ( int i=1; i<=n; i+=2) {
			
			//If method to show the comma or not at the end of the last number when displaying the result on the screen.
			//We find out in advance the termination condition so that in the last turn of the buble after the last odd one we do not write a comma.
			if (i+2>n) { //If the last even number, when subtracted by 1 and multiplied by 2, exceeds the value i added by 2, no comma is added since it is not the last number
				System.out.print (i );
			}else {
				System.out.print (i + "," ); //If it is the opposite, a comma will be displayed on the screen since in this case it is the last number.
			}
			
			
		}
	}

}
