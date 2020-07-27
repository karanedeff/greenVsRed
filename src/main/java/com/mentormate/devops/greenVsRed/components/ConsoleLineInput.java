package com.mentormate.devops.greenVsRed.components;

import java.util.Scanner;

import com.mentormate.devops.greenVsRed.components.interfaces.LineSource;

public class ConsoleLineInput implements LineSource{
	
	Scanner input = new Scanner(System.in);
	String currentLine = null;
	@Override
	public String nextLine() {
		currentLine = null;
		if (input.hasNextLine()) {
			currentLine = input.nextLine();
		}
		return currentLine;
	}

}
