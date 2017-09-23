import stanford.karel.*;

public class frontIsBlocked extends SuperKarel {
	public void run() {
		while(frontIsBlocked()){
			turnLeft();
		}
	}
}