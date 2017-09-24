import stanford.karel.SuperKarel;

public class try1 extends SuperKarel {
	public void run() {
		begin();
	}
	
	
	private void west() {
		turnRight();
		move();
		turnRight();
		if (beepersPresent()) {
			pickBeeper();
		}
		for (int k = 0; k < 9; k++) {
			move();
			if (beepersPresent()) {
				pickBeeper();
			}
		}
	}
	
	private void east() {
		turnLeft();
		move();
		turnLeft();
		for (int k = 0; k < 9; k++) {
			move();
			if (beepersPresent()) {
				pickBeeper();
			}
		}
	}
	private void begin() {
		for (int k = 0; k < 9; k++) {
			move();
			if (beepersPresent()) {
				pickBeeper();
			}
		}
	}
}