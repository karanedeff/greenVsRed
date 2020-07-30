package com.mentormate.devops.greenVsRed.components;

import java.util.AbstractCollection;
import java.util.Iterator;

import com.mentormate.devops.greenVsRed.components.interfaces.CellSource;

/**
 * Stores game data in a 2d Boolean array, providing access methods and an iterator.
 */

public class GameGrid extends AbstractCollection<Boolean>{
	private int maxX;
	private int maxY;
	private Boolean[][] grid;

	/**
	 * Default constructor.
	 * Uses a nested loop to request from a cellInput class
	 * to populate the grid.
	 * @param maxX
	 * @param maxY
	 * @param cellSource Provides cell data one at a time.
	 */
	public GameGrid(int maxX, int maxY, CellSource cellSource) {
		this.maxX = maxX;
		this.maxY = maxY;
		grid = new Boolean[maxX][maxY];
		
		for (int i = 0; i < this.maxY; i++) {
			for (int j = 0; j < this.maxX; j++) {
				grid[j][i] = cellSource.getCell();
			}
		}
	}

	/**
	 * Returns the total number of cells
	 *
	 * @return total number of cells
	 */
	@Override
	public int size() {
		return maxX * maxY;
	}

	/**
	 * Returns the number of x-axis cells.
	 *
	 * @return
	 */
	public int getMaxX() {
		return this.maxX;
	}

	/**
	 * Returns the number of y-axis cells.
	 *
	 * @return
	 */
	public int getMaxY() {
		return this.maxY;
	}

	/**
	 * Provides an iterator.
	 * Traverses the grid sequentially along the x-axis first.
	 *
	 * @see GameGridIterator
	 * @return Iterator<Boolean>
	 */
	@Override
	public Iterator<Boolean> iterator() {
		return new GameGridIterator(this);
	}

	/**
	 * Returns the current state of a cell located at (x, y)
	 * @param x
	 * @param y
	 * @return boolean state of the cell
	 */
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
