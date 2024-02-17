package uec;

public class Luta {

	//atributos
	
	private Lutadores desafiado, desafiante;
	private int rounds;
	private boolean aprovada;
	
	//metodos
	
	public void marcarLuta( Lutador l1, Lutador l2) {
		if (l1.getCategoria() != l2.getCategoria()) {
			System.out.println("os lutadores devem estar na mesma categoria");
			desafiado = null;
			desafiado = null;
			aprovada = false;
		}else if (l1 == l2){
			System.out.println("O lutador contra ele mesmo ?");
			desafiado = null;
			desafiado = null;
			aprovada = false;
		}else if (aprovada == false){
			System.out.println("essa luta não foi aprovada");
			desafiado = null;
			desafiado = null;
			aprovada = false;
		}else {
			aprovada = true;
		}
		
	}
	
	public void lutar() {
		if (aprovada = true) {
			desafiado.apresentar();
			desafiante.apresentar();
			vencedor = aleatorio;
			
			switch (aleatorio) {
			case(1):
				System.out.println("empatou");
				desafiado.empatarLuta();
				desafiante.empatarLuta();
			case(2):
				System.out.println("desafiado ganhou");
				desafiado.ganharLuta();
				desafiante.perderLuta();
			case(3):
				System.out.println("desafiante ganhou");
				desafiado.perderLuta();
				desafiante.ganharLuta();
			default:
				
			}
			
			
			
			
		}else {
			System.out.println("essa luta não pode acontecer");
		}
	}

	
	public Lutadores getDesafiado() {
		return desafiado;
	}

	public void setDesafiado(Lutadores desafiado) {
		this.desafiado = desafiado;
	}

	public Lutadores getDesafiante() {
		return desafiante;
	}

	public void setDesafiante(Lutadores desafiante) {
		this.desafiante = desafiante;
	}

	public int getRounds() {
		return rounds;
	}

	public void setRounds(int rounds) {
		this.rounds = rounds;
	}

	public boolean isAprovada() {
		return aprovada;
	}

	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}

	

	
	
	
	
	
	
}
