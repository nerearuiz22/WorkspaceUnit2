package buclesEjerciciosProfe;

import java.util.Scanner;

public class Ejercicio12Cadenas {

	public static void main(String[] args) {

		int n = 0;
		int cont = 1;
		String tree = "";
		int height = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print ("Enter the tree height:");
		height = sc.nextInt();
		
		for (int i = 1; i<=height; i++) {  //La i son las filas
			
			for (int j = 1; j<=i; j++) { //La j son las columnas
				
				tree = tree + "*";
				System.out.println();
			}
			tree = tree + "\n";
		}
		
		System.out.println (tree);
	}

}
