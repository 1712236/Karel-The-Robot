import stanford.karel.*;

public class beeper extends SuperKarel {
	public void run() {
		while (frontIsClear() && beepersPresent()) {
			move();
			
			while (frontIsBlocked()) {
				turnLeft();
				
			}
		}
			}
}

