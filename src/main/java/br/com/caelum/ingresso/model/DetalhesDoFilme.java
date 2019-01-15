package br.com.caelum.ingresso.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DetalhesDoFilme {
	
	@JsonProperty("Title")
	private String titulo;
	
	@JsonProperty("Year")
	private String ano;
	
	@JsonProperty("Poster")
	private String imagem;
	
	@JsonProperty("Director")
	private String direcao;
	
	@JsonProperty("Writer")
	private String redacao;
	
	@JsonProperty("Actors")
	private String elenco;
	
	@JsonProperty("Plot")
	private String sinopse;
	
	@JsonProperty("imdbRating")
	private String avaliacao;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	public String getDirecao() {
		return direcao;
	}

	public void setDirecao(String direcao) {
		this.direcao = direcao;
	}

	public String getRedacao() {
		return redacao;
	}

	public void setRedacao(String redacao) {
		this.redacao = redacao;
	}

	public String getElenco() {
		return elenco;
	}

	public void setElenco(String elenco) {
		this.elenco = elenco;
	}

	public String getSinopse() {
		return sinopse;
	}

	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}

	public String getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(String avaliacao) {
		this.avaliacao = avaliacao;
	}

}
