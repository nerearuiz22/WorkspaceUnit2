package buclesEjerciciosProfe;

import java.util.Scanner;

public class Problem11 {

	public static void main(String[] args) {
		
		int n = 0;
		String tree = "";
		int height = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print ("Enter the tree height:");
		height = sc.nextInt();
		
		for (int i = 1; i<=height; i++) {  //La i son las filas
			
			for (int j = 1; j<=i; j++) { //La j son las columnas
				//El bucle de fuera se encarga de imprimir cada fila
				tree = tree + i + " ";
			
			}
			//El bucle de fuera se encarga de saltar de línea
			//System.out.println (); 
			
			tree = tree + "\n";
		}
		System.out.println (tree);


	}

}
