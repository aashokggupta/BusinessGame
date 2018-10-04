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

	public Money addMoney(int i) {
		return new Money(this.value.add(new BigDecimal(i)));
	}

	public Money subtractMoney(int i) {
		return new Money(this.value.subtract(new BigDecimal(i)));
	}
}
