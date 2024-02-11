package pilares;

public class ControleRemoto {

	// Atributos
	
	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	//metodos
	
	public void ligar() {
		
	};
	
	public void desligar() {
		
	};
	
	public void abrirMenu() {
		
	};
	
	public void fecharMenu() {
		
	};
	
	public void maisVolume() {
		
	};
	
	public void menosVolume() {
		
	};
	
	public void ligarMudo() {
		
	};
	
	public void desligarMudo() {
		
	};
	
	public void play() {
		
	};
	
	public void pause() {
		
	}

	// metodos especiais
	
	//construtor
	
	public ControleRemoto () {
		this.setLigado(false);
		this.setTocando(false);
		this.setVolume(50);
	}
	
	//getters e setters
	
	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public boolean isTocando() {
		return tocando;
	}

	public void setTocando(boolean tocando) {
		this.tocando = tocando;
	};
	
	
	
	
}
