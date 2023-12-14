package buclesEjerciciosProfe;

import java.util.Scanner;

public class Ejercicio10Profe {

	public static void main(String[] args) {
		
		int num1;
		int num2;
		
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Introduce el número de filas");
		 num1 = sc.nextInt();
		 System.out.println("Introduce el número de columnas");
		 num2 = sc.nextInt();
		

	      for (int i=1; i<=6; i++) {
	    	  
	    	 for (int j=1; j>=6; j++) {
	    		 System.out.print(" # " + "\t");
		    	  
	    	 }
	    	 System.out.println("");
	    	  
	      }
	    

	}

}
