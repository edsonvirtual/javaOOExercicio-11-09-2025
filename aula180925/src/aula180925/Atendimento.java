package aula180925;

import java.util.Date;

public class Atendimento {
	private int dataAtendimento;
	private String nomeMedico;
	private String observacaoAtendimento;
	
	public Atendimento(int dataAtendimento, String nomeMedico, String observacaoAtendimento) {
		this.dataAtendimento = dataAtendimento;
		this.nomeMedico = nomeMedico;
		this.observacaoAtendimento = observacaoAtendimento;
	}
	public int getDataAtendimento() {
		return dataAtendimento;
	}
	public void setDataAtendimento(int dataAtendimento) {
		this.dataAtendimento = dataAtendimento;
	}
	public String getNomeMedico() {
		return nomeMedico;
	}
	public void setNomeMedico(String nomeMedico) {
		this.nomeMedico = nomeMedico;
	}
	public String getObservacaoAtendimento() {
		return observacaoAtendimento;
	}
	public void setObservacaoAtendimento(String observacaoAtendimento) {
		this.observacaoAtendimento = observacaoAtendimento;
	}
	
	public void exibirInfoAtendimento() {
		System.out.print("Data atendimento: " +  dataAtendimento +  "\n "  + "Nome do Medico:  " + nomeMedico + "\n " + "Observações: " + observacaoAtendimento + "\n");
	}
}
	
