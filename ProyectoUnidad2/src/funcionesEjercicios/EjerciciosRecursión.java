package funcionesEjercicios;

public class EjerciciosRecursión {
	
	public static int sumaNPrimerosNumeros (int n) {
	
		if (n == 0) {  //caso base
			return 0;
		}else { //definición recursiva
			return n + sumaNPrimerosNumeros(n-1);
		}
		
	}
	
	//Ejercicio anterior con variable acumualdor
	public static int sumaNPrimerosNumerosAux (int n, int acumulador) {
		
		if (n == 0) {  
			return acumulador; //Acumulador -> 0
		}else {
			return n + sumaNPrimerosNumerosAux(n-1, acumulador+n);
		}
		
	}
	
	public static int sumaNPrimerosNumerosMejorado (int n) {
		
		return sumaNPrimerosNumerosAux (n,0);	
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
	
	
	//Input -> 2354
	//Output -> 4532
	private static int reverseNumberAux (int number, int result) {
		int digit = 0;
		 if (number==0) {
			 return result;
		 }else {
			 digit = number%10;
			 result = digit + result *10;
			 number = number/10;
			 return reverseNumberAux (number, result);
		 }
	  }
	
   public static int reverseNumber (int number) {
	   
  }
   
   
   //a elevado a 0 es 1, a elevado 1 es 1 -> Son las bases del termino Pibonacci, es decir 2 casos bases.
   //a elevado a 3 es a elevado a o + a elevado a 1 que es igual a 2. Y asi a continuación
   //Dos casos bases
   public static int terminoPibonacci (int n) {
		 if (n == 0) {
			 return 1;
		 }else if (n==1){
			 return 1; 
		 }
			 else {
				 return terminoPibonacci (n-1) + terminoPibonacci (n-2); 
			 }
	   
   }
   

   public static int mcdRecursion (int a, int b) {
	   
	 if (b==0) {
		 return a;
	 }else {
		 return mcdRecursion(b, a%b);
	 }
   }
   
   //Aquí da igual que a sea mayor o menor que b
   public static int mcdRecursionMejorado (int a, int b) {
	   
		 if (a>=b) {
			 return mcdRecursion(a,b);
		 }else {
			 return mcdRecursion(b, a);
		 }
	   }
   
   

	public static void main(String[] args) {
	int n = 5;
	imprimirDesdeNHasta1 (n);
	}

}
