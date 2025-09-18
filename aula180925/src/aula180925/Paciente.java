package aula180925;

public class Paciente {
	
	private String nome;
	private int idade;
	private int CPF;
	private int telefone;
	
	public Paciente(String nome, int idade, int cPF, int telefone) {
		this.nome = nome;
		this.idade = idade;
		CPF = cPF;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getCPF() {
		return CPF;
	}

	public void setCPF(int cPF) {
		CPF = cPF;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	public void exibirInfo() {
		System.out.print("Nome " + nome +  " \n" + "Idade: " + idade + "\n" + "CPF: " + " " + CPF +"\n" + "Telefone: " + " " + " " + telefone + "\n ");
	}

}
