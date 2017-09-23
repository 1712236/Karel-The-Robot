import stanford.karel.SuperKarel;

public class frontIsClear extends SuperKarel {
	public void run() {
		putBeeper();
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