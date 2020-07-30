package com.mentormate.devops.greenVsRed.components.sources;

import com.mentormate.devops.greenVsRed.components.GameGridIterator;
import com.mentormate.devops.greenVsRed.components.interfaces.GenerationRules;

/**
 * Provides a method for calculating the next generation of a cell.
 */
public class DefaultGenerationRules implements GenerationRules{
	/**
	 * Calculates the next generation of a cell
	 *
	 * @param iterator pointing to the cell to be calculated
	 * @return the next generation
	 */
	@Override
	public boolean isAlive(GameGridIterator iterator) {
			int neighbors = countNeighbors(iterator);
			boolean isAlive;
			if (!iterator.getCurrentCell() && (neighbors == 3 || neighbors == 6)) isAlive = true;
			else isAlive = iterator.getCurrentCell() && (neighbors == 2 || neighbors == 3 || neighbors == 6);
			return isAlive;
		
	}
	
	private int countNeighbors(GameGridIterator iterator){
		int neighbors = 0;
		if (iterator.getUpperLeft()) neighbors++;
		if (iterator.getUpper()) neighbors++;
		if (iterator.getUpperRight()) neighbors++;
		if (iterator.getLeft()) neighbors++;
		if (iterator.getRight()) neighbors++;
		if (iterator.getLowerLeft()) neighbors++;
		if (iterator.getLower()) neighbors++;
		if (iterator.getLowerRight()) neighbors++;
		return neighbors;
	}
}
