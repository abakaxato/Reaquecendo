package pilares;

public class ControleRemoto {

	// Atributos
	
	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	//metodos
	

	public void ligar() {
		this.setLigado(true);	
	};
	
	public void desligar() {
		this.setLigado(false);
	};
	
	public void abrirMenu() {
		System.out.println("-------MENU--------");
		System.out.println("Esta ligado ?" + this.isLigado());
		System.out.println("Esta tocando ? " + this.isTocando());
		System.out.print("Volume " + this.getVolume() + "  ");
		for (int i = 0; i <= this.getVolume(); i += 10 ) {
			System.out.print("|");
		}
	};
	
	public void fecharMenu() {
		System.out.println("fechando volume...");
	};
	
	public void maisVolume() {
		if (this.isLigado() == true) {
			this.setVolume(this.getVolume() + 10);
		}
	};
	
	public void menosVolume() {
		if(this.isLigado() == true) {
			this.setVolume(this.getVolume() - 10);
		}
	}
	
	public void ligarMudo() {
		if(this.isLigado() == true && this.getVolume() > 0) {
			this.setVolume(0);
		}
	};
	
	public void desligarMudo() {
		if(this.isLigado() == true && this.getVolume() == 0) {
			this.setVolume(50);
		}
	};
	
	public void play() {
		if (this.isLigado() && !(this.isTocando())) {
			this.setTocando(true);
		}
	};
	
	public void pause() {
		if (this.isLigado() && !(this.isTocando())) {
			this.setTocando(false);
		}
		
	}

	// metodos especiais
	
	//construtor
	
	public ControleRemoto () {
		this.setLigado(true);
		this.setTocando(false);
		this.setVolume(50);
	}
	
	//getters e setters
	
	private int getVolume() {
		return volume;
	}

	private void setVolume(int volume) {
		this.volume = volume;
	}

	private boolean isLigado() {
		return ligado;
	}

	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	private boolean isTocando() {
		return tocando;
	}

	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	};
	
}
