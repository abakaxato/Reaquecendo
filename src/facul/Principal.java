package facul;
import java.io.IOException;
public class Principal {
    public static void main ( String args [ ] ){
    
    	try {
    	abrirArquivo();
    	}catch(AbrirArquivoExcecao e) {
    	System.out.println("um erro ocorreu na tentativa de abrir o arquivo " + e.getMessage());
    	System.out.println("Causa raiz: " + e.getCause().getMessage());
    	}    	
    }
    
    public static void abrirArquivo() throws AbrirArquivoExcecao{
		try {
			//simulando uma excecao ao abrir o arquivo
			throw new IOException("incapaz de abrir o arquivo");
		}catch(IOException e) {
			// Envolvendo a exceção capturada em uma excerção personalizada
			throw new AbrirArquivoExcecao("Ocorreu um erro ao abrir o arquivo", e);
		}
    }
}


class AbrirArquivoExcecao extends Exception{
    public AbrirArquivoExcecao(String mensagem, Throwable causa) {
    	super(mensagem, causa);
    	}
    }

 
