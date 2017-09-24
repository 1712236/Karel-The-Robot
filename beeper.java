import stanford.karel.*;

public class beeper extends SuperKarel {
	public void run() {
		while (frontIsClear()) {
			move();
			while (frontIsBlocked()) {
				turnLeft();
				move();
				turnRight();
			}
		}
			}
}

