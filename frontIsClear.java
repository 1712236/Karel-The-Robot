import stanford.karel.*;

public class frontIsClear extends SuperKarel {
	public void run() {
		
		while(frontIsClear()){
			
			if(noBeepersPresent()){
				;
			} else {
				putBeeper();
			}
			move();
		}
	}
}