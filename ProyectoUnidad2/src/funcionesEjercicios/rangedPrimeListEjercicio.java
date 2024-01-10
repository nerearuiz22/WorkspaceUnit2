package funcionesEjercicios;

public class rangedPrimeListEjercicio {
	
	public static void rangedPrimeList (int a, int b) {
		
		//Averiguo máximo y mínimo
		int max = (a>=b)? a:b;
		int min = (a<b)? a:b;
		
		//Extraigo los números impares entre el mínimo y el máximo
		for (int i=min; i<=max; i++) {
			
		while (i%2 == 1) {
			System.out.print("Los números impares entre " + a + " y " + b + " son " + i);
		}
		}
		}

	public static void main(String[] args) {
		int a = 0, b = 0;
		rangedPrimeList(a, b);
	}
}
