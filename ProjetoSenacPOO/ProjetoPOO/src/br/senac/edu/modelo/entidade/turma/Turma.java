package br.senac.edu.modelo.entidade.turma;

import br.senac.edu.modelo.entidade.pessoa.aluno.Aluno;
import br.senac.edu.modelo.entidade.pessoa.empregado.professor.Professor;

public class Turma {
	private String nome;
	private byte cargaHoraria;
	private Professor professor;
	private Aluno[] alunos;
	private byte qtdAlunosMatriculados;
	private String materia;;
	
	public Turma(String nome,byte cargaHoraria, byte tamanho) {
		setNome(nome);
		setCargaHoraria(cargaHoraria);
		alunos = new Aluno[tamanho];
	}
	
	public Turma(String nome,byte cargaHoraria, byte tamanho, Professor professor, String materia) {
		setNome(nome);
		setCargaHoraria(cargaHoraria);
		alunos = new Aluno[tamanho];
		setProfessor(professor);
		setMateria(materia);
		qtdAlunosMatriculados = 0;
	}
	
	public boolean inserirAluno(Aluno aluno) {
		if(qtdAlunosMatriculados == alunos.length) 
			return false;
			
		alunos[qtdAlunosMatriculados] = aluno;
		qtdAlunosMatriculados++;
		
		return true;
	}
	
	public boolean removerAluno(Aluno aluno) {
		if(qtdAlunosMatriculados ==0) 
			return false;
		
		for(int i=0;i<alunos.length;i++) {
			if(alunos[i] != null && alunos[i].getCpf().equals(aluno.getCpf())) {
				alunos[i] = null;
				realocarVetor(i);
				qtdAlunosMatriculados--;
			}
		}
		
		return true;
	}
	
	public Aluno recuperarAluno(String cpf) {
		
		if(qtdAlunosMatriculados ==0)
			return null;
		
		for(Aluno i: alunos) {
			if(i != null && i.getCpf().equals(cpf)) 
				return i;
		}
		return null;
	}
	
	// Usado apenas para a exclusão de um objeto
	private void realocarVetor(int index) {
		do {
			alunos[index] = alunos[index+1];
			alunos[index+1] = null;
			index++;
		}while(index < alunos.length-1 && alunos[index+1]==null);
	}
	
	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
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
	
}
