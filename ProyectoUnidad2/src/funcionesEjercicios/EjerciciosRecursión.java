package funcionesEjercicios;

public class EjerciciosRecursión {
	
	public static int sumaNPrimerosNumeros (int n) {
	
		if (n == 0) {  //caso base
			return 0;
		}else { //definición recursiva
			return n + sumaNPrimerosNumeros(n-1);
		}
		
	}
	
	//Return vacío se acepta en static VOID
   public static void imprimirDesde1HastaN (int n) {
		
		if (n == 0) {  //caso base
			return; //Devuelve por consola N
		}else { //definición recursiva
			imprimirDesde1HastaN(n-1);
			System.out.println(n + " ");
			return;
		}
	}
	
	public static void imprimirDesdeNHasta1 (int n) {
		if (n == 0) {  //caso base
			return; //Devuelve por consola N
		}else { //definición recursiva
			System.out.println(n + " ");
			imprimirDesdeNHasta1(n-1);
			return;
		}
	}
	
	public static int numDigits (int number) {
		if (number == 0) {  
			return 0;
		}else { 
			return 1+numDigits(number/10); //Ejemplo: number -> 1000. 1+(1000/10) -> 1+ 300 -> 4 dígitos
		}
	}

	public static void main(String[] args) {
	int n = 5;
	imprimirDesdeNHasta1 (n);
	}

}
