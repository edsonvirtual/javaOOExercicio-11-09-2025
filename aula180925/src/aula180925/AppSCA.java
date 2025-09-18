package aula180925;

import java.util.Date;


public class AppSCA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
				
		Paciente paciente1 = new Paciente ("Edson", 40, 123456, 88991123);	
		Paciente paciente2 = new Paciente ("Guilhereme", 21, 3564888, 11223344);
		
		
		Atendimento atendimento1 = new Atendimento(180925, "Dr. MotoMoto", "Atendimento clinica");
		Atendimento atendimento2 = new Atendimento(180925, "Dr. Gro", "Atendimento Pscicologo");
		
		System.out.println("--------------PACIENTE 1-----------------");
		paciente1.exibirInfo();
		atendimento1.exibirInfoAtendimento();
		
		
		System.out.println("-------------PACIENTE 2------------------");
		paciente2.exibirInfo();
		atendimento2.exibirInfoAtendimento();
		
			

	}

}
