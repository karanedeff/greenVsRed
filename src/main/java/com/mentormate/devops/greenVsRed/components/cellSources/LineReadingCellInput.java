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
		checkLineEnd();
		boolean cell;
		char currentChar = currentLine.charAt(currentLinePos);
		cell = currentChar == '1';
		currentLinePos++;
		return cell;
	}

	private void checkLineEnd() {
		if (currentLinePos >= currentLine.length()) {
			prepareNextLine();
		}
	}

	private void prepareNextLine() {
		this.currentLine = input.nextLine();
		this.currentLinePos = 0;
	}

}
