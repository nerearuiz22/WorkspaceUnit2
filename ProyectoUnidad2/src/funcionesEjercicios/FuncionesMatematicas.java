package funcionesEjercicios;
import java.util.Scanner;

public class FuncionesMatematicas {
	
							//	parámetros formales
	public static double media( int x , int y ) {
	
	double calculo;
	
	calculo = (double) (x + y)  / 2;    
	return calculo;
	//También se puede poner Return  ((x + y)  / 2)
	}
	/*
	 * 
	 * The number passed as a parameter is reversed
	 * For instance if we make the call reverse(3456) the
	 * value returned by the function would be 6543
	 * 
	 */
	public static int reverse(int num) {
		
		int cifra,numRes=0;
		
		
		while (num>0) {
			numRes*=10;
			cifra= num%10;
			numRes+= cifra; //numRes= numRes+cifra;
			num/=10;
								
		}				
		
		return numRes;
	}
	
	public static int countDigito(int num)  {
    int digiCounter = 0;
  
		while (num>0) {
			num=num/10;
			//Otra forma: num/=10;
			digiCounter++;
		}
		return digiCounter;	
	}
	
	//This function returns the number with all the ocurrences of a digit replaced by the new digit. For instance, if the number is 12373, the digit is 3 and the new 
	//digit is 5 the returned value would be 12575
	
	public static int replaceDigits(int num, int digit, int newDigit) {
		int cifra, numRes = 0;
		int exponente = 0;
		
        while (num>0) {
        	cifra=num%10;
       
			if (cifra==digit) {
				numRes= numRes +  newDigit* (int) Math.pow(10, exponente);
			
			} else {
				numRes= numRes +  cifra* (int) Math.pow(10, exponente);
			}
			exponente++;
			num=num/10;
		}
		return numRes;
	}
	
	
	//This function replace the digit in the position the number passed as a parameter with a new digit.
	
	public static int replaceDigitByPosition (int num, int position, int newDigit){
		int cifra, numRes = 0;
		int exponente = 0;
		
        while (num>0) {
        	cifra=num%10;
       
			if (cifra==position) {
				numRes= numRes +  newDigit* (int) Math.pow(10, exponente);
			} 
			exponente++;
			num=num/10;
		}
		return numRes;
	}
	
	//This function receives a number and a digit and returns the first position of this digit in the number. As a way to ilustrate the input and output, 
	//providing that this call is performed digitPosition(54492,3) the returned value should be 3, the position of the first ocurrence of the digit 4.
	
	public static int digitPosition (int num, int digit) {
    int cifra,exponente=0, cont=1,numRes=0;
		
		while (num>0) {
			cifra=num%10;
			
			if (cifra==digit) {
				numRes= numRes +  cifra* (int) Math.pow(10, exponente);
				exponente++;
				
			} 
			
			cont
			num=num/10;
		}
		return numRes;
	}
	
	//delete the n digit of a given number num
	// for example, for the number 45634 if N is 3 the expected outcome is 4534 as 
	// the 6 in the middle is drop
	
	public static int deleteNDigit(int num, int N) {

		int cifra,exponente=0, contPosicion=1,numRes=0;
		
		while (num>0) {
			
			if (contPosicion!=N) {
				
				cifra=num%10;
				numRes= numRes +  cifra* (int) Math.pow(10, exponente);
				exponente++;
				
			} 
			contPosicion++;	
			num=num/10;
			
		}
		
		return numRes;
		
	}
	
	// to code this function use what you already have in this class
	//
	
	static boolean isCapicua (int num) {
		
						
		return reverse(num)==num;
	}
	
	// program a function called isPrimeNumber that guesses if a number is a prime number
	
