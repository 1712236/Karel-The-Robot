import stanford.karel.*;

public class wall extends SuperKarel {
	public void run() {
		while (frontIsClear()) {
			move();
			if (frontIsBlocked()) {
				turnLeft();
				move();
			}
		}
	}
}
