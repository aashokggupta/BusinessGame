package com.game.business.entity;

public class EmptyCell implements Cell {

	@Override
	public int performAction(Player player) {
		return 0;
	}

}
