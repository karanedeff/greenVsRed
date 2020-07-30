package com.mentormate.devops.greenVsRed.components.sources;

import com.mentormate.devops.greenVsRed.components.interfaces.CellSource;
import com.mentormate.devops.greenVsRed.components.interfaces.LineSource;

/**
 * Provides cell data from a CellSource
 */
public class LineReadingCellSource implements CellSource {
	
	LineSource input;
	String currentLine;
	int currentLinePos;

	/**
	 * Instantiates the class, binding to a LineSource
	 *
	 * @param input LineSource.
	 */
	public LineReadingCellSource(LineSource input) {

		this.input = input;
		prepareNextLine();
	}

	/**
	 * Extracts a cell from a String.
	 * Advances along the string, loads the next line, when it reaches the end
	 * @return boolean state of a cell
	 */
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
