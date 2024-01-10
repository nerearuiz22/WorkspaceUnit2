package funcionesEjercicios;

public class Ejercicio7Funciones {

	static long potencia (long base, long exponente) {
		long resultado = 1;
		for (long i =0; i<exponente; i++) {
			resultado*=base;
		}
		return resultado;
	}
    static double factorial (double numFact) {
		double resultado = 1;
		for (long i = 1; i<=numFact; i++) {
			resultado *=i;
		}
		return resultado;
	}
	
	  static double nTermino (long x, long n) {
		  double res = potencia(x,n)/factorial(n);
		  return res;
	 }
	
	 static double funcionE (long x, long precision) {
		double sumaTerminos = 0.0;
		for (long i=0; i<=precision; i++) {
			sumaTerminos+=nTermino(x,i);
		}
		return sumaTerminos;
	}	
		
		public static void main(String[] args) {
			System.out.println("E elevado 5 precision 20: " + funcionE(5,20));
			System.out.println("E elevado 5 precision 30: " + funcionE(5,30));
	}

}
