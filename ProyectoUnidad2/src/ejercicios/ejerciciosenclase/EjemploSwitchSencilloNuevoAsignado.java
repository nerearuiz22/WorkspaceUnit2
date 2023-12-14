package ejercicios.ejerciciosenclase;

import java.util.Scanner;

public class EjemploSwitchSencilloNuevoAsignado {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int num, resultado;
		
		System.out.print("Introduce un número:");
		num = sc.nextInt();
		
		
		
		resultado = switch (num) {
		
		case 1 -> num+1; //Si eligo este caso le sumaré un 1 al resultado
		
		case 2 -> { System.out.println("Has introducido el 2"); //Si se escoge el caso 2 mostrará por consola dos mensajes y  un nuevo valor
		   System.out.println("Aquí si hace falta las llaves");
		    yield num+2; //Asignar a la variable resultado un nuevo valor
		}
		default -> 7; //Por defecto en caso de introducir un 3er caso

	}; //Siempre punto y coma al final de la llave de switch
	}

}
