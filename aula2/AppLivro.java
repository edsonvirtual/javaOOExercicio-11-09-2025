
public class AppLivro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Livro livro1 = new Livro("Nome do livro: A era do Gelo\n", "Autor: Gelo\n Ano de Publicacao", 2010 );
		Livro livro2 = new Livro("Nome do livro: lampiao o rei do cangaco\n","Autor: Fernando Moura\n ano de publicacao", 2012);
		
		//usando metodos
		livro1.exibirInfo();
		livro2.exibirInfo();
		
		//Alternado atributos via set
		
		livro2.setTitulo("lampiao");
		System.out.println("Novo Livro do livro2 é: " + livro2.getTitulo());

	}

}
