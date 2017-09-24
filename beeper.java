import stanford.karel.*;

public class beeper extends SuperKarel {
	public void run() {
		while (frontIsClear()) {
			move();
			pickBeeper();
			while (frontIsBlocked()) {
				turnLeft();
				
			}
		}
			}
}

