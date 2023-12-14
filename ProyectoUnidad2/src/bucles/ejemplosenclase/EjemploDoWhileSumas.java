package bucles.ejemplosenclase;

import java.util.Scanner;

public class EjemploDoWhileSumas {

	public static void main(String[] args) {
		
		
				int num=0;
				int sum=0;
				//Ponemos como max el numero más pequeño  Con el fin de que el máximo sea unnu´mero de los que introduzcamos.
				// El min como el número mas grande.
				int min = Integer.MAX_VALUE;
				int max = Integer.MIN_VALUE; //Cualquier numero que introduzca será el pequeño.
				
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Introduce un numero distinto de cero para sumar:");
				//Como el do while se ejecuta al menos una vez no hace falta pedir numeros fuera y dentro del bucle como haciamos con while.
				System.out.println("Si el numero es cero acaba el programa");
				num = sc.nextInt();
				
				max=num; 
				min=num; 
				
				do {
			
					System.out.println("Introduce otro numero:"); 
					num = sc.nextInt();
					sum=sum+num; 
					
					//No asegruamos de que el max y el min no sea cero. Y a que cero es el número de salida
					if (num>max  && num!=0 ) {  //Hay mas posibilidad de que ocurra el primero que el segundo. 
						max=num;
					}
					if (num<min && num!=0) { 
						min=num;
					}
				}while (num!=0);
					
					
	
				System.out.println("El resultado de la suma es:" + sum);
				System.out.println("El máximo es: " + max);
				System.out.println("El mínimo es: " + min);
		
		

	}

}
