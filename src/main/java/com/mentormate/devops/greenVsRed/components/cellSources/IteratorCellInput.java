package com.mentormate.devops.greenVsRed.components.cellSources;

import com.mentormate.devops.greenVsRed.components.GameGridIterator;
import com.mentormate.devops.greenVsRed.components.interfaces.CellInput;
import com.mentormate.devops.greenVsRed.components.interfaces.GenerationRules;

public class IteratorCellInput implements CellInput{
	private GameGridIterator iterator;
	private GenerationRules rules;
	
	public IteratorCellInput(GameGridIterator iterator, GenerationRules rules) {
		this.iterator = iterator;
		this.rules = rules;
	}
			
	@Override
	public boolean getCell() {
		boolean cell = rules.isAlive(iterator);
		iterator.next();
		return cell;
	}
}
