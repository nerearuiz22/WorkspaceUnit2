package funcionesEjercicios;

public class Ejercicio22Funciones {

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
	 
	static double senX (long x, long precision) {
		double sumaTerminos = 0.0;
		long signo = 1;
		for (long i=0; i<=precision; i++) {
			if (i%2==0)
			    signo = 1;
			else 
				signo = -1;
			sumaTerminos+= signo * potencia (x,2*i+1) * potencia(x,2*i+1)/factorial (2*i+1);
		}
		return sumaTerminos;
	}
	
	static double terminoSen (long x, long n) {
		int signo = 1;
		if (n%2==0)
			signo = 1;
		else 
			signo = -1;
		return signo * potencia (x,2*n+1)/factorial (2*n+1); 
	}
	
	
	static double terminoCos (long x, long n) {
		int signo = 1;
		if (n%2==0)
			signo = 1;
		else 
			signo = -1;
		return signo * potencia (x,2*n)/factorial (2*n); 
	}
	
	static double cosX (long x, long precision) {
		double sumaTerminos = 0.0;
		long signo = 1;
		for (long i=0; i<=precision; i++) {
			if (i%2==0)
				signo = 1;
			else 
				signo = -1;
			sumaTerminos+= signo * potencia (x,2*i) * potencia(x,2*i)/factorial (2*i);
		}
		return sumaTerminos;
	}
	
		public static void main(String[] args) {
			System.out.println("E elevado 5 precision 20: " + funcionE(5,20));
			System.out.println("E elevado 5 precision 30: " + funcionE(5,30));
			System.out.println("Cos: " + cosX(5,30));
	}

}
