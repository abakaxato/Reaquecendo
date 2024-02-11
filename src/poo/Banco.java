package poo;
import java.util.Scanner;

public class Banco {

	public static void main(String[] args) {

		Conta conta1 = new Conta();
		Conta conta2 = new Conta();
		Scanner ler = new Scanner(System.in);
		int opcao;
		
		
		//conta 1
		do {
			System.out.println("\n Olá, escolha uma das opçoes !\n \n 1 abrir uma nova conta \n 2 fechar uma conta"
					+ "\n 3 sacar dinheiro da conta \n 4 depositar dinheriro na conta \n 5 exibir saldo \n 6 pagar mensalidade"
					+ "\n 7 encerrar a aplicação");
			opcao = ler.nextInt();
				
			switch (opcao){
				case 1:
					conta1.abrirConta();
					break;
				case 2:
					System.out.println("\n teste");
					break;
				case 3:
					System.out.println("\n teste");
					break;
				case 4:
					System.out.println("\n teste");
					break;
				case 5:
					System.out.println("\n teste");
					break;
				case 6:
					System.out.println("\n teste");
					break;
				case 7:
					System.out.println("\n Ok, sua aplicação foi encerrada !");
					break;
				default :
					System.out.println("\n por favor digite o numero correspondente a opção selecionada ");
			}
		
		}while(opcao != 7);

		System.exit(0);
		ler.close();


	}}
