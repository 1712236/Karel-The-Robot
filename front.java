import stanford.karel.*;

public class front extends SuperKarel {
	public void run() {
		for (int r = 0; r < 2; r++) {
			while (frontIsClear()) {
				putBeeper();
				move();
			}
			putBeeper();
			turnLeft();
			move();
		}
	}
}