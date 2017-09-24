import stanford.karel.*;

public class frontIsClear extends SuperKarel {
	public void run() {
		
		while(frontIsClear()){
			
			if(beepersPresent()){
				;
			} else {
				putBeeper();
			}
			move();
			while (frontIsBlocked()) {
				putBeeper();
			}
		}
	}
}