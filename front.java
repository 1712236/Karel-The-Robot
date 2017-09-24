import stanford.karel.*;

public class front extends SuperKarel {
	public void run() {
		for (int r = 0; r < 4; r++) {
			while (frontIsClear()) {
				putBeeper();
				move();
			}
			while (noBeepersPresent()) {
				putBeeper();
			}
			putBeeper();
			turnLeft();
			move();
		}
	}
}