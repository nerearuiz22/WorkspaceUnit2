package buclesEjerciciosProfe;

import java.util.Scanner;

public class Problem12 {

	public static void main(String[] args) {
		
		/*
		 *           j columnas
		 * i filas   1 
		 *           2 3 
		             4 5 6
		 */ 
		
		
		int n = 0;
		int cont = 1;
		String tree = "";
		int height = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print ("Enter the tree height:");
		height = sc.nextInt();
		
		for (int i = 1; i<=height; i++) {  //La i son las filas
			
			for (int j = 1; j<=i; j++) { //La j son las columnas
				//El bucle de fuera se encarga de imprimir cada fila
				tree = tree + cont + " ";
				cont++;
			}
			//El bucle de fuera se encarga de saltar de línea
			//System.out.println (); 
			
			tree = tree + "\n";
		}
		System.out.println (tree);

	}

}
