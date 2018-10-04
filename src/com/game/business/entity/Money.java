package com.game.business.entity;

import java.math.BigDecimal;

public class Money {
	private BigDecimal value;
	
	

	public Money(BigDecimal value) {
		super();
		this.value = value;
	}

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}
}
