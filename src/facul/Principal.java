package facul;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
public class Principal {
    public static void main ( String args [ ] ){
    	float valorTotal = 6000, entrada = 1200;
    	int parcelas = 4;
    	try {
    	Financiamento f = new Financiamento (valorTotal, entrada, parcelas);
    	System.out.println(f.prestacoes());
    	}catch(RuntimeException e){
    		System.out.println(e.getMessage());
    	}
    }
}
