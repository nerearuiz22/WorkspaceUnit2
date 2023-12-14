package ejercicios.ejerciciosenclase;

import java.util.Scanner;

public class Ejercicio313Libro {

	public static void main(String[] args) {
		
		/**
		 * EL USUARIO INTRODUCE 22 HORAS 40 MINUTOS 45 SEGUNDOS
		 * 
		 * SACO LAS HORAS Y LOS MINUTOS DE LOS SEGUNDOS
		 * 
		 * Horas = 12000/3600 = 3
		 * Segundos = 12000%3600 = 1240 
		 * 
		 * SACO LOS MINUTOS Y SEGUNDOS DE LOS SEGUNDOS RESTANTES
		 * 
		 * Minutos = 1240/60 = 20 minutos
		 * Segundos = 1240%60 = 40 segundos
		 * 
		 */
		
		
		int horas, minutos, segundos;
		int incrementosegundos;
		int segundosAux;
		
		Scanner sc = new Scanner(System.in);
		
		int horasIncremento, minutosIncremento, segundosIncremento;
		int horasAcarreo, minutosAcarreo;
		int horasFinal, minutosFinal, segundosFinal;
		
		System.out.print("Introduce horas:");
		horas = sc.nextInt();
		System.out.print("Introduce minutos:");
		minutos = sc.nextInt();
		System.out.print("Introduce segundos:");
		segundos = sc.nextInt();
		
		System.out.print("Introduce segundos de incremento:");
		segundosIncremento = sc.nextInt();
		
		horasIncremento = segundosIncremento/3600;
		segundosAux = (segundosIncremento%3600);
		minutosIncremento = segundosAux/60;
		incrementosegundos = segundosAux%60;
		
		//Vamos a sumar
		segundosFinal = (segundos + segundosIncremento)%60;
		
		minutosAcarreo = (segundos + segundosIncremento)/60;
		minutosFinal = (minutos + minutosIncremento + minutosAcarreo)%60;
		
		horasAcarreo =(minutos + minutosIncremento + minutosAcarreo)/60;
		horasFinal = (horas + horasIncremento + horasAcarreo)%24;
		
		System.out.println("Hora:" + horasFinal + ":" + minutosFinal + ":" + segundosFinal);

	}

}
