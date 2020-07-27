package com.mentormate.devops.greenVsRed.components;

import java.util.AbstractCollection;
import java.util.Iterator;

import com.mentormate.devops.greenVsRed.components.interfaces.CellInput;

public class GameGrid extends AbstractCollection<Boolean>{
	private int x;
	private int y;
	private Boolean[][] grid;
	
	public GameGrid(int x, int y, CellInput cellInput) {
		this.x = x;
		this.y = y;
		grid = new Boolean[x][y];
		
		for (int i = 0; i < this.y; i++) {
			for (int j = 0; j < this.x; j++) {
				grid[j][i] = cellInput.getCell();
			}
		}
	};
	
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return x*y;
	}
	
	public int getMaxX() {
		return this.x;
	}
	
	public int getMaxY() {
		return this.y;
	}

	@Override
	public Iterator<Boolean> iterator() {
		// TODO Auto-generated method stub
		
		GameGridIterator iterator = new GameGridIterator(this);
		return iterator;
	}
	
	public boolean get(int x, int y) {	
		boolean cell;
		if ( (x<0) || (y<0) || (x >= this.x) || (y >= this.y)) {
			cell = false;
		} else {
			cell = grid[y][x];
		}
		return cell;	
	}
	
	
}
