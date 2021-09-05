package Contas;


import java.util.HashMap;
import java.util.Scanner;

public class ContaPoupança  {
	
	private Double sacar;
	private Double deposito;
	private Double saldo;

	
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
	
	public double getSaldoContaPoupança() {
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
	public void setSaldoContaPoupança(double saldo) {
		this.saldo = saldo;
	}
	
	public void criandoCP() {
		System.out.println("\n" + "Informe o nome do usuário:");
		
		Scanner nomeUsuarioContaPoupança = new Scanner(System.in);
		String NUCP = nomeUsuarioContaPoupança.nextLine();
		
		System.out.println("\n" + "Deseja adicionar um saldo incial na sua conta?"+ "\n[1] Sim" + "\n[2] Não");
		
		Scanner adicionarSaldoInicialContaPoupança = new Scanner(System.in);
		int ASICP = adicionarSaldoInicialContaPoupança.nextInt();
		
		if (ASICP == 1) {
			System.out.println("\n" + "Ok, Informe a quantidade do valor inicial na conta:");
			
			Scanner quantidadeInicialContaPoupança = new Scanner(System.in);
			double QICP = quantidadeInicialContaPoupança.nextDouble();
			
			usuarios.put(NUCP, QICP); 
			
			System.out.println("\n" + "Ola " + NUCP + " Sua conta poupança foi criada com sucesso!\n"
					+ "Seu saldo inicial é de : R$"+QICP);
		}
		else if (ASICP == 2) {
			
			usuarios.put(NUCP, 0.0);
			
			System.out.println("\n" + "Ola " + NUCP + " Sua conta poupança foi criada com sucesso!\n"
					+ "Porém não contém saldo inicial.\n");
		}
	}
	
	public void depositarContaPoupança() {
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
		
		System.out.println("\n" + "Informe o nome do usuário que receberá o valor:");
		
		Scanner nomeUsuarioDepositoContaPoupança = new Scanner(System.in);
		String NUDCP = nomeUsuarioDepositoContaPoupança.nextLine();
		
		if (usuarios.containsKey(NUDCP)) {
			
			System.out.println("\n" + "Usuario confirmado, Insira o valor que será depositado:");
			
			Scanner quantidadeDepositoContaPoupança = new Scanner(System.in);
			double QDCP = quantidadeDepositoContaPoupança.nextFloat();
			
			deposito = usuarios.get(NUDCP) + QDCP;
			
			System.out.println("\n" + "Quantidade Transferida com Sucesso na conta de " + NUDCP + "\n" + "O novo saldo da conta é: R$"+deposito);
			
			usuarios.replace(NUDCP, deposito);
		}
		
		else {
			System.out.println("\n" + "Usuário não encontrado, verifique se o nome foi escrito corretamente e caso não exista a conta crie uma.");
		}
	}
	
	public void SaqueContaPoupança() {
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
		
		System.out.println("\n" + "Informe o nome do usuário");
		
		Scanner nomeUsuarioSaqueContaPoupança = new Scanner(System.in);
		String NUSCP = nomeUsuarioSaqueContaPoupança.nextLine();
		
		if (usuarios.containsKey(NUSCP)) {
			
			System.out.println("\n" + "Usuário Confirmado, insira o valor a ser sacado");
			
			Scanner quantidadeSaqueContaPoupança = new Scanner(System.in);
			double QSCP = quantidadeSaqueContaPoupança.nextDouble();
			
			sacar = usuarios.get(NUSCP) - QSCP;
			
			System.out.println("\n" + "Valor retirado com sucesso da conta de " + NUSCP + "\n"
					+ "O novo saldo da conta é: R$"+sacar);
			
			usuarios.replace(NUSCP, sacar);
		}
		
		else {
			System.out.println("\n" + "Usuário não encontrado, verifique se o nome foi escrito corretamente e caso não exista a conta crie uma.");
		}
	}
	
	public void criandoUsuarioContaPoupança() {
		
		System.out.println("\n" + "Informe o nome de usuário que será utilizado, confira se foi escrito corretamente.");
		
		Scanner nomeCriandoUsuarioContaPoupança = new Scanner(System.in);
		String NCUCP = nomeCriandoUsuarioContaPoupança.nextLine();
		
		usuarios.put(NCUCP, 0.0);
		
		System.out.println("\n" + "Criação de usuário finalizada com sucesso!!" + "\n"
				+ "Tipo de Conta: Conta Poupança" + "\n"
						+ "Saldo de 0.0");
	}
	
	public void transfereValor(String nomeUsuario, Double valorTransferido) {
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
		
		usuarios.replace(nomeUsuario, quantiaAtual);
	}
	
	public void recebimentoQuantiaTransferida(String nomeUsuario, Double valorTransferido) {
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
