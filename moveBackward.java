import stanford.karel.*;

public class moveBackward extends SuperKarel {
	public void run() {
		moveBackward();
	}
	
	private void moveBackward() {
		move();
		putBeeper();
		turnAround();
		move();
		turnAround();
	}
}
