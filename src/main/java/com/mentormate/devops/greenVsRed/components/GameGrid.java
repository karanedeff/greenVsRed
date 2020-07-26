package com.mentormate.devops.greenVsRed.components;

import java.util.AbstractCollection;
import java.util.Iterator;

public class GameGrid extends AbstractCollection<boolean[]>{
	int x;
	int y;
	private boolean[][] grid;
	
	public GameGrid(int x, int y, CellInput cells) {
		this.x = x;
		this.y = y;
		
		for (int i = 0; i < this.x; i++) {
			for (int j = 0; j < this.y; j++) {
				grid[i][j] = cells.getCell();
			}
		}
	};
	
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return x*y;
	}

	@Override
	public Iterator<boolean[]> iterator() {
		// TODO Auto-generated method stub
		
		GameGridIterator iterator = new GameGridIterator(this);
		return iterator;
	}
	
	public boolean get(int x, int y) {	
		boolean cell;
		if ( (x<0) || (y<0) || (x > this.x) || (y > this.y)) {
			cell = false;
		} else {
			cell = grid[x][y];
		}
		return cell;	
	}
	
	
}
