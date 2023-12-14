package buclesEjerciciosProfe;

import java.util.Scanner;

public class MostrarNImpares {

	public static void main(String[] args) {
		
		//We declare the variable n to enter a number by the user.
		int n = 0;
		
		//We introduce the scanner to enter values ​​in the variable n.
		Scanner sc = new Scanner(System.in);
		
		//The program asks the user for a number on the screen and it is stored.
		System.out.println ("Introduce el número n de imapres que vamos a mostrar:");
		n = sc.nextInt();
		
		//For loop.
		//First the first condition is evaluated only once (int = 1;)
		//Second condition is met (i+=2). an accumulator variable that goes from 2 to 2.
		//Finally, the purpose condition is checked. i<=(2*n-1);
		
		//Examples
		//For n=5 it is 1,3,5,7,9
		//The finishing condition is i=9 i<=(2*5-1)
		//For any n i=n i<=(n*2-1)
		
		for ( int i=1; i<=(2*n-1); i+=2) {
			//If method to show the comma or not at the end of the last number when displaying the result on the screen.
			//We find out in advance the termination condition so that in the last turn of the buble after the last odd one we do not write a comma.
			//If the last even number, when subtracted by 1 and multiplied by 2, exceeds the value i added by 2, no comma is added since it is not the last number
			if (i+2>(2*n-1)) {
				System.out.print (i );
			}else { //If it is the opposite, a comma will be displayed on the screen since in this case it is the last number.
				System.out.print (i + "," );
			}
			
			
		}

	}

}
