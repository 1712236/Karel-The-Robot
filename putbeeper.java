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
			if (frontIsBlocked()) {
				turnLeft();
				move();
			}
		}
	}
}




if (facingEast()) {
	east();
}
else {
	west();
}
