import stanford.karel.SuperKarel;

public class putbeeper extends SuperKarel {
	public void run() {
		while (frontIsClear()) {
			move();
			if (noBeepersPresent()) {
				putBeeper();
			}
			else {
				pickBeeper();
			}
		}
	}
}
