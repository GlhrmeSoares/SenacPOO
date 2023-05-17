package br.senac.edu;

import br.senac.edu.modelo.entidade.aluno.Aluno;
import br.senac.edu.modelo.entidade.professor.Professor;

public class Principal {

	public static void main(String[] args) {
		Professor prof01 = new Professor("Cleber",(byte) 35, "123.456.789-80","Música");
		Aluno aluno01 = new Aluno("João", (byte) 20, "321.654.987-76");
		
		System.out.println(prof01.toString());
		System.out.println("O nome do aluno é "+aluno01.getNome());
		
		prof01.fazerChamada();
		aluno01.responderChamada();
	}

}
