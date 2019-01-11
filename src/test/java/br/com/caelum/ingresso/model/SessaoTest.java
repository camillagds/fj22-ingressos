package br.com.caelum.ingresso.model;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalTime;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class SessaoTest {
	
	private Filme rogueOne;
	private Sala sala3d;
	private Sessao sessaoDas10;	
	
	@Before
	public void preparaSessao() {
		this.rogueOne = new Filme("Rogue One", Duration.ofMinutes(120), "Sci-Fi", BigDecimal.TEN);
		this.sala3d = new Sala("Sala 3D", BigDecimal.TEN);
		this.sessaoDas10 = new Sessao(LocalTime.parse("10:00:00"), sala3d, rogueOne);
	}

	@Test
	public void o_preco_da_sessao_deve_ser_igual_ao_perco_da_sala_mais_o_preco_do_filme() {
		Assert.assertEquals(sessaoDas10.getPreco(), rogueOne.getPreco().add(sala3d.getPreco()));
		
	}

}
