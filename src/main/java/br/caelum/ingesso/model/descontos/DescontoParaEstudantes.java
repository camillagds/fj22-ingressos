package br.caelum.ingesso.model.descontos;

import java.math.BigDecimal;

public class DescontoParaEstudantes implements Desconto{

	@Override
	public BigDecimal aplicarDescontoSobre(BigDecimal precoOriginal) {
		return precoOriginal.divide(new BigDecimal("2.0"));
	}

	@Override
	public String getDescricao() {
		return "Retorno para estudantes";
	}

}
