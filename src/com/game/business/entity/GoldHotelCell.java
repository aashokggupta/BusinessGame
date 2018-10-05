package com.game.business.entity;

import java.math.BigDecimal;

public class GoldHotelCell extends Hotel implements Cell {

	private boolean isOwner = false;
	private Player playerOwner;
	
	

	public GoldHotelCell(boolean isOwner, Player playerOwner) {
		super();
		this.isOwner = isOwner;
		this.playerOwner = playerOwner;
	}



	public GoldHotelCell() {
		// TODO Auto-generated constructor stub
	}



	@Override
	public void performAction(Player player, Bank bank, Board board) {
			if(player.getName().equals(playerOwner.getName())) {
				if(player.getMoney().getValue().compareTo(new BigDecimal(100))==1) {
					player.getMoney().subtractMoney(100);
					player.getMoney().addAsset(100);
					Cell[] cells = board.getCells();
					Cell cell = cells[player.getCurrentPosition()];
					cell = new PlatinumHotelCell(true,player);
				} 
			} else {
				player.getMoney().subtractMoney(50);
				playerOwner.getMoney().addMoney(50);
			}
	}

}
