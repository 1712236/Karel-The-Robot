import stanford.karel.*;

public class beeper extends SuperKarel {
	public void run(){
		while(noBeepersPresent() || frontIsBlocked()) {
			move();
		}
	}
}

