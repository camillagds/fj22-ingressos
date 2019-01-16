package br.caelum.ingesso.model.descontos;

import java.math.BigDecimal;

public interface Desconto {
	
	String getDescricao();
	
	BigDecimal aplicarDescontoSobre(BigDecimal precoOriginal);

}
