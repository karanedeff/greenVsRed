package com.mentormate.devops.greenVsRed;

import com.mentormate.devops.greenVsRed.components.CellInput;
import com.mentormate.devops.greenVsRed.components.GameGrid;
import com.mentormate.devops.greenVsRed.components.LineReadingCellInput;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	CellInput fromLines = new LineReadingCellInput();
    	int x,y;
    	x = 0;
    	y = 0;
    	GameGrid game = new GameGrid(x,y, fromLines);
    	
        System.out.println( "Hello World!" );
    }

}
