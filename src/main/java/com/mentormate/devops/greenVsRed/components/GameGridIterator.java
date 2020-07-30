package com.mentormate.devops.greenVsRed.components;

import java.util.Iterator;
import java.lang.Boolean;

/**
 * Iterates sequentially over a GameGrid
 * Provides methods for checking the the neighbors of the current cell.
 */
public class GameGridIterator implements Iterator<Boolean> {
	private GameGrid grid;
	int currentX;
	int currentY;

	/**
	 * Binds the iterator to a GameGrid instance
	 * @param grid an instance of GameGrid.
	 */
	public GameGridIterator(GameGrid grid) {
		this.grid = grid;
		this.currentX = 0;
		this.currentY = 0;
		
	}

	/**
	 * Checks if the iterator can advance
	 *
	 * @return boolean
	 */
	@Override
	public boolean hasNext() {
		return currentX < grid.getMaxX() || currentY < grid.getMaxY();
	}

	/**
	 * Returns the state of the cell the iterator is currently at.
	 *
	 * @return cell state in boolean
	 */
	public boolean getCurrentCell() {
		return grid.get(currentX, currentY);
		
	}

	/**
	 * Returns the x coordinate of the current cell
	 *
	 * @return int value of 0 counted x
	 */
	public int getX() {
		return currentX;
	}
	/**
	 * Returns the y coordinate of the current cell
	 *
	 * @return int value of 0 counted y
	 */
	public int getY() {
		return currentY;
	}

	/**
	 * Advances the iterator to the next cell.
	 *
	 * @return the boolean cell value of the next cell
	 * @throws ArrayIndexOutOfBoundsException if called while hasNext() == false
	 */
	@Override
	public Boolean next() throws ArrayIndexOutOfBoundsException{
		int nextX = currentX + 1;
		if (nextX < grid.getMaxX()) {
			currentX = nextX;
		} else {
			currentX = 0;
			int nextY = currentY + 1;
			if (nextY < grid.getMaxY()) {
				currentY = nextY;
			}
		}
		return getCurrentCell();
	}

	/**
	 * Returns the value of the cell to the upper left of the current one
	 *
	 * @return boolean
	 */
	public boolean getUpperLeft() {
		return grid.get(currentX - 1, currentY - 1);
	}
	/**
	 * Returns the value of the cell above the current one
	 *
	 * @return boolean
	 */
	public boolean getUpper() {
		return grid.get(currentX - 1, currentY);
	}
	/**
	 * Returns the value of the cell to the upper right of the current one
	 *
	 * @return boolean
	 */
	public boolean getUpperRight() {
		return grid.get(currentX - 1, currentY + 1);
	}
	/**
	 * Returns the value of the cell to the left of the current one
	 *
	 * @return boolean
	 */
	public boolean getLeft() {
		return grid.get(currentX, currentY - 1);
	}
	/**
	 * Returns the value of the cell to the right of the current one
	 *
	 * @return boolean
	 */
	public boolean getRight() {
		return grid.get(currentX, currentY + 1);
	}
	/**
	 * Returns the value of the cell to the lower left of the current one
	 *
	 * @return boolean
	 */
	public boolean getLowerLeft() {
		return grid.get(currentX + 1, currentY - 1);
	}
	/**
	 * Returns the value of the cell below the current one
	 *
	 * @return boolean
	 */
	public boolean getLower() {
		return grid.get(currentX + 1, currentY);
	}
	/**
	 * Returns the value of the cell to the lower right of the current one
	 *
	 * @return boolean
	 */
	public boolean getLowerRight() {
		return grid.get(currentX + 1, currentY + 1);
	}


}
