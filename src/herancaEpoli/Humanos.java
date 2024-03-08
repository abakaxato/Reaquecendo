package herancaEpoli;

// esse aqui vai no freeStyle
public abstract class Humanos {
	
//Atributos		
	protected int idade;
	protected float peso, altura;
	protected String nome;
	
//Construtor tavas com problema ao ser iniciado com valores
	public Humanos () {
		
	}

// getters e setters
 public int getIdade() {
	 return this.idade;
 }

public void setIdade(int idade) {
	this.idade = idade; 
}

public float getAltura() {
	return altura;
}

public final void setAltura(float altura) {
	this.altura = altura;
}

public float getPeso() {
	return peso;
}

public final void setPeso(float peso) {
	this.peso = peso;
}

public String getNome() {
	return nome;
}

public final void setNome(String nome) {
	this.nome = nome;
}













}
