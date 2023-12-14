package ejercicios.ejerciciosenclase;

import java.util.Scanner;

public class Ejercicio6DeCarlos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x,y,z;
		
		System.out.print("Introduce la coordenada x:");
		x = sc.nextInt();
		System.out.print("Introduce la coordenada y:");
		y = sc.nextInt();
		
		if (x>0 && y>0) {
			System.out.print("Cuadrante 1");
		}else if (x<0 && y>0)  {
			System.out.print("Cuadrante 2");
		}else if (x<0 && y<0)  {
			System.out.print("Cuadrante 3");
		}else {
		System.out.print("Cuadrante 4");
	}
	}

}
