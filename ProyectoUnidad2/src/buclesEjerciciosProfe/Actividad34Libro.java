package buclesEjerciciosProfe;

import java.util.Scanner;

public class Actividad34Libro {

	public static void main(String[] args) {
		
		int altura = 0;
		int etiqueta = 0;
		int maxAltura = 0;
		//El primer máximo es la primera etiqueta.
		 
		int maxEtiqueta = etiqueta;
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Introduce la altura de un árbol");
		altura = sc.nextInt();
		
		while (altura!=-1) {
			if (altura>maxAltura) {
				maxAltura = altura;
				maxEtiqueta = etiqueta;
			}
			etiqueta++;
			System.out.println("Introduce la altura de un árbol");
			altura = sc.nextInt();
		}
		
		System.out.println("El árbol con etiqueta " + maxEtiqueta + " tiene de altura" + maxAltura);
	}

}
