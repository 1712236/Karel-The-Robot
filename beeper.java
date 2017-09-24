import stanford.karel.*;

public class beeper extends SuperKarel {
	public void run(){
		if(frontIsClear() && beepersPresent()) {
			move();
		}
		else {
			;
		}
	}
}

