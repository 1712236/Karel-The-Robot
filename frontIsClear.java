import stanford.karel.*;

public class frontIsClear extends SuperKarel {
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