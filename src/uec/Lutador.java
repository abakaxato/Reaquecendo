package uec;

public class Lutador {

	private String nome, categoria, nacionalidade;
	private int idade, vitorias, derrotas, empates;
	private float altura, peso;

	
	
	public void apresentar () {
		System.out.println("\n SENHORAS E SENHORES !!! \n É COM MUITO PRAZER QUE VÕS APRESENTO " + this.getNome()+ " !!!");
		System.out.println("\n VINDO DIRETAMENTE DE " + this.nacionalidade + " !!!");
		System.out.println("\n COM APENAS " + this.idade + " ANINHOS");
		System.out.println("\n" + this.getAltura() + " METROS DE ALTURA, HAHAHAHHAHAHAHAHAHHAHA");
		System.out.println("\n" + this.getPeso () + " DE PURO MUSCULOS");
		System.out.println("\n DIZIMOOU SEUS INIMIGOS " + this.getVitorias() + " VEZES !!!" );
		if (this.getDerrotas() == 0 && this.getEmpates() >= 0 ) {
			System.out.println("\n E SEGUEEEE INVICTOOOOOOOOOOOOOOOOO !!!");
		}else {System.out.println("\n mas também ja viu " + this.getDerrotas() + " derrotas diante de seus olhos \n e  viu o empate " + this.getEmpates() + " acontecer");}
		System.out.println("\n \n \n \n \n \n");
	}
	
	public void status() {
		System.out.println(this.getNome());
		System.out.println("\n pesa " + this.getPeso());
		System.out.println("\n ganhou " + this.getVitorias());
		System.out.println("\n perdeu " + this.getDerrotas());
		System.out.println("\n empatou " + this.getEmpates());
	}
	
	public void ganharLuta() {
		this.vitorias = this.getVitorias() + 1;
	}
	
	public void perderLuta() {
		this.derrotas = this.getDerrotas() + 1;
	}
	
	public void empatarLuta() {
		this.empates = this.getEmpates() + 1;
	}
	
	// metodo construtor
	
	public Lutador (String nom, String cat, int ida, float alt, float pes, int vit, int der, int emp) {
		this.setNome(nom);
		this.setNacionalidade(cat);
		this.setIdade(ida);
		this.setAltura(alt);
		this.setPeso(pes);
		this.setVitorias(vit);
		this.setDerrotas(der);
		this.setEmpates(emp);
		
	}
	
	// metodos especiais
	
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCategoria() {
		return this.categoria;
	}

	private void setCategoria() {
		
		if(this.peso >= 52.2f && this.peso <= 70.3f) {
			this.categoria = "leve";
		}else if(this.peso > 70.3f && this.peso <= 83.9f) {
			this.categoria = "médio";
		}else if (this.peso > 83.9f && this.peso <= 120.2f){
			this.categoria = "pesado";
		}else {this.categoria = "invalido";}
		
		
	}

	public String getNacionalidade() {
		return this.nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public int getIdade() {
		return this.idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getVitorias() {
		return this.vitorias;
	}

	public void setVitorias(int vit) {
		this.vitorias = vit;
	
	}

	public int getDerrotas() {
		return this.derrotas;
	}

	public void setDerrotas(int der) {
		this.derrotas = der;
	}

	public int getEmpates() {
		return this.empates;
	}

	public void setEmpates(int emp) {
		this.empates = emp;
		
	}

	public float getAltura() {
		return this.altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeso() {
		
		return this.peso;
	}

	public void setPeso(float peso) {
		
		this.peso = peso;
		this.setCategoria();
	}
	
	
	
	
	
}
