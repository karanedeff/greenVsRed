package com.mentormate.devops.greenVsRed;

import java.util.Scanner;

import com.mentormate.devops.greenVsRed.components.sources.ConsoleLineSource;
import com.mentormate.devops.greenVsRed.components.GameGrid;
import com.mentormate.devops.greenVsRed.components.GameGridIterator;
import com.mentormate.devops.greenVsRed.components.sources.DefaultGenerationRules;
import com.mentormate.devops.greenVsRed.components.sources.IteratorCellSource;
import com.mentormate.devops.greenVsRed.components.sources.LineReadingCellSource;

/**
 * Main entry point for the green vs red game.
 * Puts all the other classes together and contains the logic for tracking the targeted cell
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	int x;
    	int y;
    	Scanner consoleInput = new Scanner(System.in);
    	
    	String line = consoleInput.nextLine();
    	x = Integer.parseInt(line.split(", ")[0]);
    	y = Integer.parseInt(line.split(", ")[1]);

    	LineReadingCellSource cellsFromConsole = new LineReadingCellSource(new ConsoleLineSource(consoleInput));
    	GameGrid currentGen = new GameGrid(x,y, cellsFromConsole);
    	
    	line = consoleInput.nextLine();    	
    	int trackX = Integer.parseInt(line.split(", ")[0]);
    	int trackY = Integer.parseInt(line.split(", ")[1]);
    	int generations = Integer.parseInt(line.split(", ")[2]);
    	int trackTimesGreen = 0;
    	
    	for (int i = 0; i < generations; i++) {
    		if (currentGen.get(trackX, trackY)) {
				trackTimesGreen++;
			}
			currentGen = new GameGrid(x, y, new IteratorCellSource(
						(GameGridIterator) currentGen.iterator(),
						new DefaultGenerationRules()
						)
					);
		}
		if (currentGen.get(trackX, trackY)) {
			trackTimesGreen++;
		}
    	System.out.println(trackTimesGreen);
    
    }

}
