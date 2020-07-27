package com.mentormate.devops.greenVsRed.components;

import java.util.Iterator;

public class GameGridIterator implements Iterator<Boolean> {
	private GameGrid grid;
	int currentX;
	int currentY;
	
	public GameGridIterator(GameGrid grid) {
		this.grid = grid;
		this.currentX = 0;
		this.currentY = 0;
		// TODO Auto-generated constructor stub
		
	}
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if (currentX < grid.getMaxX() || currentY < grid.getMaxY()) {
			return true;
		}
		return false;
	}
	
	public Boolean getCurrentCell() {
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
	public Boolean getUpperLeft() {
		return grid.get(currentX - 1, currentY - 1);
	}
	public Boolean getUpper() {
		return grid.get(currentX - 1, currentY);
	}
	public Boolean getUpperRight() {
		return grid.get(currentX - 1, currentY + 1);
	}
	public Boolean getLeft() {
		return grid.get(currentX, currentY - 1);
	}
	public Boolean getRight() {
		return grid.get(currentX, currentY + 1);
	}
	public Boolean getLowerLeft() {
		return grid.get(currentX + 1, currentY - 1);
	}
	public Boolean getLower() {
		return grid.get(currentX + 1, currentY);
	}
	public Boolean getLowerRight() {
		return grid.get(currentX + 1, currentY + 1);
	}


}
