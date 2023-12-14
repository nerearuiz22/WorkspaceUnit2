package ejercicios.ejerciciosenclase;

import java.util.Scanner;

public class EjemploConstantes {
		private static final double PRECIO_PASO1=0.8;
	    private static final double PRECIO_PASO2=0.7;
	    private static final double PRECIO_PASO3=0.6;
	    private static final double PRECIO_PASO4=0.4;
	   
	    private static final int CORTE1= 4;
	    private static final int CORTE2 = 7;
	    private static final int CORTE3 = 9;
	   
	   public static void main(String[] args) {
	       
	    int min,minaux; //número introducido por el usuario
	    double precio=0.0;
	    
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.print("Introduzca los minutos de llamada: ");
	    min = sc.nextInt();
	   
	    if (min<=CORTE1) {
	       
	        precio = min *PRECIO_PASO1;
	    }
	    else if ( min <= CORTE2) {
	       
	        precio = CORTE1 * PRECIO_PASO1 + (min - CORTE1) * PRECIO_PASO2;
	       
	       
	    } else if (min <= CORTE3) {
	       
	        precio = CORTE1 * PRECIO_PASO1 +
	                (CORTE2-CORTE1) * PRECIO_PASO2
	                + (min - CORTE2) * PRECIO_PASO3;
	    } else {
	       
	        precio = CORTE1 * PRECIO_PASO1 +
	                (CORTE2-CORTE1) * PRECIO_PASO2
	                + (CORTE3-CORTE2) * PRECIO_PASO3
	                + (min -CORTE3)*PRECIO_PASO4;
	    }
	   
	   
	    System.out.println("El precio para " + min + " minutos es :" + precio);

	   }


	}


