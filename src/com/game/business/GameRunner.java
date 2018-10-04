package com.game.business;

import java.math.BigDecimal;

import com.game.business.entity.Bank;
import com.game.business.entity.Board;
import com.game.business.entity.Money;
import com.game.business.entity.Player;

public class GameRunner {
	public static void main (String args[]) {
		Money bankMoney = new Money(new BigDecimal(5000));
		Bank bank = new Bank(bankMoney);
		
		Money playerMoney = new Money(new BigDecimal(1000));
		Money playerMoney1 = new Money(new BigDecimal(1000));
		
		Player player = new Player("1", playerMoney);
		Player player1 = new Player("2", playerMoney1);
		
		Player[] players = {player,player1};
		
		Board board = new Board();
		
		startGame(board, players,bank);
	}

	private static void startGame(Board board, Player[] players,Bank bank) {
		int[] dicePl1 = {2,4,4,2,6,2,2,4,2,1};
		int[] dicePl2 = {2,5,4,7,6,5,2,2,3,1};
		
		for(int i=0; i<10; i++) {
			players[0].move(dicePl1[i], board,bank);
			players[1].move(dicePl2[i], board,bank);
		}
		
		System.out.println("player1 money : " + players[0].getMoney().getValue() +" and asset value :" +players[0].getMoney().getAsset());
		
		System.out.println("player2 money : " + players[1].getMoney().getValue()+" and asset value :" +players[1].getMoney().getAsset());
		
		System.out.println("Bank money : " + bank.getMoney().getValue());
	}
}
