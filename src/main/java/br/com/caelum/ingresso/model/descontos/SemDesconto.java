package br.com.caelum.ingresso.model.descontos;

import java.math.BigDecimal;

public class SemDesconto implements Desconto{

	@Override
	public BigDecimal aplicarDescontosobre(BigDecimal precoOriginal) {
		// TODO Auto-generated method stub
		return precoOriginal;
	}
}