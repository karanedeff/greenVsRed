package com.mentormate.devops.greenVsRed.components;

import java.util.Iterator;
import java.lang.Boolean;

public class GameGridIterator implements Iterator<Boolean> {
	private GameGrid grid;
	int currentX;
	int currentY;
	
	public GameGridIterator(GameGrid grid) {
		this.grid = grid;
		this.currentX = 0;
		this.currentY = 0;
		
	}
	@Override
	public boolean hasNext() {
		return currentX < grid.getMaxX() || currentY < grid.getMaxY();
	}
	
	public boolean getCurrentCell() {
		return grid.get(currentX, currentY);
		
	}
	
	public int getX() {
		return currentX;
	}
	
	public int getY() {
		return currentY;
	}
	
	@Override
	public Boolean next() {
		int nextX = currentX + 1;
		Boolean nextCell = null;
		
		if (nextX < grid.getMaxX()) {
			currentX = nextX;
			nextCell = getCurrentCell();
		} else {
			currentX = 0;
			int nextY = currentY + 1;
			if (nextY < grid.getMaxY()) {
				currentY = nextY;
				nextCell = getCurrentCell();
			}
		}	
		return nextCell;
	}
	public boolean getUpperLeft() {
		return grid.get(currentX - 1, currentY - 1);
	}
	public boolean getUpper() {
		return grid.get(currentX - 1, currentY);
	}
	public boolean getUpperRight() {
		return grid.get(currentX - 1, currentY + 1);
	}
	public boolean getLeft() {
		return grid.get(currentX, currentY - 1);
	}
	public boolean getRight() {
		return grid.get(currentX, currentY + 1);
	}
	public boolean getLowerLeft() {
		return grid.get(currentX + 1, currentY - 1);
	}
	public boolean getLower() {
		return grid.get(currentX + 1, currentY);
	}
	public boolean getLowerRight() {
		return grid.get(currentX + 1, currentY + 1);
	}


}
