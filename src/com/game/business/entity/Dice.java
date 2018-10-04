package com.game.business.entity;

import java.util.Random;

public class Dice {
	private int number;

	public int getNumber() {
		Random random= new Random();
//		return (1 + random.nextInt(6));
		return 2;
	}

	public void setNumber(int number) {
		this.number = number;  
	}
}
