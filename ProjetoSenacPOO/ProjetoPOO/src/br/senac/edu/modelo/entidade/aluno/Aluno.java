package br.senac.edu.modelo.entidade.aluno;

public class Aluno {
	private String nome;
	private byte idade;
	private String cpf;
	
	public Aluno(String nome, byte idade, String cpf) {
		this.setNome(nome);
		this.setIdade(idade);
		this.setCpf(cpf);
	}
	
	public void responderChamada() {
		System.out.println("Presente!");
	}
	
	public String toString() {
		return ("Aluno: "+this.nome+"\nIdade: " + this.idade+"\nCPF: "+this.cpf);
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
