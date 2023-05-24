package br.senac.edu.modelo.entidade.pessoa.aluno;

import br.senac.edu.modelo.entidade.pessoa.Pessoa;
import br.senac.edu.modelo.entidade.turma.Turma;
import br.senac.edu.modelo.enumeracao.pessoa.aluno.Status;

public class Aluno extends Pessoa{
	private String matricula;
	private Turma turma;
	private Status status;
	
	public Aluno(String nome, byte idade, String cpf, Turma turma,String matricula, Status status) {
		super(nome,idade,cpf);
		this.setTurma(turma);
		this.setMatricula(matricula);
		this.setStatus(status);
	}
	
	public Aluno(String nome, byte idade, String cpf, Turma turma,String matricula) {
		super(nome,idade,cpf);
		this.setTurma(turma);
		this.setMatricula(matricula);
		this.setStatus(Status.MATRICULADO);
	}
	
	public void responderChamada() {
		System.out.println("Presente!");
	}
	
	public String toString() {
		return ("Aluno: "+getNome()+"\nIdade: " + getIdade()+"\nCPF: "+getCpf()+"\nMatéria: "+getTurma().getMateria()+"\nMatricula: "+getMatricula() + "\nStatus: "+getStatus());
	}	
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Turma getTurma() {
		return turma;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}
	
}
