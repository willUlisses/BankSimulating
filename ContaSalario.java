package Contas;

import Main.Tributavel;
import java.util.HashMap;
import java.util.Scanner;

public class ContaSalario implements Tributavel {

	private Double sacar;
	private Double deposito;

	@Override
	public Double vTarifa() {
		
		return 0.01;
	}
	
	public Double getSaque() {
		return this.sacar;
	}
	public void setSaque(double sacar) {
		this.sacar = sacar;
	}
	public Double getDepositar() {
		return this.deposito;
	}
	public void setDepositar(double deposito) {
		this.deposito = deposito;
	}
	
	HashMap<String,Double> usuarios = new HashMap<>();
	private double saldo;
	
	public double getSaldo() {
		usuarios.put("Marcos Tenório", 765.00);
		usuarios.put("Lorena Guimarães", 800.00);
		usuarios.put("Gabriel Menezes", 650.00);
		usuarios.put("William Cavalcante", 1000.00);
		usuarios.put("Fillipe Goes", 780.00);
		usuarios.put("Cauã Gabriel", 830.00);
		usuarios.put("Artur Vieira", 1000.00);
		usuarios.put("Amanda Pinheiro", 600.00);
		usuarios.put("Marilia Galvão", 700.00);
		usuarios.put("Eduarda Rodrigues", 800.00);
		
		Double s = 0.0;
		
		for (Double valor : usuarios.values()) {
			s += valor;
		}
		
		return saldo = s;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void criandoCS() {
		
		System.out.println("\n" + "Informe o Nome do usuario:" + "\n");
		
		Scanner nomeUCS = new Scanner(System.in);
		String NUCS = nomeUCS.nextLine();
		
		System.out.println("\n" + "Adicionar valor inicial a conta?\n" + "[1] Sim " + "\n"+  "[2] Não");
		
		Scanner saldoInicialContaSalario = new Scanner(System.in);
		int SICS = saldoInicialContaSalario.nextInt();
		
		if (SICS == 1 ) {
			System.out.println("\n" + "Digite a quantia inicial a ser adicionada:\n");
			
			Scanner adicionandoValorInicialCS = new Scanner(System.in);
			double AVICS = adicionandoValorInicialCS.nextDouble();
			
			usuarios.put(NUCS, AVICS);
			
			System.out.println("\n" + "Ola " + NUCS + " Sua conta salário foi criada com sucesso!\n"
			+ "Seu saldo inicial é de : R$"+AVICS);
		}
		
		else if (SICS == 2) {
			usuarios.put(NUCS, 0.0);
			
			System.out.println("\n" + "Ola " + NUCS + " Sua conta salário foi criada com sucesso!\n"
					+ "Porém não contém saldo inicial.\n");
		}
	}
	public void DepositoContaSalario() {
		usuarios.put("Marcos Tenório", 765.00);
		usuarios.put("Lorena Guimarães", 800.00);
		usuarios.put("Gabriel Menezes", 650.00);
		usuarios.put("William Cavalcante", 1000.00);
		usuarios.put("Fillipe Goes", 780.00);
		usuarios.put("Cauã Gabriel", 830.00);
		usuarios.put("Artur Vieira", 1000.00);
		usuarios.put("Amanda Pinheiro", 600.00);
		usuarios.put("Marilia Galvão", 700.00);
		usuarios.put("Eduarda Rodrigues", 800.00);
		
		
		System.out.println("\nInforme o nome do cliente que receberá o valor:");
	
		Scanner nomeUsuarioDepositoContaSalario = new Scanner(System.in);
		String NUDCS = nomeUsuarioDepositoContaSalario.nextLine();
		
		if (usuarios.containsKey(NUDCS)) {
			System.out.println("\n" + "Usuario confirmado, informe o falor a ser depositado:");
			
			Scanner valorTransferidoUsuarioContaSalario = new Scanner(System.in);
			double VTUCS = valorTransferidoUsuarioContaSalario.nextFloat();
			
			deposito = usuarios.get(NUDCS) + VTUCS;
			
			System.out.println("\n" + "O valor foi depositado com sucesso para o usuário:" + NUDCS + "\n" 
			+ "O novo saldo na conta é: R$"+deposito);
			
			usuarios.replace(NUDCS, usuarios.get(NUDCS));
		}
		
		else {
			System.out.println("\n" + "Usuário não encontrado, verifique se o nome foi escrito corretamente ou caso não exista conta crie uma");
		}
	}
	public void SacarContaSalario() {
		usuarios.put("Marcos Tenório", 765.00);
		usuarios.put("Lorena Guimarães", 800.00);
		usuarios.put("Gabriel Menezes", 650.00);
		usuarios.put("William Cavalcante", 1000.00);
		usuarios.put("Fillipe Goes", 780.00);
		usuarios.put("Cauã Gabriel", 830.00);
		usuarios.put("Artur Vieira", 1000.00);
		usuarios.put("Amanda Pinheiro", 600.00);
		usuarios.put("Marilia Galvão", 700.00);
		usuarios.put("Eduarda Rodrigues", 800.00);
		
		System.out.println("\nDigite o nome do usuário que vai retirar o valor:");
		
		
		Scanner nomeUsuarioSaqueContaSalario = new Scanner(System.in);
		String NUSCS = nomeUsuarioSaqueContaSalario.nextLine();
		
		if (usuarios.containsKey(NUSCS) ) {
			
			System.out.println("\n" + "Usuário confirmado, informe o valor a ser sacado:");
			
			Scanner valorUsuarioSaqueContaSalario = new Scanner(System.in);
			double VUSCS = valorUsuarioSaqueContaSalario.nextDouble();
			
			sacar = usuarios.get(NUSCS) - VUSCS;
			
			System.out.println("\n" + "Seu saque foi efetuado com sucesso, agora o saldo atual é de: R$"+sacar);
			
			usuarios.replace(NUSCS, sacar);
		}
		
		else {
			
			System.out.println("\n" + "Usuário não encontrado, verifique se o nome foi escrito corretamente ou caso não exista conta crie uma");
			
		}
	}
	public void criaUsuarioContaSalario() {
		
		System.out.println("\n" + "Digite o nome de usuário que será utilizado:");
		
		Scanner nomeUsuarioContaSalario = new Scanner(System.in);
		String NUCS = nomeUsuarioContaSalario.nextLine();
		
		usuarios.put(NUCS, 0.0);
		
		System.out.println("\n" + "Criação de conta efetuada com sucesso!" + "\nTipo de conta: Conta Salário"+"\nSaldo de 0.00");
	}
	public void transferenciaValoresContaSalario(String nomeUsuario, Double valorTransferido) {
		usuarios.put("Marcos Tenório", 765.00);
		usuarios.put("Lorena Guimarães", 800.00);
		usuarios.put("Gabriel Menezes", 650.00);
		usuarios.put("William Cavalcante", 1000.00);
		usuarios.put("Fillipe Goes", 780.00);
		usuarios.put("Cauã Gabriel", 830.00);
		usuarios.put("Artur Vieira", 1000.00);
		usuarios.put("Amanda Pinheiro", 600.00);
		usuarios.put("Marilia Galvão", 700.00);
		usuarios.put("Eduarda Rodrigues", 800.00);
		
		double quantiaPassada = usuarios.get(nomeUsuario);
		
		double quantiaAtual = quantiaPassada - valorTransferido;
		
		usuarios.replace(nomeUsuario, (quantiaAtual - vTarifa()));
		
	}
	
	public void recebendoQuantidadeTransferida(String nomeUsuario, Double valorTransferido) {
		usuarios.put("Marcos Tenório", 765.00);
		usuarios.put("Lorena Guimarães", 800.00);
		usuarios.put("Gabriel Menezes", 650.00);
		usuarios.put("William Cavalcante", 1000.00);
		usuarios.put("Fillipe Goes", 780.00);
		usuarios.put("Cauã Gabriel", 830.00);
		usuarios.put("Artur Vieira", 1000.00);
		usuarios.put("Amanda Pinheiro", 600.00);
		usuarios.put("Marilia Galvão", 700.00);
		usuarios.put("Eduarda Rodrigues", 800.00);
		
		double recebimentoQuantiaAtual = usuarios.get(nomeUsuario);
		double novaQuantia = recebimentoQuantiaAtual + valorTransferido;
		
		usuarios.replace(nomeUsuario, novaQuantia);
	}
}