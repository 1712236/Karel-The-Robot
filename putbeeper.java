import stanford.karel.SuperKarel;

public class putbeeper extends SuperKarel {
	public void run() {
		while (frontIsClear()) {
			move();
			if (beepersPresent()) {
				pickBeeper();
			}
			else {
				putBeeper();
			}
			if (frontIsBlocked()) {
				turnLeft();
				move();
			}
		}
	}
}
