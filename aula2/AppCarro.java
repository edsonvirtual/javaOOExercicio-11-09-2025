package aula2;

public class AppCarro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carro carro1 = new Carro("Ford", "Fiesta", 2020);
		Carro carro2 = new Carro("Mitsubshi", "L-200", 2022);
		
		//usando métodos
		carro1.ligar();
		carro2.ligar();
		
		//Alterando atributos vis set
		carro1.setMarca("Chevrolet");
		System.out.println("Nova Marca do carro1: " + carro1.getMarca());
		
	}

}
