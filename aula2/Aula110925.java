package aula2;

public class Aula110925 {

	public class TesteIgualde{
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String frase1;
		String frase2;

		String frase3;
		String frase4;
		
		frase1 = new String("Testando igualdade");
		frase2 = new String("Testando igualdade");
		
		frase3 = new String("Testando igualdade");
		frase4 = new String("Testando igualdade");
		
		System.out.println("Frase 1: " + frase1);
		System.out.println("Frase 2: " + frase2);
		System.out.println("Frase 1 e Frase 2 são iguais? R: " + (frase1 == frase2));
		System.out.println("Frase 1 e Frase 2 são iguais? R: " + (frase3.equals(frase4)));
			
		}
	}
}
