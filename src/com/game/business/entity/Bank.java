package com.game.business.entity;

public class Bank {
	private Money money;

	public Bank(Money bankMoney) {
		this.money = bankMoney;
	}

	public Money getMoney() {
		return money;
	}

	public void setMoney(Money money) {
		this.money = money;
	}
	
}
