package com.game.business.entity;

public class Player {
	private String name;
	private Money money;
	
	public Player(String name, Money money) {
		super();
		this.name = name;
		this.money = money;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Money getMoney() {
		return money;
	}
	public void setMoney(Money money) {
		this.money = money;
	}
	
	
}
