package conta.model;

public class ContaCorrente extends Conta{ // Keyword extends significa que a classe está herdando atributos e métodos de outra
	
	// Atributo único da classe conta corrente
	private float limite;
	
	// Construtor herdado
	public ContaCorrente(int numero, int agencia, int tipo, String titular, float saldo, float limite) {
		super(numero, agencia, tipo, titular, saldo); // Usa o construtor da super classe
		this.limite = limite;
	}
	
	// Getters e Setters
	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	// Métodos sobrescritos
	@Override 
	public boolean sacar(float valor) { // Método sacar modificado
		
		if(this.getSaldo() + this.getLimite() < valor) {
			System.out.println("\n Saldo Insuficiente!");
			return false;
		}
		
		this.setSaldo(this.getSaldo() - valor);
		return true;
		
	}
	
    @Override
	public void visualizar() { // Método visualizar modificado
		super.visualizar(); // Usa o método base da super classe
		System.out.println("Limite de Crédito: " + this.limite); // Acrescenta um dado único da classe
	}
    
}