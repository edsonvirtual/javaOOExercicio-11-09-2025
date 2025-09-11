package aula2;

public class Carro {
	
	//Atributos
	private String marca;
	private String modelo;
	private int ano;
	
	//construtor
	public Carro(String marca, String modelo, int ano){
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
	}
	//Metodos Get e Set (encapsulamento)
	public String getMarca() {
		return marca;
		
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void ligar() {
		System.out.println(marca + " " + modelo + " está ligado!");
	}

}
