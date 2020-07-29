package com.mentormate.devops.greenVsRed.components;

import java.util.Scanner;

import com.mentormate.devops.greenVsRed.components.interfaces.LineSource;

public class ConsoleLineInput implements LineSource{
	
	Scanner input;
	String currentLine = null;
	public ConsoleLineInput(Scanner input) {
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
