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
	
	public LocalTime getHorarioTermino(){
		return this.horario.plusMinutes(filme.getDuracao().toMinutes());
	}

	private Integer getId() {
		return id;
	}

	private void setId(Integer id) {
		this.id = id;
	}

	private LocalTime getHorario() {
		return horario;
	}

	private void setHorario(LocalTime horario) {
		this.horario = horario;
	}

	private Sala getSala() {
		return sala;
	}

	private void setSala(Sala sala) {
		this.sala = sala;
	}

	private Filme getFilme() {
		return filme;
	}

	private void setFilme(Filme filme) {
		this.filme = filme;
	}
 }
