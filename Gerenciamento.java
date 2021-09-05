package Main;

import Contas.ContaSalario;
import Contas.ContaCorrente;
import Contas.ContaPoupança;

import java.util.Scanner;

public class Gerenciamento {

			public static void main(String[] args) {
				
				menuGerenciamentoBanco();
				
			}
			
			public static void menuGerenciamentoBanco() {
				
				ContaSalario CS = new ContaSalario();
				
				ContaPoupança CP = new ContaPoupança();
				
				ContaCorrente CC = new ContaCorrente();
				
				
				System.out.println("--- Banco Cavalcante ---"
						+ "\n"
						+ "Menu Banco Cavalcante:"
						+ "\n"
						+ "\n[1] Criar Conta"
						+ "\n[2] Sacar"
						+ "\n[3] Depositar"
						+ "\n[4] Criar Usuário"
						+ "\n[5] Transferir Valores"
						+ "\n[6] Mostrar Montante Disponível Nas Contas"
						+ "\n[7] Sair" + "\n"
						+ "Digite o número da opção para escolher:");
				
				Scanner valorEscolhaUsuario = new Scanner(System.in);
				Integer VEU = valorEscolhaUsuario.nextInt();
				
				switch (VEU) {
				
				case 1: 
					
					System.out.println("\n" + "Informe qual tipo de conta deseja criar:"
							+ "\n[1] Conta Corrente"
							+ "\n[2] Conta Salário"
							+ "\n[3] Conta Poupança"
							+ "\n");
					
					Scanner criaçãoTipoDeConta = new Scanner(System.in);
					Integer CTDC = criaçãoTipoDeConta.nextInt();
					
					switch (CTDC) {
					
					case 1:
						
						CC.criandoCC();
						System.out.println("");
						menuGerenciamentoBanco();
						break;
						
					case 2: 
						
						CS.criandoCS();
						System.out.println("");
						menuGerenciamentoBanco();
						break;
						
					case 3: 
						
						CP.criandoCP();
						System.out.println("");
						menuGerenciamentoBanco();
						break;
					}
				case 2: 
					
					System.out.println("\n"
							+ "Informe de qual conta deseja retirar dinheiro:"
							+ "\n[1] Conta Corrente"
							+ "\n[2] Conta Salário"
							+ "\n[3] Conta Poupança"
							+ "\n");
					
					Scanner escolhaContaSaque = new Scanner(System.in);
					Integer ECS = escolhaContaSaque.nextInt();
					
					switch (ECS) {
					
					case 1:
						
						CC.saqueContaCorrente();
						System.out.println("");
						menuGerenciamentoBanco();
						break;
						
					case 2:
						
						CS.SacarContaSalario();
						System.out.println("");
						menuGerenciamentoBanco();
						break;
						
					case 3:
						
						CP.SaqueContaPoupança();
						System.out.println("");
						menuGerenciamentoBanco();
						break;
					}
					
				case 3:
					
					System.out.println("\n"
							+ "Informe de qual conta deseja depositar o dinheiro:"
							+ "\n[1] Conta Corrente"
							+ "\n[2] Conta Salário"
							+ "\n[3] Conta Poupança"
							+ "\n");
					
					Scanner escolhaContaDepositar = new Scanner(System.in);
					Integer ECD = escolhaContaDepositar.nextInt();
					
					switch (ECD) {
					
					case 1:
						
						CC.DepositarContaCorrente();
						System.out.println("");
						menuGerenciamentoBanco();
						break;
						
					case 2: 
						
						CS.DepositoContaSalario();
						System.out.println("");
						menuGerenciamentoBanco();
						break;
						
					case 3: 
						
						CP.depositarContaPoupança();
						System.out.println("");
						menuGerenciamentoBanco();
						break;
						
					}
					
				case 4:
					
					System.out.println("\n"
							+ "\n Primeiramente, qual tipo de conta o cliente deseja criar?"
							+ "\n [1] Conta Corrente"
							+ "\n [2] Conta Salário"
							+ "\n [3] Conta Poupança"
							+ "\n");
					
					Scanner escolhaTipoDeContaCriaUsuario = new Scanner(System.in);
					Integer ETDCCU = escolhaTipoDeContaCriaUsuario.nextInt();
					
					switch (ETDCCU) {
					
					case 1: 
						
						CC.criarUsuarioContaCorrente();
						System.out.println("");
						menuGerenciamentoBanco();
						break;
						
					case 2:
						
						CS.criaUsuarioContaSalario();
						System.out.println("");
						menuGerenciamentoBanco();
						break;
						
					case 3:
						
						CP.criandoUsuarioContaPoupança();
						System.out.println("");
						menuGerenciamentoBanco();
						break;
					}
					
				case 5: 
					
					System.out.println("\n"
							+ "Infrome qual conta irá transferir:"
							+ "\n [1] Conta Corrente"
							+ "\n [2] Conta Salário"
							+ "\n [3] Conta Poupança"
							+ "\n");
					
					Scanner escolhaContaTransferidora = new Scanner(System.in);
					Integer ECT = escolhaContaTransferidora.nextInt();
					
					switch (ECT) {
					
					case 1:
						
						System.out.println("\n"
								+ "Transferir da conta corrente para:"
								+ "\n [1] Conta Salário"
								+ "\n [2] Conta Poupança");
						
						Scanner contaTransferidoraCC = new Scanner(System.in);
						Integer CTCC = contaTransferidoraCC.nextInt();
						
						switch (CTCC) {
						
						case 1:
							
							System.out.println("\n"
									+ "Transferir da conta corrente para a conta salário escolhido."
									+ "\n"
									+ "Informe o nome do cliente que deseja transferir:"
									+ "\n");
							
							Scanner nomeUsuarioTransferenciaCCCS = new Scanner(System.in);
							String NUTCCCS = nomeUsuarioTransferenciaCCCS.nextLine();
							
							System.out.println("\n"
									+ "Qual o valor que será transferido?"
									+ "\n");
							
							Scanner valorTransferenciaCCCS = new Scanner(System.in);
							Double VTCCCS = valorTransferenciaCCCS.nextDouble();
							
							CC.transferenciaDeValores(NUTCCCS, VTCCCS);
							CS.recebendoQuantidadeTransferida(NUTCCCS, VTCCCS);
							
							System.out.println("\n"
									+ "Valor Transferido com sucesso para a conta salário de:"
									+ "\n " + NUTCCCS
									+ "\n Quantidade Transferida: R$:"+ VTCCCS
									+ "\n");
							
							menuGerenciamentoBanco();
							break;
							
						case 2: 
							
							System.out.println("\n"
									+ "Transferir da conta corrente para a conta poupança"
									+ "\n"
									+ "informe o nome do cliente que deseja transferir:"
									+ "\n");
							
							Scanner nomeUsuarioTransferenciaCCCP = new Scanner(System.in);
							String NUTCCCP = nomeUsuarioTransferenciaCCCP.nextLine();
							
							System.out.println("\n"
									+ "Qual o valor que será transferido?"
									+ "\n");
							
							Scanner valorTransferenciaCCCP = new Scanner(System.in);
							Double VTCCCP = valorTransferenciaCCCP.nextDouble();
							
							CC.transferenciaDeValores(NUTCCCP, VTCCCP);
							CP.recebimentoQuantiaTransferida(NUTCCCP, VTCCCP);
							
							System.out.println("\n"
									+ "Valor Transferido com sucesso para a conta poupança de:"
									+ "\n " + NUTCCCP
									+ "\n Quantidade Transferida: R$"+VTCCCP
									+ "\n");
							
							menuGerenciamentoBanco();
							break;
						}
						
					case 2: 
						 System.out.println("\n"
						 		+ "Transferir da conta salário para:"
						 		+ "\n [1] Conta Corrente"
						 		+ "\n [2] Conta Poupança"
						 		+ "\n");
						 
						 Scanner contaTransferidoraCS = new Scanner(System.in);
						 Integer CTCS = contaTransferidoraCS.nextInt();
						 
						 switch (CTCS) {
						 
						 case 1:
							 
							 System.out.println("\n"
							 		+ "Transferir da conta salário para a conta corrente."
							 		+ "\n"
							 		+ "Qual o nome do cliente que deseja Transferir?"
							 		+ "\n");
							 
							 Scanner nomeUsuarioTransferenciaCSCC = new Scanner(System.in);
							 String NUTCSCC = nomeUsuarioTransferenciaCSCC.nextLine();
							 
							 System.out.println("\n"
							 		+ "Qual o valor a ser transferido?"
							 		+ "\n");
							 
							 Scanner valorTransferenciaCSCC = new Scanner(System.in);
							 Double VTCSCC = valorTransferenciaCSCC.nextDouble();
							 
							 CS.transferenciaValoresContaSalario(NUTCSCC, VTCSCC);
							 CC.recebendoQuantiaTransferida(NUTCSCC, VTCSCC);
							 
							 System.out.println("\n"
							 		+ "Valor transferido com sucesso para a conta corrente de:"
							 		+ "\n"
							 		+ NUTCSCC
							 		+"\n Quantidade transferida: R$"+VTCSCC
							 		+ "\n");
							 
							 menuGerenciamentoBanco();
							 break;
							 
						 case 2: 
							 
							 System.out.println("\n"
							 		+ "Transferir da conta salário para a conta poupança"
							 		+ "\n"
							 		+ "Qual o nome do cliente que deseja Transferir?"
							 		+ "\n");
							 
							 Scanner nomeUsuarioTransferenciaCSCP = new Scanner(System.in);
							 String NUTCSCP = nomeUsuarioTransferenciaCSCP.nextLine();
							 
							 System.out.println("\n"
							 		+ "Qual o valor a ser transferido?"
							 		+ "\n");
							 
							 Scanner valorTransferenciaCSCP = new Scanner(System.in);
							 Double VTCSCP = valorTransferenciaCSCP.nextDouble();
							 
							 CS.transferenciaValoresContaSalario(NUTCSCP, VTCSCP);
							 CP.recebimentoQuantiaTransferida(NUTCSCP, VTCSCP);
							 
							 System.out.println("\n"
							 		+ "Valor Transferido com Sucesso para a conta poupança de: "+NUTCSCP
							 		+ "\n"
							 		+ "Quantidade transferida: R$"+VTCSCP
							 		+ "\n");
							 
							 menuGerenciamentoBanco();
							 break;
						}
						 
					case 3:
						
						System.out.println("\n"
								+ "Transferir da Conta Poupança para:"
								+ "\n"
								+ "[1] Conta Corrente \n"
								+ "[2] Conta Salário \n");
						
						Scanner contaTransferidoraCP = new Scanner(System.in);
						Integer CTCP = contaTransferidoraCP.nextInt();
						
						switch(CTCP) {
						
						case 1:
							
							System.out.println("Transferir da Conta Poupança para a Conta Corrente"
									+ "\n"
									+ "Qual o nome do cliente que você deseja transferir?"
									+ "\n");
							
							Scanner nomeUsuarioTransferenciaCPCC = new Scanner(System.in);
							String NUTCPCC = nomeUsuarioTransferenciaCPCC.nextLine();
							
							System.out.println("Qual o valor que deseja transferir?"
									+ "\n");
							
							Scanner valorTransferenciaCPCC = new Scanner(System.in);
							Double VTCPCC = valorTransferenciaCPCC.nextDouble();
							
							CP.transfereValor(NUTCPCC, VTCPCC);
							CC.recebendoQuantiaTransferida(NUTCPCC, VTCPCC);
							
							System.out.println("Valor Transferido com sucesso para a conta de: "+NUTCPCC
									+ "\n"
									+ "Quantidade Transferida: R$"+VTCPCC);
							
							menuGerenciamentoBanco();
							break;
							
						case 2:
							
							System.out.println("Transferir da Conta Poupança para a Conta Salário"
									+ "\n"
									+ "Qual o nome do cliente que você deseja transferir?"
									+ "\n");
							
							Scanner nomeUsuarioTransferenciaCPCS = new Scanner(System.in);
							String NUTCPCS = nomeUsuarioTransferenciaCPCS.nextLine();
							
							System.out.println("Qual o valor que deseja transferir?"
									+ "\n");
							Scanner valorTransferenciaCPCS = new Scanner(System.in);
							Double VTCPCS = valorTransferenciaCPCS.nextDouble();
							
							CP.transfereValor(NUTCPCS, VTCPCS);
							CS.recebendoQuantidadeTransferida(NUTCPCS, VTCPCS);
							
							System.out.println("Valor Transferido com sucesso para a conta de: "+NUTCPCS
									+ "\n"
									+ "Quantidade Transferida: R$"+VTCPCS);
							
							menuGerenciamentoBanco();
							break;
							
						}
						}
				case 6:
					
					System.out.println("\n"
							+ "[1] Ver Saldo Total das Contas Correntes \n"
							+ "[2] Ver Saldo Total das Contas Salários \n"
							+ "[3] Ver Saldo Total das Contas Poupanças \n"
							+ "[4] Ver Saldo Total de Todos os Tipos de Contas Registradas \n");
					
					Scanner escolhendoTipoDeMontante = new Scanner(System.in);
					Integer ETDM = escolhendoTipoDeMontante.nextInt();
					
					switch (ETDM) {
					
					case 1:
						
						System.out.println("O saldo total das contas corrente é: " + "\n" + "R$"+CC.getSaldoContaCorrente());
					
						
						menuGerenciamentoBanco();
						break;
						
					case 2:
						
						System.out.println("O saldo total das contas salário é:" + "\n" + "R$"+CS.getSaldo());
						
						menuGerenciamentoBanco();
						break;
						
					case 3:
						
						System.out.println("O saldo total das contas poupança é:" + "\n" + "R$"+CP.getSaldoContaPoupança());
						
						menuGerenciamentoBanco();
						break;
						
					case 4:
						
						System.out.println("O saldo total de todos os tipos de contas é de:  \n");
						
						System.out.println(+CC.getSaldoContaCorrente() + CS.getSaldo() + CP.getSaldoContaPoupança() + " Reais \n");
						
						menuGerenciamentoBanco();
						break;
					}
					
				case 7:
					
					System.out.println("O Sistema foi encerrado completamente");
					
					System.exit(7);
						}
						}
						}