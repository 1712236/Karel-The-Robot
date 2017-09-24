import stanford.karel.SuperKarel;

public class putbeeper extends SuperKarel {
	public void run() {
		for (int k = 0; k = 3; k++) {
			while (frontIsClear()) {
				move();
				if (noBeepersPresent()) {
					putBeeper();
				}
				else {
					pickBeeper();
				}
				if (frontIsBlocked()) {
					turnLeft();
					move();
				}
			}
		}

	}
}
