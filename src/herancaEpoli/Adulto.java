package herancaEpoli;

import java.util.Random;

public class Adulto extends Humanos{
	
	int idade;
	Random aleatorio = new Random();
	
	public Adulto (){
		
		//coloquei uma validação para o adulto ter mais de 18 anos, poderia ter algo usando o math, mas eu pensei nisso
		do {idade = aleatorio.nextInt(100);}
		while(idade < 18);
		
		this.setNome("");
		this.setIdade(idade);
		this.setAltura(aleatorio.nextFloat(200f));
		
	
	}
	
}
