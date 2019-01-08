package br.com.caelum.ingresso.model;

import java.time.LocalTime;

public class Sessao {
	
	private Integer id;
	private LocalTime horario;
	private Sala sala;
	private Filme filme;
	
	public Sessao(LocalTime horario, Sala sala, Filme filme) {
		super();
		this.horario = horario;
		this.sala = sala;
		this.filme = filme;
	}
	
	public LocalTime getHorarioTermino() {
		return this.horario.plusMinutes(filme.getDuracao().toMinutes());
	}
	
	//getters

	public Integer getId() {
		return id;
	}

	public LocalTime getHorario() {
		return horario;
	}

	public Sala getSala() {
		return sala;
	}

	public Filme getFilme() {
		return filme;
	}
	
	

}
