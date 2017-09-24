import stanford.karel.*;

public class front extends SuperKarel {
	public void run() {
		while (frontIsClear()) {
			putBeeper();
			move();
		}
		turnLeft();
	}
}