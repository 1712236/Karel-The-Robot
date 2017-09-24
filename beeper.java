import stanford.karel.*;

public class beeper extends SuperKarel {
	public void run() {
		while (frontIsClear() || noBeepersPresent()) {
			move();
			pickBeeper();
			while (frontIsBlocked()) {
				turnLeft();
				
			}
		}
			}
}

