package br.senac.edu.modelo.entidade.professor;

public class Professor {
	private String nome;
	private byte idade;
	private String cpf;
	private String materia;
	
	public Professor(String nome,byte idade, String cpf, String materia) {
		this.setNome(nome);
		this.setIdade(idade);
		this.setCpf(cpf);
		this.setMateria(materia);
	}
	
	public void fazerChamada() {
		System.out.println("Olha a chamada!");
	}
	
	public String toString() {
		return ("Professor: "+this.nome+"\nIdade: " + this.idade+"\nCPF: "+this.cpf+"\nMateria: "+this.materia);
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
	public byte getIdade() {
		return idade;
	}
	public void setIdade(byte idade) {
		this.idade = idade;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
