package aula2;

public class Aluno {
	private String nome;
	private int idade;
	private String curso;

//Construtor

public Aluno(String nome, int idade, String curso) {
	this.nome = nome;
	this.idade = idade;
	this.curso = curso;
	}
//Metodo Get e Set
public String getNome() {
	return nome;
	
}
public void setNome(String nome) {
	this.nome = nome;
}

public void exibirInfo() {
	System.out.println(nome + " " + idade + " " + curso);
	}
}

