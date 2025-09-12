
public class Livro {

	private String titulo;
	private String autor;
	private int anoPublicacao;
	
	//construtor
	public Livro (String titulo, String autor, int anoPublicacao) {
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
		
	}	
	//Metodos get e set
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
		
	}
	
	
	public void exibirInfo() {
		System.out.println(titulo + " " + autor + " " + anoPublicacao);
	}
}




