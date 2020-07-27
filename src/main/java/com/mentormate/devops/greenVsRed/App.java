package com.mentormate.devops.greenVsRed;

import com.mentormate.devops.greenVsRed.components.ConsoleLineInput;
import com.mentormate.devops.greenVsRed.components.GameGrid;
import com.mentormate.devops.greenVsRed.components.LineReadingCellInput;
import com.mentormate.devops.greenVsRed.components.interfaces.CellInput;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	CellInput fromConsole = new LineReadingCellInput(new ConsoleLineInput());
    	int x,y;
    	x = 0;
    	y = 0;
    	GameGrid currentGen = new GameGrid(x,y, fromConsole);
    	
        System.out.println( "Hello World!" );
    }

}
