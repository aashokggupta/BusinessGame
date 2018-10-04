package com.game.business.entity;

public class PlatinumHotelCell extends Hotel implements Cell {

	private boolean isOwner = false;
	private Player playerOwner;
	
	

	public PlatinumHotelCell(boolean isOwner, Player playerOwner) {
		super();
		this.isOwner = isOwner;
		this.playerOwner = playerOwner;
	}



	@Override
	public void performAction(Player player, Bank bank, Board board) {
			if(player.getName().equals(playerOwner.getName())) {
			} else {
				player.getMoney().subtractMoney(300);
				playerOwner.getMoney().addMoney(300);
			}
	}


}
