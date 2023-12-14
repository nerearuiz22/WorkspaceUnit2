package buclesEjerciciosProfe;

import java.util.Scanner;

public class Ejercicio10Primos {

	public static void main(String[] args) {
		
		//Número primo es divisible sólo 1 y entre él.
		//Número no primo, es divisible por un número más que esos dos.
		
		int num = 0;
		
		//Suponemos que el númer0 es primo
		boolean esPrimo = true;
		
		
		Scanner sc = newScanner(System.in);
		
		System.out.println ("Introduzca el curso");
		num = sc.nextInt();
		
		//El bucle comienza en 2 porque todo número es divisible entre 1.

		
		//Con && esPrimo me garantizo que si el número no es primo no me hace seguir en el buble. (Es como un break; elegante).
		for (int i=2; i<=(num/2) && esPrimo; i++)  {
			
			//Si encontramos un número entre 2 y num-1 que lo divide, ya no es primo.
			if (num%i==0) 
				esPrimo=false;
			//Para que el programa no de más vueltas, se puede poner un break; para que en cuanto localice que no es primo se salga y no continue. Pero el break; es poco elegante.
			
		}
		if (esPrimo) {
			System.out.println ("El número: " + num + " es primo" );
		}else {
			System.out.println ("El número: " + num + " no es primo" );
		}
	}

}
// i<=(num/2)
//Se ha añadido esto por que se hace el programa más dinámico. Aqui sabemos que el número más pequeño divisible es 2, por tanto el numero partido por 2 saldrá el
//mayor número divisible, asi evitamos continuar y ahorrar tiempo. Un ejemplo sería num=10, 10/2=5, 5 es el máximo, por tanto es innecesario continuar más de 5.
