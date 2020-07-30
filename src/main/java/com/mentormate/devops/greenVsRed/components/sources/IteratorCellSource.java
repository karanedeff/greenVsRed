package com.mentormate.devops.greenVsRed.components.sources;

import com.mentormate.devops.greenVsRed.components.GameGridIterator;
import com.mentormate.devops.greenVsRed.components.interfaces.CellSource;
import com.mentormate.devops.greenVsRed.components.interfaces.GenerationRules;

/**
 * Uses GenerationRules and GameGridIterator to calculate the
 * next generation of cell data.
 */
public class IteratorCellSource implements CellSource {
	private GameGridIterator iterator;
	private GenerationRules rules;

	/**
	 * Instantiates the class by binding to an iterator and GenerationRules classes
	 * @param iterator a GameGridIterator
	 * @param rules GenerationRules class
	 */
	public IteratorCellSource(GameGridIterator iterator, GenerationRules rules) {
		this.iterator = iterator;
		this.rules = rules;
	}

	/**
	 * Requests from GenerationRules, which reads cell and neighbor data from the GameGridIterator
 	 * @return the state of the cell in the next generation
	 */
	@Override
	public boolean getCell() {
		boolean cell = rules.isAlive(iterator);
		iterator.next();
		return cell;
	}
}
