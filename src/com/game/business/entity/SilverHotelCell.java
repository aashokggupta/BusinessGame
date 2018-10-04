package com.game.business.entity;

import java.math.BigDecimal;

public class SilverHotelCell extends Hotel implements Cell {
	
	private boolean isOwner = false;
	private Player playerOwner;

	@Override
	public void performAction(Player player, Bank bank, Board board) {
		if(!isOwner) {
			if(player.getMoney().getValue().compareTo(new BigDecimal(200))==1) {
				player.getMoney().subtractMoney(200);
				player.getMoney().addAsset(200);
				playerOwner = player;
				isOwner =true;
			} 
		} else {
			if(player.getName().equals(playerOwner.getName())) {
				if(player.getMoney().getValue().compareTo(new BigDecimal(100))==1) {
					player.getMoney().subtractMoney(100);
					player.getMoney().addAsset(100);
					Cell[] cells = board.getCells();
					Cell cell = cells[player.getCurrentPosition()];
					cell = new GoldHotelCell(true, player);
				} 
			} else {
				player.getMoney().subtractMoney(50);
				playerOwner.getMoney().addMoney(50);
			}
		}
	}

}
