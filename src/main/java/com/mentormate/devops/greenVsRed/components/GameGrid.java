package com.mentormate.devops.greenVsRed.components;

import java.util.AbstractCollection;
import java.util.Iterator;

import com.mentormate.devops.greenVsRed.components.interfaces.CellInput;

public class GameGrid extends AbstractCollection<Boolean>{
	private int maxX;
	private int maxY;
	private Boolean[][] grid;
	
	public GameGrid(int maxX, int maxY, CellInput cellInput) {
		this.maxX = maxX;
		this.maxY = maxY;
		grid = new Boolean[maxX][maxY];
		
		for (int i = 0; i < this.maxY; i++) {
			for (int j = 0; j < this.maxX; j++) {
				grid[j][i] = cellInput.getCell();
			}
		}
	}
	
	@Override
	public int size() {
		return maxX * maxY;
	}
	
	public int getMaxX() {
		return this.maxX;
	}
	
	public int getMaxY() {
		return this.maxY;
	}

	@Override
	public Iterator<Boolean> iterator() {
		return new GameGridIterator(this);
	}
	
	public boolean get(int x, int y) {	
		boolean cell;
		if ( (x<0) || (y<0) || (x >= this.maxX) || (y >= this.maxY)) {
			cell = false;
		} else {
			cell = grid[x][y];
		}
		return cell;	
	}
	
	
}
