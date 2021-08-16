package Contas;

import Main.Tributavel;
import java.util.HashMap;
import java.util.Scanner;

public class ContaCorrente implements Tributavel {
	
	private Double sacar;
	private Double deposito;
	private Double saldo;

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
	
	HashMap<String, Double> usuarios = new HashMap<>();
	
	public double getSaldoContaCorrente() {
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
	public void setSaldoContaCorrente(double saldo) {
		this.saldo = saldo;
	}
	
	public void criandoCC() {
		
		System.out.println("\n" + "Informe o nome do usuário:");
		
		
		Scanner nomeUsuarioContaCorrente = new Scanner(System.in);
		String NUCC = nomeUsuarioContaCorrente.nextLine();
		
		
		System.out.println("\n" + "Deseja adicionar um saldo inicial na sua conta?"
		+ "\n[1] Sim"
				+ "\n[2] Não");
		
		
		Scanner adicionandoSaldoInicialContaCorrente = new Scanner(System.in);
		int ASICC = adicionandoSaldoInicialContaCorrente.nextInt();
		
		
		if (ASICC == 1) {
			System.out.println("\n" + "Ok, informe o valor a ser adicionado na conta:");
			
			Scanner quantidadeInicialContaCorrente = new Scanner(System.in);
			double QICC = quantidadeInicialContaCorrente.nextDouble();
			
			
			usuarios.put(NUCC, QICC);
			
			
			System.out.println("\n" + "Sua conta foi criada com sucesso " + NUCC + "\nTipo da conta: Conta Corrente"
					+ "\nSaldo inicial de: R$"+QICC);
		}
		else if (ASICC == 2) {
			
			
			usuarios.put(NUCC, 0.0);
			
			
			System.out.println("\n" + "Sua conta foi criada com sucesso " + NUCC + "\nTipo da conta: Conta Corrente"
				+ "\nNão contém saldo inicial");
		}
	}
	
	public void DepositarContaCorrente() {
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
		
		System.out.println("\n" + "Informe o nome do cliente que receberá o valor transferido:");
		
		Scanner nomeUsuarioDepositoContaCorrente = new Scanner(System.in);
		String NUDCC = nomeUsuarioDepositoContaCorrente.nextLine();
		
		
		if (usuarios.containsKey(NUDCC)) {
			
			System.out.println("\n"+ "Usuário confirmado, insira o valor a ser depositado:");
			
			Scanner quantiaDepositoContaCorrente = new Scanner(System.in);
			double QDCC = quantiaDepositoContaCorrente.nextFloat();
			
			deposito = usuarios.get(NUDCC) + QDCC;
			
			System.out.println("\n" + "O valor foi transferido com sucesso na conta de: " +NUDCC + "\n"
					+ "Agora o Saldo atual da conta é: R$"+deposito);
			
			usuarios.replace(NUDCC, deposito);
			}
		else {
			System.out.println("\n" + "Usuário não encontrado, verifique se o nome foi escrito corretamente ou caso não exista conta crie uma");
			
		}
	}
	
	public void saqueContaCorrente() {
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
		
		System.out.println("\n" + "Digite o nome do usuário que terá o valor retirado:");
		
		Scanner nomeUsuarioSaqueContaCorrente = new Scanner(System.in);
		String NUSCC = nomeUsuarioSaqueContaCorrente.nextLine();
		
		if (usuarios.containsKey(NUSCC)) {
			
			System.out.println("\n" + "Usuário confirmado, informe o valor que será sacado:");
			
			Scanner quantidadeSacadaContaCorrente = new Scanner(System.in);
			double QSCC = quantidadeSacadaContaCorrente.nextDouble();
			
			sacar = usuarios.get(NUSCC) - QSCC;
			
			System.out.println("\n" + "O valor foi sacado com sucesso na conta de: " + NUSCC  
					+ "\n" + "Agora o saldo da conta é de: R$"+sacar);
			
			usuarios.replace(NUSCC, sacar);
		}
		else {
			System.out.println("\n" + "Usuário não encontrado, verifique se o nome foi escrito corretamente ou caso não exista conta crie uma");
		}
	}
	public void criarUsuarioContaCorrente() {
		System.out.println("\n" + "Digite o nome de usuário que será utulizado, verifique se foi escrito corretamente.");
		
		Scanner nomeCriandoUsuarioContaCorrente = new Scanner(System.in);
		String NCUCC = nomeCriandoUsuarioContaCorrente.nextLine();
		
		usuarios.put(NCUCC, 0.0);
		
		System.out.println("\n" + "Seu usuário foi criado com sucesso, seu tipo de cont é Conta Corrente e seu saldo inicial é de 0.0");
		}

	 	public void transferenciaDeValores(String nomeUsuario, Double valorTransferido) {
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
			
			usuarios.replace(nomeUsuario,(quantiaAtual - vTarifa()));
	 	}
	 	
	 	public void recebendoQuantiaTransferida(String nomeUsuario, Double valorTransferido) {
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
			
			double recebendoQuantiaAtual = usuarios.get(nomeUsuario);
			
			double novaQuantia = recebendoQuantiaAtual + valorTransferido;
			
			usuarios.replace(nomeUsuario, novaQuantia);
	 	}
		}