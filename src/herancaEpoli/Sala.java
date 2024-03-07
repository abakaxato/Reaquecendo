package herancaEpoli;

public class Sala {

	public static void main(String [] args) {
		
		Crianca crianca []= new Crianca [3];
		
		for (int i = 0; i < 3 ; i++) {
		crianca[i] = new Crianca ();}
		
		crianca[0].setNome("João"); 
		crianca[1].setNome("Maria");
		crianca[2].setNome("Sam");
		
		for (int i = 0; i < 3 ; i++) {
			System.out.println("\n Olá meu nome é " + crianca[i].getNome() + " eu tenho " + crianca[i].getIdade() + " anos de idade");
			System.out.println("também tenhho " + crianca[i].getAltura() + " de altura e peso " + crianca[i].getPeso() + " kilinhos");
		}
			
	}
	
}
