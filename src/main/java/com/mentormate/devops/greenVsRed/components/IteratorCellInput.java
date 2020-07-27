package com.mentormate.devops.greenVsRed.components;

import com.mentormate.devops.greenVsRed.components.interfaces.CellInput;
import com.mentormate.devops.greenVsRed.components.interfaces.GenerationRules;

public class IteratorCellInput implements CellInput{
	private GameGridIterator iterator;
	private GenerationRules rules;
	
	public IteratorCellInput(GameGridIterator iterator, GenerationRules rules) {
		this.iterator = iterator;
		
	}
			
	@Override
	public boolean getCell() {
		
		
		return false;
	}
	
	
	


}
