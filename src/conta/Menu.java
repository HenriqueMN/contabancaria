package conta;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import conta.util.Cores;

public class Menu {

	public static void main(String[] args) {
		
		/* ----- TESTES
		// Teste da Classe Conta
		Conta c1 = new Conta(1, 123, 1, "Adriana", 10000.0f);
		c1.visualizar();
		c1.sacar(12000.0f);
		c1.visualizar();
		c1.depositar(5000.0f);
		c1.visualizar();
		
		// Teste da Classe Conta Corrente
		ContaCorrente cc1 = new ContaCorrente(1, 123, 1, "José da Silva", 0.0f, 1000.0f);
		cc1.visualizar();
		cc1.sacar(12000.0f);
		cc1.visualizar();
		cc1.depositar(5000.0f);
		cc1.visualizar();
				
		// Teste da Classe Conta Poupança
		ContaPoupanca cp1 = new ContaPoupanca(2, 123, 2, "Maria dos Santos", 100000.0f, 15);
		cp1.visualizar();
		cp1.sacar(1000.0f);
		cp1.visualizar();
		cp1.depositar(5000.0f);
		cp1.visualizar();
		*/
		
		// Criação do Scanner e das variáveis
		Scanner leia = new Scanner(System.in);
		int opcao = 0;

		while (true) {
			
			// Menu do banco
			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND
					+ "*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                BANCO DO BRAZIL COM Z                ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar Conta                          ");
			System.out.println("            2 - Listar todas as Contas               ");
			System.out.println("            3 - Buscar Conta por Numero              ");
			System.out.println("            4 - Atualizar Dados da Conta             ");
			System.out.println("            5 - Apagar Conta                         ");
			System.out.println("            6 - Sacar                                ");
			System.out.println("            7 - Depositar                            ");
			System.out.println("            8 - Transferir valores entre Contas      ");
			System.out.println("            9 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     " + Cores.TEXT_RESET);
			
			// Bloco de tratamento de erro para checar se o tipo de input recebido é o correto
			try {
				opcao = leia.nextInt();
			}catch(InputMismatchException e){ // Exceção que indica uma entrada de dados de tipo inadequado
				System.out.println("\nDigite valores inteiros!");
				leia.nextLine();
				opcao = 0; // Redefine o valor da opção para 0
			}

			
			// Verifica se a opção não é sair
			if (opcao == 9) {
				System.out.println(Cores.TEXT_WHITE_BOLD + "\nBanco do Brazil com Z - O seu Futuro começa aqui!");
				sobre();
                leia.close(); // Fecha o Scanner
				System.exit(0);
			}
			
			// Switch com a opção
			switch (opcao) {
				case 1: // Cria a conta
					System.out.println(Cores.TEXT_WHITE + "Criar Conta\n\n");
					keyPress();
					break;
				case 2: // Lista todas as contas
					System.out.println(Cores.TEXT_WHITE + "Listar todas as Contas\n\n");
					keyPress();
					break;
				case 3: // Consulta os dados da conta
					System.out.println(Cores.TEXT_WHITE + "Consultar dados da Conta - por número\n\n");
					keyPress();
					break;
				case 4: // Atualiza os dados da conta
					System.out.println(Cores.TEXT_WHITE + "Atualizar dados da Conta\n\n");
					keyPress();
					break;
				case 5: // Apaga a conta
					System.out.println(Cores.TEXT_WHITE + "Apagar a Conta\n\n");
					keyPress();
					break;
				case 6: // Faz um saque
					System.out.println(Cores.TEXT_WHITE + "Saque\n\n");
					keyPress();
					break;
				case 7: // Faz um depósito
					System.out.println(Cores.TEXT_WHITE + "Depósito\n\n");
					keyPress();
					break;
				case 8: // Faz uma transferência para outra conta
					System.out.println(Cores.TEXT_WHITE + "Transferência entre Contas\n\n");
					keyPress();
					break;
				default: // Opção inválida
					System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!\n" + Cores.TEXT_RESET);
					break;
			}
		}
	}
    
	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: ");
		System.out.println("Henrique Mancini Nevado - henriquemancininevado@gmail.com");
		System.out.println("github.com/HenriqueMN");
		System.out.println("*********************************************************");

	}
	
	// Método que "pausa" o programa enquanto a tecla enter não for pressionada
	public static void keyPress() {

		try {
			System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
			System.in.read();
		} catch (IOException e) {
			System.out.println("Você pressionou uma tecla diferente de enter!");
		}
	}

}
