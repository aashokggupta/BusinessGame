package com.game.business.entity;

public class LotteryCell implements Cell {

	@Override
	public void performAction(Player player, Bank bank, Board board) {
		player.getMoney().addMoney(200);
		bank.getMoney().subtractMoney(200);
	}

}
