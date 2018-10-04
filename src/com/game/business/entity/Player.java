package com.game.business.entity;

public class Player {
	private String name;
	private Money money;
	private int currentPosition = 0;
	private Dice dice= new Dice();
	
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
	public int getCurrentPosition() {
		return currentPosition;
	}
	public void setCurrentPosition(int currentPosition) {
		this.currentPosition = currentPosition;
	}
	public void move(int diceNum, Board board, Bank bank) {
		int diceNumber = diceNum;
		Cell[] cells = board.getCells();
		
		this.currentPosition = currentPosition + diceNumber;
		Cell cell = cells[currentPosition];
		cell.performAction(this,bank,board);
	}
	
}
