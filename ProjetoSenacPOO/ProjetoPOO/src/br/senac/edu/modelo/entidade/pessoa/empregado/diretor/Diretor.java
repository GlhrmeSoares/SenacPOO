package br.senac.edu.modelo.entidade.pessoa.empregado.diretor;

import br.senac.edu.modelo.entidade.pessoa.empregado.Empregado;
import br.senac.edu.modelo.entidade.pessoa.empregado.gestor.Gestor;
import br.senac.edu.modelo.enumeracao.gestor.Status;

public class Diretor extends Empregado implements Gestor{

	public Diretor(String nome, byte idade, String cpf, String ctps,float valorHora, Status status) {
		super(nome, idade, cpf, ctps,valorHora, status);
	}

	@Override
	public float calcularSalario() {
		return 2000;
	}

	@Override
	public void contratarEmpregado(Empregado empregado) {
		empregado.setStatus(Status.CONTRATADO);
	}

	@Override
	public void demitirEmpregado(Empregado empregado) {
		empregado.setStatus(Status.DEMITIDO);
	}
	
	

}
