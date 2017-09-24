import stanford.karel.*;

public class frontIsClear extends SuperKarel {
	public void run() {
		
		while(frontIsClear()){
			
			if(noBeepersPresent()){
				putBeeper();
			} else {
				;
			}
			move();
		}
	}
}