package facul;

public class Financiamento {
	
	float valorTotal, entrada;
	int parcelas;
	
	public Financiamento(float valorTotal, float entrada, int parcelas){
		if (entrada < (valorTotal * 0.2)) {
			throw new RuntimeException ("o valor da entrada deve ser pelo menos 20% do valor total");
		}else if (parcelas < 4){
			throw new RuntimeException ("o numero de parcelas deve ser maior do que 4");
		}else {
		this.valorTotal = valorTotal;
		this.entrada = entrada;
		this.parcelas = parcelas;}
	}

	public float prestacoes() {
		return(valorTotal - entrada) / parcelas;
	}
	
}
