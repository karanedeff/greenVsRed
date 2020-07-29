package com.mentormate.devops.greenVsRed.components.sources;

import java.util.Scanner;

import com.mentormate.devops.greenVsRed.components.interfaces.LineSource;

/**
 * Provides lines for use in a Cell
 */
public class ConsoleLineSource implements LineSource{
	
	Scanner input;
	String currentLine = null;
	public ConsoleLineSource(Scanner input) {
		this.input = input;
	}
	@Override
	public String nextLine() {
		currentLine = null;
		if (input.hasNextLine()) {
			currentLine = input.nextLine();
		}
		return currentLine;
	}

}
