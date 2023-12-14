package buclesEjerciciosProfe;

import java.util.Scanner;

public class ArbolNavidad {

	public static void main(String[] args) {
		
		//altura -i = espacios
		//anchura = altura * 2 -1
		//Espacios = alñtura - i
		//Aasteriscos el resto
		int altura = 0;
		int anchura = 0;
		String tree = "";
		
		Scanner sc = new Scanner(System.in);
		System.out.print ("Enter the tree height:");
		altura = sc.nextInt();
		
		anchura = 2*altura - 1;
		
		for (int i = 1; i<=altura; i++) {
			
			for (int j = 1; j<= altura -1 + i; j++) {
				if (j<=altura-i) {
					tree = tree + " ";
				}else {
					tree = tree + "*";
			}
				
		}
			
			tree = tree + "\n";
	}
		System.out.println (tree);

	}
}
