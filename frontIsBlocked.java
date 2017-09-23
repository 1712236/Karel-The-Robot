import stanford.karel.*;

public class frontIsBlocked extends SuperKarel {
	public void run() {
		putBeeper();
		while(frontIsClear()){
			turnLeft();
		}
	}
}