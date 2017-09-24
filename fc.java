import stanford.karel.*;

public class fc extends SuperKarel {
	public void run() {
		move();
		while(frontIsClear()){
			if(beepersPresent()){
				;
			} else {
				putBeeper();
			}
			putBeeper();
		}
	}
}