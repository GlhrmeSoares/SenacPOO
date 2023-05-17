package br.senac.edu.modelo.entidade.turma;

import br.senac.edu.modelo.entidade.aluno.Aluno;
import br.senac.edu.modelo.entidade.professor.Professor;

public class Turma {
	private String nome;
	private byte cargaHoraria;
	private Professor professor;
	private Aluno[] alunos;
	
	public Turma(String nome,byte cargaHoraria, byte tamanho) {
		setNome(nome);
		setCargaHoraria(cargaHoraria);
		alunos = new Aluno[tamanho];
	}
	
	public Turma(String nome,byte cargaHoraria, byte tamanho, Professor professor) {
		setNome(nome);
		setCargaHoraria(cargaHoraria);
		alunos = new Aluno[tamanho];
		setProfessor(professor);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public byte getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(byte cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public Aluno[] getAlunos() {
		return alunos;
	}
	public void inserirAluno(Aluno alunos) {
		
	}
	public void removerAluno(Aluno aluno) {
		
	}
	public void recuperarAluno(Aluno aluno) {
		
	}
	
	
}
