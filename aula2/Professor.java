package aula2;

public class Professor {
	private String nome;
	private String disciplina;
	private double salario;

//construtor
public Professor(String nome, String disciplina, double salario) {
	this.nome = nome;
	this.disciplina = disciplina;
	this.salario = salario;
	}

//Metodos get e set
public String getNome() {
	return nome;
	}
public void setNome(String nome) {
	this.nome = nome;
}

public void exibirInfo() {
	System.out.println(nome + " " + disciplina + " " + salario);
}
}
