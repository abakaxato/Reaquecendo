package poo;
import java.util.Scanner;

public class Conta {
	
	//atributos
	
		private int numCont;
		protected String tipo;
		private String dono;
		private float saldo;
		private boolean status;
		private String resposta;
		Scanner ler = new Scanner(System.in);
	
	//metodos	
		
		public void abrirConta () {
			
			System.out.println("\n digite o nome do dono da conta : ");
				this.dono = ler.next();
				
			System.out.println("\n Ok, voce vai querer abri uma conta poupança ou uma conta corrente ?");
			
			do {
				System.out.println("\n digite 'cp' para conta poupança e 'cc' para conta corrente");
				resposta = ler.nextLine();
			} while (resposta.equals("cc") == false && resposta.equals("cp") == false); 
			
			this.setTipo(resposta);
			this.setStatus(true);
			
			if (resposta.equals("cc") == true) {
				this.setSaldo(50);
			} else if (resposta.equals("cp") == true) {
				this.setSaldo(150);
			}
			System.out.println("\n Digite o numero da sua nova conta : ");
			this.numCont = ler.nextInt();
	
			System.out.println("\n Ok ! sua conta foi aberta e ela é " + this.getTipo());
			System.out.println("\n por esse motivo você ja começa com " + this.getSaldo());
			this.estadoAtual();
		};
		
		public void fecharConta () {
				if (this.getSaldo() != 0) {
					System.out.println("sua conta não pode ser fechada por ainda conter saldo ou estar negativada");
					System.out.println("por favor relize os ajustes e tente novamente");
				} else if (this.getSaldo() == 0) {
					System.out.println("OK, vamos fechar sua conta");
					System.out.println("\n OK, sua conta foi fechada, ate logo !");
					this.setStatus(false);
				}
			};
					
		public void depositar(float d) {
			
				System.out.println("\n OK, vamos depositar");
				System.out.println("\n seu saldo em conta é : " + this.getSaldo());
				if (this.isStatus() == false) {
					System.out.println("primeiro abra uma conta por favor");
				} else {
					System.out.println("\n digite o valor que vai ser depositado");
					d = ler.nextFloat();
					this.setSaldo(+ d);
					System.out.println("\n OK, seu saldo atual é " + this.getSaldo());
				}
			}
		
		public void exibir() {

			
				if (this.isStatus() == false) {
					System.out.println("primeiro abra uma conta por favor");
				} else {
					System.out.println("\n seu saldo em conta é : " + this.getSaldo());
				}
			}
		
		public void sacar(float s) {
			
				System.out.println("\n OK, vamos sacar");
				if (this.isStatus() == false) {
					System.out.println("primeiro abra uma conta por favor");
				} else if (this.getSaldo() == 0) {
					System.out.println("adicone saldo a sua conta primeiro");
				} else {
					System.out.println("\n seu saldo em conta é : " + this.getSaldo());
					System.out.println("\n digite o valor desejado para sacar");
					s = ler.nextFloat();
					if (s > this.getSaldo()) {
						do {
							System.out.println(
									"\n o saque solicitado é maior que o saldo atual, por favor insira outro valor ");
							s = ler.nextFloat();
						} while (s > this.getSaldo());
					} else {
						this.setSaldo(-s);
						System.out.println("\n seu novo saldo em conta é : " + this.getSaldo());
					}
				}
			}
		
		public void mensalidade(float saldo) {	
			if (this.isStatus() == false) {
				System.out.println("primeiro abra uma conta por favor");
				} else if (this.getSaldo() >= 0) {
					System.out.println("insira saldo na sua conta primeiro");
					System.out.println("\n seu saldo em conta é : " + this.getSaldo());
				} else if (this.getTipo() == "cp" && this.getSaldo() > 20) {
					this.mensalidade(-20);
					System.out.println("\n a mensalidade da sua conta polpança foi paga");
					System.out.println("\n seu novo saldo em conta é : " + this.getSaldo());
				} else if (this.getTipo() == "cc" && this.getSaldo() > 12){
					this.mensalidade(-12);
					System.out.println("\n a mensalidade da sua conta corrente foi paga");
					System.out.println("\n seu novo saldo em conta é : " + this.getSaldo());
				}
						
		}

		public void estadoAtual () {
			System.out.println("\n o estado atual da sua conta é ");
			System.out.println("\n dono : " + this.getDono());
			System.out.println("\n numero da conta : " + this.getNumCont());
			System.out.println("\n tipo de conta : "+ this.getTipo());
			System.out.println("\n saldo atual : " + this.getSaldo());
		}
				
			
	
		//metodos especiais		
		
		public String getTipo() {
			return this.tipo;
		}

		public void setTipo(String tipo) {
			this.tipo = tipo;
		}
	
		public Conta () {
			this.status = false;
			this.saldo = 0;
		}
		
		public int getNumCont() {
			return this.numCont;
		}

		public void setNumCont(int numCont) {
			this.numCont = numCont;
		}

		public String getDono() {
			return this.dono;
		}

		public void setDono(String dono) {
			this.dono = dono;
		}

		public float getSaldo() {
			return this.saldo;
		}

		public void setSaldo(float saldo) {
			this.saldo = this.saldo + saldo;
		}

		public boolean isStatus() {
			return this.status;
		}

		public void setStatus(boolean status) {
			this.status = status;
		} 
		
}
