package fac;

public class Testes {
	
	public static void main (String[]args) { 
		
	int  quociente, dividendo = 10, divisor =0;
		
		try {
			if (divisor == 0) {
				throw new ArithmeticException ("o divisore é zero.");
			}
			
		}catch(Exception e) {
			System.out.println("Erro: divisão por zero");
		}
	}
}
