import stanford.karel.*;

public class beeper extends SuperKarel {
	public void run() {
		while (frontIsClear() && (frontIsBlocked())) {
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
				
			
				move();
				
				
			}
		}
			}
}

