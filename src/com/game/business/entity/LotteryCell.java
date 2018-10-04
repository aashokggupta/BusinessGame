package com.game.business.entity;

public class LotteryCell implements Cell {

	@Override
	public int performAction(Player player) {
		player.setMoney(player.getMoney().addMoney(200));
		return 0;
	}

}
