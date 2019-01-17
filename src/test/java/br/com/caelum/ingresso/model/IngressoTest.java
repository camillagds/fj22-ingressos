package br.com.caelum.ingresso.model;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalTime;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IngressoTest {

	private Filme rogueOne;
	private Sala sala3d;
	private Sessao sessaoDas10;
	private Lugar A1;
	private TipoDeIngresso tipoDeIngresso;
	
	
	@Before
	public void preparaSessoes() {
		this.rogueOne = new Filme("Rogue One", Duration.ofMinutes(120), "Sci-Fi", new BigDecimal("10.0"));
		this.sala3d = new Sala("Sala 3D", new BigDecimal("10.0"));
		this.sessaoDas10 = new Sessao(LocalTime.parse("10:00:00"), sala3d, rogueOne);
		this.A1 = new Lugar("A",1);
		
	}
	
	
	@Test
	public void nao_deve_aplicar_desconto_quando_ingresso_for_Sem_Desconto (){
		Ingresso ingresso = new Ingresso(sessaoDas10, TipoDeIngresso.INTEIRO, A1);
		
		BigDecimal precoEsperado = new BigDecimal ("20.00");
		
		Assert.assertEquals(precoEsperado, ingresso.getPreco());

	}
	
	@Test
	public void deve_aplicar_30_por_cento_de_desconto_quando_for_ingresso_para_bancos() {
		Ingresso ingresso = new Ingresso(sessaoDas10, TipoDeIngresso.BANCO, A1);
		
		BigDecimal precoEsperado = new BigDecimal ("14.00");
		
		Assert.assertEquals(precoEsperado, ingresso.getPreco());

	}
	
	@Test
	public void deve_aplicar_50_de_desconto_quando_for_ingresso_para_estudante() {
		Ingresso ingresso = new Ingresso(sessaoDas10, TipoDeIngresso.ESTUDANTE , A1);
		
		BigDecimal precoEsperado = new BigDecimal ("10.00");
		
		Assert.assertEquals(precoEsperado, ingresso.getPreco());

	}


}
