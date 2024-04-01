package fac;

		public class Excecaopersonalizada{
			public static void main (String[]args) { 
			try {
				int resultado = divisao(20,0);
				System.out.println("Resultado: " + resultado);
			}catch(Excecaopersonalizadadivisaoporzero e) {
				System.out.println("Error " + e.getMessage());
			}
		}
		
		public static int divisao(int dividendo, int divisor)
						throws Excecaopersonalizadadivisaoporzero {
							if (divisor == 0) {
								throw new Excecaopersonalizadadivisaoporzero ("O divisor não pode ser zero");
							}
							return dividendo/divisor;
						}
		}
		class Excecaopersonalizadadivisaoporzero extends Exception{
			public Excecaopersonalizadadivisaoporzero(String mensagem) {
				super(mensagem);
			}						
	}

