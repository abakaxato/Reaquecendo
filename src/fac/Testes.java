package fac;

import java.util.ArrayList;
import java.util.Scanner;

public class Testes {
	public static int divisao( int dividendo, int divisor) {
	 return dividendo/divisor;	
	};
	
	public static void main (String[]args) { 
	
		try {int resultado = divisao(10, 0);
			
		}catch(ArithmeticException e) {
			System.out.println("Erro: divisão por zero");
		}
			
	}
}
