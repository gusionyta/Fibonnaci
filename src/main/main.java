package main;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// Haremos la sucesion de Fibonacci
		Scanner teclado= new Scanner(System.in);
		int opc;
		int num1=0;
		int num2=1, contador;
		
		do {
		System.out.println("Introduce un numero");
		opc = teclado.nextInt();
		if (opc<1) {
			System.err.println("El numero tiene que ser mayor a 1");
		}
		}while(opc<1);
		System.out.print("1");
		for (int i=0;i<opc-1;i++)  {
			contador = num1 + num2;
			num1 = num2;
			num2 = contador;
			System.out.print(" " +contador);
			
		}
		
		
		
		
		
	

	}

}
