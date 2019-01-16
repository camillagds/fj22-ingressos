package br.com.caelum.ingresso.model;

import java.math.BigDecimal;

import br.caelum.ingesso.model.descontos.Desconto;
import br.caelum.ingesso.model.descontos.DescontoParaBancos;
import br.caelum.ingesso.model.descontos.DescontoParaEstudantes;
import br.caelum.ingesso.model.descontos.SemDesconto;

public enum TipoDeIngresso {
	
	INTEIRO(new SemDesconto()),
	ESTUDANTE (new DescontoParaEstudantes()),
	BANCO (new DescontoParaBancos());

	private final Desconto desconto;
	
	TipoDeIngresso(Desconto desconto){
		this.desconto = desconto;
	}
	
	public BigDecimal aplicaDesconto(BigDecimal valor) {
		return desconto.aplicarDescontoSobre(valor);
	}
	
	public String getDescricao() {
		return desconto.getDescricao();
	}
}
