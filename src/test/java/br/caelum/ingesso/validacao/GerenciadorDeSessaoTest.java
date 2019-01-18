package br.caelum.ingesso.validacao;

import static org.junit.Assert.fail;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.caelum.ingresso.validacao.GerenciadorDeSessao;
import br.com.caelum.ingresso.model.Filme;
import br.com.caelum.ingresso.model.Sala;
import br.com.caelum.ingresso.model.Sessao;

public class GerenciadorDeSessaoTest {
	
	private Filme rogueOne;
	private Sala sala3d;
	private Sessao sessaoDas10;
	private Sessao sessaoDas13;
	private Sessao sessaoDas18;
	private Sessao sessaoDas12;
	
	
	@Before
	public void preparaSessoes() {
		this.rogueOne = new Filme("Rogue One", Duration.ofMinutes(120), "Sci-Fi", BigDecimal.TEN);
		this.sala3d = new Sala("Sala 3D", BigDecimal.TEN);
		
		this.sessaoDas10 = new Sessao(LocalTime.parse("10:00:00"), sala3d, rogueOne);
		this.sessaoDas12 = new Sessao(LocalTime.parse("12:00:00"), sala3d, rogueOne);
		this.sessaoDas13 = new Sessao(LocalTime.parse("13:00:00"), sala3d, rogueOne);
		this.sessaoDas18 = new Sessao(LocalTime.parse("18:00:00"), sala3d, rogueOne);
	}

	@Test
	public void garante_que_nao_deve_permitir_sessao_no_mesmo_horaio() {
		
		List<Sessao> sessoes = Arrays.asList(sessaoDas10);
		GerenciadorDeSessao gerenciador = new GerenciadorDeSessao(sessoes);
		Assert.assertFalse(gerenciador.cabe(sessaoDas10));
	}
	
	@Test
	public void garante_que_nao_deve_permitir_sessoes_terminando_dentro_do_horario_de_uma_sessao_ja_existente() {
		List<Sessao> sessoes = Arrays.asList(sessaoDas13);
		GerenciadorDeSessao gerenciador = new GerenciadorDeSessao(sessoes);
		Assert.assertFalse(gerenciador.cabe(sessaoDas12));
		
	}
	
	@Test
	public void garante_que_nao_deve_permitir_sessoes_iniciando_dentro_do_horario_de_uma_sessao_ja_existente() {
		List<Sessao> sessoes = Arrays.asList(sessaoDas12);
		GerenciadorDeSessao gerenciador = new GerenciadorDeSessao(sessoes);
		Assert.assertFalse(gerenciador.cabe(sessaoDas13));
	}
	
	@Test
	public void garante_que_deve_permitir_inserir_uma_sessao_entre_duas_sessoes() {
		List<Sessao> sessoes = Arrays.asList(sessaoDas10,sessaoDas18);
		GerenciadorDeSessao gerenciador = new GerenciadorDeSessao(sessoes);
		Assert.assertTrue(gerenciador.cabe(sessaoDas13));
	}

}
