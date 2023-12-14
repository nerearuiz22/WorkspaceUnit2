package bucles;

import java.util.Scanner;

public class TablaDeMultiplicarDiezNumeros {

	public static void main(String[] args) {
	       
		//Tabla desde el 1 hasta el 10
		
	      for (int i=1; i<=10; i++) {
	    	  System.out.println("Tabla de multiplicar para el " + i);
	    	  System.out.println("---------------------------");
	    	
	       for (int j=1; j<=10 ; j++) {
	      
	           System.out.println(i+"x"+j+"="+ (i*j));
	       } 
	       System.out.println("**********************************");
	      }
	}
	}


