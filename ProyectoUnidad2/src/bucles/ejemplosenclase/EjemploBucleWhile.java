package bucles.ejemplosenclase;

public class EjemploBucleWhile {

	public static void main(String[] args) {
		
		int i = 0; //Variable contador que empieza en 0.
		int sum =0; //Variable acumulador
		int max;
		int min;
		
		//Variables de tipo máximo y mínimo
		max=i;
		min=i;
		
		
		while (i<10){ //Mientras se cumpla la sentencia, el bucle continuará. Cuando i=10 (i<10 -> False) se acabará ahi.
			
			System.out.println("El valor del contador es:" + i);
			
			sum+=i; //Esto es igual a sum=sum +1
			//sum= 1 +2 +3 +4+ 5 +6 +7 +8 +9
			
			i = i+1; //Se incrementa. Si no lo añadimos se hará un bucle infinito.  //Esto es igual a i++
			
			
			if (i>max) {
				max=i;
			}else if (i<min) {
				min=i;
			}
			
			System.out.println("El máximo es: " + max);
			System.out.println("El mínimo es: " + min);
			System.out.println("La suma de dos numeros de 0 a " + (i-1) + " es:" + sum);
		}

	}

}
