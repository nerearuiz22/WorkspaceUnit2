package ejercicios.ejerciciosenclase;

public class EjemploDivisionEntera {

	public static void main(String[] args) {
		int num1 = 3;
		int num2 = 9;
		
		//división entera, sale 0
		System.out.println (num1/num2); 
		System.out.println(num1%num2);
		
		//division decimal
		System.out.println (num1/(double)num2); //0.3333333333333333
		System.out.println ((double)num1/num2); //0.3333333333333333
		System.out.println ((double)(num1/num2)); //0.0
		System.out.println (num1/(num2*1.0)); //0.3333333333333333
	}

}
