import stanford.karel.*;

public class beeper extends SuperKarel {
	public void run() {
		while (frontIsClear()) {
			move();
			if (beepersPresent()) {
				pickBeeper();
			}
			else {
				;
			}
			if (frontIsBlocked()) {
				turnLeft();
				move();
				pickBeeper();
				turnLeft();
				turnLeft();
			
				move();
			}
		}
			}
}

