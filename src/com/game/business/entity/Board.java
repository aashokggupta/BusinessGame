package com.game.business.entity;

public class Board {
	private Cell[] cells = new Cell[40];
//		private Cell[] cells = {new JailCell(),new SilverHotelCell(),new LotteryCell(), new GoldHotelCell(),new EmptyCell(),new LotteryCell(),new PlatinumHotelCell(),new LotteryCell(),new SilverHotelCell(),new JailCell()};
		
		public Board() {
			for(int i = 0; i<cells.length; i++) {
				if(i==2 || i==9 || i==20 || i== 27) {
					cells[i] = new SilverHotelCell();
				} 
				else if(i == 6 || i== 17 || i==24 || i==32) {
					cells[i] = new JailCell();
				} else if(i==3 || i==15 ||i==21 || i==29) {
					cells[i] = new LotteryCell();
				} else {
					cells[i] = new EmptyCell();
				}
				
			}
		}
		
		
		public Cell[] getCells() {
			return cells;
		}
		public void setCells(Cell[] cells) {
			this.cells = cells;
		}
}
