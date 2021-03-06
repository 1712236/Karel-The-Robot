/*
 * File: BlankKarel.java
 * ---------------------
 * This is a blank Karel project that you can change at will. Remember, if you change
 * the class name, you'll need to change the filename so that it matches.
 * If you want to make the program load with a specific world, make the
 * world file named the same as this class. For example, when this program is
 * run, it would try to load BlankKarel.w if there is one.
 */

import stanford.karel.*;

public class BlankKarel extends SuperKarel {
	public void run() {
    for (int k = 0; k < 5; k++) {
		turnLeft();
		for (int r = 0; r < 9; r++) {
			move();
		}
		turnRight();
		move();
		turnRight();
		for (int r = 0; r < 9; r++ ) {
			move();
		}
		turnLeft();
		move();	
    }		
 }
}
