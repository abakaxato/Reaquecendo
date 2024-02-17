package getset;
import java.util.Scanner;

public class Banco {


	// Ainda não fiz tratamento para quando inserir letras não dar erro
	// insira apenas numeros

	public static void main(String[] args) {

		Conta conta [] = new Conta [2];
		conta[0] = new Conta ();
		conta[1] = new Conta ();


		Scanner ler = new Scanner(System.in);
		int i , op;

		System.out.println("escolha o ambiente da conta : \n digite '1' para conta1 e '2' para conta 2");
		i = ler.nextInt();
		if(i == 2) {
			i = 0;
		};



		if (i == 1 || i == 0) {
			System.out.println("\n");
		}else {
			do {System.out.println("ambiente invalido \n escolha uma das opções citadas acima...");
			i = ler.nextInt();
			}while(i != 1 && i != 2);
		}		
		do {
			System.out.println("\n Olá, escolha uma das opçoes !\n \n 1 abrir uma nova conta \n 2 fechar uma conta"
					+ "\n 3 sacar dinheiro da conta \n 4 depositar dinheriro na conta \n 5 exibir saldo \n 6 pagar mensalidade"
					+ "\n 7 encerrar a aplicação");
			op = ler.nextInt();

			switch (op){
			case 1:
				conta[i].abrirConta();
				break;
			case 2:
				conta[i].fecharConta();
				break;
			case 3:
				conta[i].sacar(0);
				break;
			case 4:
				conta[i].depositar(0);
				break;
			case 5:
				conta[i].getSaldo();
				break;
			case 6:
				conta[i].mensalidade(0);
				break;
			case 7:
				System.out.println("\n Ok, sua aplicação foi encerrada !");
				break;
			default :
				System.out.println("\n por favor digite o numero correspondente a opção selecionada ");
			}
		}while(op != 7);

		System.exit(0);
		ler.close();
	}}


