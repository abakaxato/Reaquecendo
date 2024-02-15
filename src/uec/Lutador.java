package uec;

public class Lutador {

	private String nome, categoria, nacionalidade;
	private int idade, vitorias, derrotas, empates;
	private float altura, peso;

	
	
	public void apresentar () {
		
	}
	
	public void status() {

	}
	
	public void ganharLuta() {
		
	}
	
	public void perderLuta() {
		
	}
	
	public void empatarLuta() {
		
	}
	
	// metodo construtor
	
	public Lutador (String string, String string2, int i, float f, float g, String string3, int j, int k, int l) {
		this.setNome(string);
		this.setNacionalidade(string2);
		this.setIdade(i);
		this.setAltura(f);
		this.setPeso(g);
		this.setCategoria(string3);
		this.setVitorias(j);
		this.setDerrotas(k);
		this.setEmpates(l);
		
	}
	
	// metodos especiais
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int empates) {
		this.empates = empates;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	
	
	
	
}
