package bucles.ejemplosenclase;

import java.util.Scanner;

public class EjemploBucleSumas {

	public static void main(String[] args) {
		//Bucle que pide al usuario un numero por pal usuario y los suma. El bucle acabará cuando introduzcamos el número cero
		int num=0;
		int sum=0;
		//El profe quiere valor max y min
		int max;
		int min;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero distinto de cero para sumar:");
		System.out.println("Si el numero es cero acaba el programa");
		num = sc.nextInt();
		
		max=num; //Primer número que introducimos por pantalla. El primero pasa a ser el máximo.
		min=num; //Primer número que introducimos por pantalla. El primero pasa a ser el mínimo. No puede ser 0.
		
		while (num!=0){
			sum=sum+num; //sum+=num
			
			System.out.println("Introduce otro numero:"); //Se repetirá la sentencia infinitamente hasta que introduzcas 0.
			num = sc.nextInt();
			
			if (num>max) {
				max=num;
			}
			if (num!=0 && num<min) { //Como el mínimo  no peude ser 0 se declara num!=0.
				min=num;
			}
		}
		System.out.println("El resultado de la suma es:" + sum);
		System.out.println("El máximo es: " + max);
		System.out.println("El mínimo es: " + min);

	}

}
