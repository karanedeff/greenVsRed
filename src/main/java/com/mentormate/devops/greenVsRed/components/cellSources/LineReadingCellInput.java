package com.mentormate.devops.greenVsRed.components.cellSources;

import com.mentormate.devops.greenVsRed.components.interfaces.CellInput;
import com.mentormate.devops.greenVsRed.components.interfaces.LineSource;

public class LineReadingCellInput implements CellInput{
	
	LineSource input;
	String currentLine;
	int currentLinePos;
	
	public LineReadingCellInput(LineSource input) {

		this.input = input;
		prepareNextLine();
	}
	
	@Override
	public boolean getCell() {
		boolean cell;
		if (currentLinePos >= currentLine.length()) {
			prepareNextLine();
		}
		cell = Boolean.parseBoolean(
				String.valueOf(
						currentLine.charAt(currentLinePos)));
		currentLinePos++;
		return cell;
	}
	
	private void prepareNextLine() {
		currentLine = input.nextLine();
		this.currentLinePos = 0;
	}

}
