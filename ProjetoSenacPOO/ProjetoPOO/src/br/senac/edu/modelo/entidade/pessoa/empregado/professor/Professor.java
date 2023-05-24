package br.senac.edu.modelo.entidade.pessoa.empregado.professor;

import br.senac.edu.modelo.entidade.pessoa.empregado.Empregado;
import br.senac.edu.modelo.entidade.turma.Turma;
import br.senac.edu.modelo.enumeracao.gestor.Status;

public class Professor extends Empregado{
	
	private Turma turma;
	
	public Professor(String nome,byte idade, String cpf, String ctps,float valorHora,Turma turma, Status status) {
		super(nome,idade,cpf,ctps, valorHora, status);
		this.setTurma(turma);
	}
	
	public void fazerChamada() {
		System.out.println("Olha a chamada!");
	}
	
	public String toString() {
		return ("Professor: "+getNome()+"\nIdade: " + getIdade()+"\nCPF: "+getCpf()+"\nMatéria: "+ turma.getMateria());
	}
	
	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}
	
	public float calcularSalario() {
		return 1500;
	}
}
