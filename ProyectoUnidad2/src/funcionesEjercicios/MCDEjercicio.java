package funcionesEjercicios;

public class MCDEjercicio {

	 static double maximoComunDivisor (int a, int b) {
		 //Operador ternario
			int max = (a>=b)? a:b;
			int min = (a<b)? a:b;
			
			while (min > 0) {
				int temp = min;
				min = max%min;
				int aux = min;
				a = temp;
			}
		return a;
		}	
	
	
	public static void main(String[] args) {
	

	}

}
