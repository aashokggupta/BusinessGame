package com.game.business.entity;

public class JailCell implements Cell {

	@Override
	public int performAction(Player player) {
		player.setMoney(player.getMoney().subtractMoney(150));
		return 0;
	}

}
