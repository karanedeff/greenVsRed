package com.mentormate.devops.greenVsRed.components.cellSources;

import com.mentormate.devops.greenVsRed.components.GameGridIterator;
import com.mentormate.devops.greenVsRed.components.interfaces.GenerationRules;

public class DefaultGenerationRules implements GenerationRules{
	@Override
	public boolean isAlive(GameGridIterator iterator) {
		// TODO Auto-generated method stub
			int neighboors = countNeighboors(iterator);
			if (!iterator.getCurrentCell() && (neighboors == 3 || neighboors == 6)) {
				return true;
			}else if (iterator.getCurrentCell() && (neighboors == 2 || neighboors == 3 || neighboors == 6)) {
				return true;
			}else {
				return false;
			}
		
	}
	
	private int countNeighboors(GameGridIterator iterator){
		int neigboors = 0;
		if (iterator.getUpperLeft()) neigboors++;
		if (iterator.getUpper()) neigboors++;
		if (iterator.getUpperRight()) neigboors++;
		if (iterator.getLeft()) neigboors++;
		if (iterator.getRight()) neigboors++;
		if (iterator.getLowerLeft()) neigboors++;
		if (iterator.getLower()) neigboors++;
		if (iterator.getLowerRight()) neigboors++;
		return neigboors;
	}
}
