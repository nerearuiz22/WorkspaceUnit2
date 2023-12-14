package ejercicios.ejerciciosenclase;

import java.util.Scanner;

/* Vamos a introducir por teclado un número (entero). Para distinguir si es par o 
 * impar comprobamos el resto de dividir por 2. */
public class Main {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int num; //número introducido por el usuario

      System.out.print("Introduzca un número: ");
      num = sc.nextInt();

      if ((num % 2 == 0) || (num % 3 == 0)){ //si num es par
         System.out.println("Es divisible por 2 o por 3");
      } else { // es impar
         System.out.println("No son divisible por 2 o por 3 ");
      }
   }
}


