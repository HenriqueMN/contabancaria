package conta.model;

public class ContaPoupanca extends Conta{
	
	// Criação do atributo único da classe conta poupança
	private int aniversario;
	
	// Construtor herdado
	public ContaPoupanca(int numero, int agencia, int tipo, String titular, float saldo, int aniversario) {
		super(numero, agencia, tipo, titular, saldo);
		this.aniversario = aniversario;
	}
	
	// Getters e Setters
	public int getAniversario() {
		return aniversario;
	}

	public void setAniversario(int aniversario) {
		this.aniversario = aniversario;
	}
	
	// Método sobrescrito
    @Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Aniversário da conta: " + this.aniversario);
	}
    
}