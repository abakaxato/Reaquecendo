package getset;
import java.util.Scanner;

public class Banco {

	public static void main(String[] args) {

		Conta conta1 = new Conta();
		Conta conta2 = new Conta();
		Scanner ler = new Scanner(System.in);
		int opcao;
		
		System.out.println("escolha o ambiente da conta : \n digite '1' para conta1 e '2' para contta2");
		opcao = ler.nextInt();
		
		//conta 1
		if (opcao == 1) do {
			System.out.println("\n Olá, escolha uma das opçoes !\n \n 1 abrir uma nova conta \n 2 fechar uma conta"
					+ "\n 3 sacar dinheiro da conta \n 4 depositar dinheriro na conta \n 5 exibir saldo \n 6 pagar mensalidade"
					+ "\n 7 encerrar a aplicação");
			opcao = ler.nextInt();
				
			switch (opcao){
				case 1:
					conta1.abrirConta();
					break;
				case 2:
					conta1.fecharConta();
					break;
				case 3:
					conta1.sacar(0);
					break;
				case 4:
					conta1.depositar(0);
					break;
				case 5:
					conta1.getSaldo();
					break;
				case 6:
					conta1.mensalidade(0);
					break;
				case 7:
					System.out.println("\n Ok, sua aplicação foi encerrada !");
					break;
				default :
					System.out.println("\n por favor digite o numero correspondente a opção selecionada ");
			}
		
		}while(opcao != 7); else { 
			do {
			System.out.println("\n Olá, escolha uma das opçoes !\n \n 1 abrir uma nova conta \n 2 fechar uma conta"
					+ "\n 3 sacar dinheiro da conta \n 4 depositar dinheriro na conta \n 5 exibir saldo \n 6 pagar mensalidade"
					+ "\n 7 encerrar a aplicação");
			opcao = ler.nextInt();
				
			switch (opcao){
				case 1:
					conta2.abrirConta();
					break;
				case 2:
					conta2.fecharConta();
					break;
				case 3:
					conta2.sacar(0);
					break;
				case 4:
					conta2.depositar(0);
					break;
				case 5:
					conta2.getSaldo();
					break;
				case 6:
					conta2.mensalidade(0);
					break;
				case 7:
					System.out.println("\n Ok, sua aplicação foi encerrada !");
					break;
				default :
					System.out.println("\n por favor digite o numero correspondente a opção selecionada ");
			}}while(opcao != 7);
			
		}
		
		
		
		
		
		

		System.exit(0);
		ler.close();


	}}
