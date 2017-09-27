import stanford.karel.*;

public class moveBackward extends SuperKarel {
	public void run() {
		moveBackward();
	}
	
	private void moveBackward() {
		move();
		turnAround();
		turnAround();
	}
}
