package herancaEpoli;

public class Sala {

	public static void main(String [] args) {
		
		Crianca crianca []= new Crianca [3];
		
		for (int i = 0; i < 3 ; i++) {
		crianca[i] = new Crianca ();}
		
		crianca[0].setNome("João"); 
		crianca[1].setNome("Maria");
		crianca[2].setNome("Sam");
		
		System.out.println("\n crianças");
		
		for (int i = 0; i < 3 ; i++) {
			System.out.println("\n Olá meu nome é " + crianca[i].getNome() + ", eu tenho " + crianca[i].getIdade() + " anos de idade");
			System.out.println("também tenhho " + crianca[i].getAltura() + " de altura e peso " + crianca[i].getPeso() + " kilinhos");
			}
			
		Adulto adulto [] = new Adulto[3];
		
		for (int i = 0 ; i < 3 ; i++) {
			adulto[i] = new Adulto();}
		
		adulto[0].setNome("seu ze"); 
		adulto[1].setNome("dona maria");
		adulto[2].setNome("dede");
		
		System.out.println("\n adultos");
		
		for (int i = 0; i < 3 ; i++) {
			System.out.println("\n Olá me chame de " + adulto[i].getNome() + ", eu to com " + adulto[i].getIdade() + " anos de idade");
			System.out.println("atualmente tenho " + adulto[i].getAltura() + " de altura e peso " + adulto[i].getPeso() + " kilos");
			}
		
		
		
		
		
		
		
	}
	
}
