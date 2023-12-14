package ejercicios.ejerciciosenclase;

import java.util.Scanner;

public class Ejercicio14Libro {

	private static final String Char = null;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int num,u,d;
        String unidades = "";
        String decenas = "";
        String resultado = "";
		
		System.out.print("Introduce un número ente 1 y 99:");
		num = sc.nextInt();
		
		u = num%10;
		d = num/10;
		
		unidades = switch (u) {
		case 0 -> "cero";
		case 1 -> "uno";
		case 2 -> "dos";
		case 3 -> "tres";
		case 4 -> "cuatro";
		case 5 -> "cinco";
		case 6 -> "seis";
		case 7 -> "siete";
		case 8 -> "ocho";
		case 9 -> "nueve";
		default -> "";
		};
		
		if (d!=0) {
			decenas = switch (d) {
			case 1 -> "diez";
			case 2 -> "veinte";
			case 3 -> "treinta";
			case 4 -> "cuarenta";
			case 5 -> "cincuenta";
			case 6 -> "sexenta";
			case 7 -> "setenta";
			case 8 -> "ochenta";
			case 9 -> "noventa";
			default -> "";
		};
		}
		if (d!=0) {
			resultado = decenas + " y " +  unidades;
		}else  { 
			//No hay decenas y me falta controlar el 0
			if (u==0){
				unidades = "cero";
			resultado=unidades;
		}
		}
		System.out.println ("El número " + num + " se escribe: " + resultado);
	}
	}

