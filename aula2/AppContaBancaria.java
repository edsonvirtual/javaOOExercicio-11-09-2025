
public class AppContaBancaria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ContaBancaria c1 = new ContaBancaria (122, "\n Milionario \n R$", 25954.00, null );
		ContaBancaria c2 = new ContaBancaria (222, "\n Coringa \n R$", 35954.00, null );
		
		
		//usando metodos
		c1.exibirInfo();
		c2.exibirInfo();

		c2.setNumeroConta(002);
		System.out.println("Novo NUMERO CONTA : " + c2.getNumeroConta());
		
		

	}

}
