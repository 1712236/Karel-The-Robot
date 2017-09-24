import stanford.karel.*;

public class beeper extends SuperKarel {
	public void run() {
		for (int i = 0; i < 0; i++) {
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
					move();
				}
			}
		}

			}
}

