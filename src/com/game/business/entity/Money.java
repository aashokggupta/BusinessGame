package com.game.business.entity;

import java.math.BigDecimal;

public class Money {
	private BigDecimal value;
	private BigDecimal asset = new BigDecimal(0);
	
	

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
	
	

	public BigDecimal getAsset() {
		return asset;
	}

	public void setAsset(BigDecimal asset) {
		this.asset = asset;
	}

	public void addMoney(int i) {
		this.value = this.value.add(new BigDecimal(i));
	}

	public void subtractMoney(int i) {
		this.value = this.value.subtract(new BigDecimal(i));
	}
	
	public void addAsset(int i) {
		this.asset = this.asset.add(new BigDecimal(i));
	}

	public void subtractAsset(int i) {
		this.asset = this.asset.subtract(new BigDecimal(i));
	}
}
