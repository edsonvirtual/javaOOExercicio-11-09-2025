
public class ContaBancaria {

	private int numeroConta;
	private String titularConta;
	private double saldoConta;
	
	//construtor
	
	public ContaBancaria(int numeroConta, String titulaConta, double saldoConta, String titularConta){
		this.numeroConta = numeroConta;
		this.titularConta = titularConta;
		this.saldoConta = saldoConta;
	}
	
	//Metodos get e set
	
	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
		
	}
	
	public void exibirInfo() {
		System.out.println(numeroConta + " " + titularConta + "" + saldoConta);
	}
}
