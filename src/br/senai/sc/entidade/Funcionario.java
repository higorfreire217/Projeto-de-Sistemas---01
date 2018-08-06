package br.senai.sc.entidade;

import java.util.*;

public abstract class Funcionario extends Pessoa {
	
	Date dataDeContratação;
	String CarteiraDeTrabalho;
	double Salario;

	
	public Funcionario() {
		// TODO Auto-generated constructor stub
	}


	public double getSalario() {
		return Salario;
	}

	public Funcionario(Date dataDeContratação, String carteiraDeTrabalho, double salario) {
		super();
		this.dataDeContratação = dataDeContratação;
		CarteiraDeTrabalho = carteiraDeTrabalho;
		Salario = salario;
	}
	public Funcionario(String nome, String cPF, java.sql.Date dataDeNascimento) {
		super(nome, cPF, dataDeNascimento);
		// TODO Auto-generated constructor stub
	}
}
