package aula2;

public class AppAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno aluno1 = new Aluno("Guilherme", 22, "ADS");
		Aluno aluno2 = new Aluno("Edson", 40, "Ciências da computação");
		
		//usando metodos
		aluno1.exibirInfo();
		aluno2.exibirInfo();
		
		//Alterando atributos via set
		
		aluno1.setNome("João");
		System.out.println("Novo aluno do aluno1: " + aluno1.getNome());
		
				
	}
	

}
