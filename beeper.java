import stanford.karel.*;

public class beeper extends SuperKarel {
	public void run() {
		while (frontIsClear() && noBeepersPresent()) {
			pickBeeper();
			move();
			while (frontIsBlocked()) {
				turnLeft();
				
			}
		}
			}
}

