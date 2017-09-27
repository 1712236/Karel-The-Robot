import stanford.karel.*;

public class rakib extends SuperKarel {
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