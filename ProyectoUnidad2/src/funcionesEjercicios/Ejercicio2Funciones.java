package funcionesEjercicios;

import java.util.Scanner;

public class Ejercicio2Funciones {

	public static boolean EsMultiplo(int num1, int num2) {	
		//No hace falta hacer variables seimpre puedo devolver el valor true o false directamente porque num1%num1 == 0 es una expresión booleana 
		//boolean esMult = num1%num2 == 0;
		return num1%num2 == 0;
	}
	
	public static void main(String[] args) {
		int num1, num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce num1: ");
		num1 = sc.nextInt();
		System.out.println("Introduce num2: ");
		num2 = sc.nextInt();

		boolean esMult = EsMultiplo(num1,num2);
		System.out.println(num1 + " y " + num2 + " son multiplos:" + esMult);
		
		if (EsMultiplo(num1,num2)) 
			System.out.println(num1 + " y " + num2 + " son multiplos");
		else 
			System.out.println(num1 + " y " + num2 + " NO son multiplos");
		
	}

}
