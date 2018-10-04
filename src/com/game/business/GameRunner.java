package com.game.business;

import java.math.BigDecimal;

import com.game.business.entity.Board;
import com.game.business.entity.Money;
import com.game.business.entity.Player;

public class GameRunner {
	public static void main (String args[]) {
		Money playerMoney = new Money(new BigDecimal(1000));
		Player player = new Player("1", playerMoney);
		Player player1 = new Player("2", playerMoney);
		Player player2 = new Player("3", playerMoney);
		
		Player[] players = {player,player1,player2};
		
		Board board = new Board(players);
	}
}
