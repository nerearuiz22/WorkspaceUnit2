package buclesEjerciciosProfe;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		
		int altura = 0;
		int anchura = 0;
		String tree = "";
		
		Scanner sc = new Scanner(System.in);
		System.out.print ("Enter the tree height:");
		altura = sc.nextInt();
		
		anchura = 2*altura - 1;
		
		for (int i = 1; i<=altura; i++) {
			//Bucle para pintar blancos
			
			for (int j = 1; j <= altura - i; j++) {
				tree = tree + "  ";
			}
			//Bucle para pintar asteriscos
			for (int k = 1; k <= 2*i-1; k++) {
				tree = tree + "* ";
				
			}
			
			tree = tree + "\n";
	}
		System.out.println (tree);
		
	}

}
