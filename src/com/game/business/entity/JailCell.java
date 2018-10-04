package com.game.business.entity;

public class JailCell implements Cell {

	@Override
	public void performAction(Player player, Bank bank, Board board) {
		player.getMoney().subtractMoney(150);
		bank.getMoney().addMoney(150);
	}

}
