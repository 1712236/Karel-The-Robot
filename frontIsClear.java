import stanford.karel.*;

public class frontIsClear extends SuperKarel {
	public void run() {
		
		while(frontIsClear()){
			move();
			if(beepersPresent()){
				;
			} else {
				putBeeper();
			}
		}
	}
}