	static boolean isPrimeNumber(int num) {
		int count = 2;
		boolean isPrime = true;
		while (count<=num/2 && (!isPrime)) {
			
		}
		return true;
	}
	
	
	// use modularity
	// write a procedure named by rangedPrimeList that prints out the primer numbers in a min max range
	// for instance, the prime numbers between 7 and 15 are 7, 11, 13
	
	
	// use modularity
	// write a procedure named by nPrimeList that prints out the first n prime numbers. 
	// the  list of the first five (n==5) prime numbers is as following:  2, 3, 5, 7, 11
	
	
	 public static int maximoComunDivisor (int a, int b) {
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
	 
	 
	 //Mostrar la simplificación de una fracción
	 //Pasamos la fracción 18/20 resultado 18/20 = 9/10
	 //Modularidad -> usamos el mcd para simplificar la fracción 
	 
	 public static void simplificarFraccion (int numerador, int denominador) {
		 int max = (numerador>=denominador)? numerador:denominador;
			int min = (numerador<denominador)? numerador:denominador;
			
			while (min > 0) {
				int temp = min;
				min = max%min;
				int aux = min;
				numerador = temp;
			}
		
			}
	
	 
	 //input -> 5376
	 //output -> 6537
	 static int rotateOneToTheRight (int number){
		 
		 int numDigits  = countDigito (number);
		 int digit = 0;
		 int result = 0;
		 
		 digit = number%10; //->We get the last digit 6
		 
		 //We transform 6 to 6000
		 result = (int) (digit * Math.pow(10, numDigits-1));
		 
		 //We obtain the rest of the number from 5376 to 537 by dividing by 10
		 number = number/10;
		 
		 //6000+537 is the rotated number
		 return result;
		 
	 }
	 
	 //input -> 5376, 2
	 //output -> 7653
	 static int rotateNToTheRight (int number, int n){ //n es la rotacion
		 
		 //int numDigits = countDigito (number);
		 //num digios  - rotación + posición 
		 //rotación % num digitos -> Posiciones que rota
		 int numDigito = countDigito (number);
		 int digit = 0;
		 int result = 0;
		 int position = 0; //Posición del número
		 
		 n = n%numDigito;
		 
		 while (number>0) {
			 digit = number%10;
			 number=number/10;
			 if (position<n) {
				 result += (digit * Math.pow(10, numDigito - n + position));
			 }else {
				 result += (digit * Math.pow(10, position-n));
			 }
			 position++;
			 
			 if (n==0) {
				 result = number;
			 }
		 }
		 return result;
	 }
	 
	//input -> 53765, 3
    //output -> 65753
		 static int rotateNToTheLeft (int number, int n){ //n es la rotacion
			 
			 int numDigito = countDigito (number);
			 int digit = 0;
			 int result = 0;
			 int position = 0; //Posición del número
			 n = n%numDigito;
			 
			 while (number>0 && n!=0) {
				 digit = number%10;
				 number=number/10;
				 if (position<n) {
					 result += (digit * Math.pow(10, position + n%numDigito));
				 }else {
					 result += (digit * Math.pow(10, position-n));
				 }
				 position++;
			 }
			 if (n==0) {
				 result = number;
			 }
			 return result;
		 }
		 
		 
		 
		 static void listNPrimeNumber (int n){
			 int countPrime = 0;
			 int countNum = 1;
			 
			 while (countPrime <=n) {
				 if (isPrimeNumber (countNum)) {
					 System.out.println(countNum + ", ");
					 countPrime++;
				 }
				 countNum++;
			 }
		 }
		 
		 
		 static int quitaPorDetras (int number, int n){ 
				int numDigits = countDigito (number);
				int result = 0;
				 
				 while (number>0) {
					 result = (int) (number/(10 * (numDigits - n)));
				 }
				 return result;
			 }
		 
		//4567 quita 2
			// 4567/10^2 = 45
			 
			//456731 quita  2 por la izquierda
			// 
			 //
			 // bucle
			 //
			 //
			 // 456731 -450000=6731
			 //456731/10^(numdigitos-n)
			 
		 
		 static int quitaPorDelante (int number, int n){ 
			int numDigits = countDigito (number);
			int result = 0;
			 
			 while (number>0) {
				 result = number - (int) (number/(Math.pow(10, numDigits - n))); 
			 }
			 return result;
		 }
		 
		
		 static int pegarPorDelante (int number, int n){ 
				int numDigits = countDigito (number);
				int result = 0;
				 
				 while (number>0) {
					 result = (int) (number/(10 * (numDigits - n)));
				 }
				 return result;
			 }
      
      //Mínimo común múltiplo no recursivo
		 
		 public static int minimoComunMultiplo (int a, int b) {
			 return a*b/maximoComunDivisor (a,b);		
		 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1,num2;
		double result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame el primer Numero");
		num1= sc.nextInt();
		
		System.out.println( "Dame el segundo Numero");
		num2= sc.nextInt();
		result=media(num1,num2);

	 //parámetros ACTUALES O REALES n1 y n2

		//System.out.println( "La media es:" + result) ;
		
	
		//System.out.println("the reversed number for "+  num1+ " is " + reverse(num1));
		
		 int outcome= deleteNDigit(num1, num2);
		
	     System.out.println("the number after taking out the " + num2 + " position for "+  num1+ " is " + outcome);


	}

}