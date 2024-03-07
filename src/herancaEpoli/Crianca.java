package herancaEpoli;

import java.util.Random;

public class Crianca extends Humanos{

	Random aleatorio = new Random();
	
	public Crianca () {
		this.setNome("");
		this.setIdade(aleatorio.nextInt(18));
		this.setPeso(aleatorio.nextFloat(100));
		this.setAltura(aleatorio.nextFloat(150));
	}
}
