package ejercicios.ejerciciosenclase;

import java.util.Scanner;

public class EjemploSwitchConEnum {
	
	enum Mes
	{
		ENERO, FEBRERO, MARZO, ABRIL, MAYO, JUNIO, JULIO, AGOSTO, SEPTIEMBRE, OCTUBRE, NOVIEMBRE, DICIEMBRE;
	}
	
	//Java lo lee como un entero, cada mes correspode a un número, va desde el 0 hasta el 11.

	public static void main(String[] args) {
		
		String nombreMes;
		
		Scanner sc = new Scanner(System.in);
		
		Mes mes= Mes.ENERO; //Mes ahora es una variable, como int o double,etc.Le asignamos el valor de un valor dentro de la variable (enero)
		
		System.out.println("Enero es: " + mes.ordinal()); 
		
		Mes mes2 = mes.valueOf("FEBRERO");
		
		System.out.println("Febrero es: " + mes.ordinal()); 
		
		System.out.println("Introduce el nombre del mes:");
		
		nombreMes = sc.nextLine(); //Cojo el numero del mes
		
		mes = Mes.valueOf(nombreMes.toUpperCase());  
				
		switch (mes)
        {
        case DICIEMBRE,ENERO,FEBRERO:
            System.out.println("Frio, a veces lluvioso a veces nevado.");
            break;
        case MARZO, ABRIL, MAYO:
            System.out.println("La primavera ha llegado, mejor tiempo.");
            break;
        case JUNIO, JULIO, AGOSTO:
        	
        	System.out.println("Tiempo de verano, vacaciones para disfrutar de un tiempo humedo y caluroso.");
        break;
        case SEPTIEMBRE, OCTUBRE, NOVIEMBRE:
            System.out.println("Buen tiempo para actividades f�sicas hasta noviembre.");
            break;
        default:
            System.out.println("Te has olvidado algún mes?");
            break;
        }
	}

}
