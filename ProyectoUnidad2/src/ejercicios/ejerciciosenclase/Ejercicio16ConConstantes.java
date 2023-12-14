package ejercicios.ejerciciosenclase;

import java.util.Scanner;

public class Ejercicio16ConConstantes {
	private static final double PRECIO_CINCO_MIN=1;
    private static final double PRECIO_CINCO_OCHO_MIN=0.8;
    private static final double PRECIO_OCHO_DIEZ_MIN=0.7;
    private static final double PRECIO_DIEZ_MIN=0.6; 
    
    private static final int RANGO_CINCO = 5;
    private static final int RANGO_OCHO= 8;
    private static final int RANGO_DIEZ= 10;
    
	public static void main(String[] args) {
		 
		   int min; 
		   double precio=0.0;
		   
		   Scanner sc = new Scanner(System.in);
		   
		   System.out.print("Introduzca los minutos de llamada: ");
		   min = sc.nextInt();
		   
		   
		    if (min<=RANGO_CINCO) {
		       
		        precio = min *PRECIO_CINCO_MIN;
		    }
		    else if ( min <= RANGO_OCHO) {
		       
		        precio = RANGO_CINCO * PRECIO_CINCO_MIN + (min - RANGO_CINCO) * PRECIO_CINCO_OCHO_MIN;
		       
		       
		    } else if (min <= RANGO_DIEZ) {
		       
		        precio = RANGO_CINCO * PRECIO_CINCO_MIN + 3 * PRECIO_CINCO_OCHO_MIN + (min - RANGO_OCHO) * PRECIO_OCHO_DIEZ_MIN;
		    } else {
		       
		        precio = RANGO_CINCO * PRECIO_CINCO_MIN + 3 * PRECIO_CINCO_OCHO_MIN + (RANGO_DIEZ-RANGO_OCHO) * PRECIO_OCHO_DIEZ_MIN + (min -RANGO_DIEZ)*PRECIO_DIEZ_MIN;
		    }
		   
		   
		    System.out.println("El precio para " + min + " minutos es :" + precio);

		   }

	}
