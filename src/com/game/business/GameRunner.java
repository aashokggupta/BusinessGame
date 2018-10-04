package com.game.business;

import java.math.BigDecimal;

import com.game.business.entity.Bank;
import com.game.business.entity.Board;
import com.game.business.entity.Money;
import com.game.business.entity.Player;

public class GameRunner {
	public static void main (String args[]) {
		Money bankMoney = new Money(new BigDecimal(1000));
		Bank bank = new Bank(bankMoney);
		
		Money playerMoney = new Money(new BigDecimal(1000));
		Player player = new Player("1", playerMoney);
		Player player1 = new Player("2", playerMoney);
		
		Player[] players = {player,player1};
		
		Board board = new Board(players);
		
		startGame(board, players,bank);
	}

	private static void startGame(Board board, Player[] players,Bank bank) {
		for(int i=0; i<10; i++) {
			players[0].move(board,bank);
			players[1].move(board,bank);
		}
	}
}
