package fac;

public class Testes {
	public static int divisao( int dividendo, int divisor) {
	 return dividendo/divisor;	
	};
	
	public static void main (String[]args) { 
	
		try {int resultado = divisao(10, 5);
			
		}catch(ArithmeticException e) {
			System.out.println("Erro: divisão por zero");
		}
			System.out.println();
	}
}
