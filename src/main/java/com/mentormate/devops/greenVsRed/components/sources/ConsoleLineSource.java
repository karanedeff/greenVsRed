package com.mentormate.devops.greenVsRed.components.sources;

import java.util.Scanner;

import com.mentormate.devops.greenVsRed.components.interfaces.LineSource;

/**
 * Provides lines for use in a CellSource.
 *
 */
public class ConsoleLineSource implements LineSource{
	
	Scanner input;
	String currentLine = null;

	/**
	 * Binds to a Scanner
	 * @param input a Scanner instance
	 */
	public ConsoleLineSource(Scanner input) {
		this.input = input;
	}

	/**
	 * Reads a line from console
	 * @return String, line from console
	 */
	@Override
	public String nextLine() {
		currentLine = null;
		if (input.hasNextLine()) {
			currentLine = input.nextLine();
		}
		return currentLine;
	}

}
