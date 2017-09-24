import stanford.karel.*;

public class beeper extends SuperKarel {
	public void run() {
		while (frontIsClear() && beepersPresent()) {
			pickBeeper();
			move();
			while (frontIsBlocked()) {
				turnLeft();
				
			}
		}
			}
}

