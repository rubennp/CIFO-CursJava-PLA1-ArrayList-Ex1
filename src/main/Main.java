package main;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	
	/*
	 * Pide números entre el 1 y el 10 (finaliza al introducir 0).
	 * Los almacena en un ArrayList.
	 * Al finalizar, muestra: nº de elementos, la suma de todos ellos y los pares.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> nums = new ArrayList<Integer>();
		int num = 0;	// para la introducción del número
		
		do {
			System.out.println("* Introduce un número entre el 1 y el 10 (0 para terminar):");
			num = in.nextInt();
			
			if (num < 0 || num > 10) {
				System.out.println("¡Tiene que estar entre el 1 y el 10 o el 0 para terminar!");
			} else if (num != 0) {
				nums.add(num);
			}
		} while (num != 0);
		
		// imprime resultado
		System.out.println("-> Has introducido " + nums.size() + " números.");
		System.out.println("-> Los números que has introducido son: " + resultado(nums));
		for (int i = 0;i < nums.size(); i++) if (nums.get(i)%2 != 0) nums.remove(i); // quita los impares del ArrayList para imprimir
		System.out.println("-> Y de ellos son pares: " + resultado(nums));
		
		in.close();
		
	}
	
	/*
	 * resultado(ArrayList<Integer>) -> String
	 * 
	 * Prepara las cadenas a mostrar en el resultado.
	 */
	
	static String resultado(ArrayList<Integer> nums) {
		String out = "";
		
		for (int n = 0; n < nums.size(); n++) {
			out += "el " + nums.get(n) ;
			if (nums.size() != 1) { 		// si has introducido más de un número
				if (n < nums.size()-2) {	// si no es el último
					out += ", ";
				}
				else if (n == nums.size()-2)	{	// si es el último
					out += " y ";
				}
			}
		}
		out += ".";
		
		return out;
	}
}
