import stanford.karel.SuperKarel;

public class frontIsClear extends SuperKarel {
	public void run() {
		putBeeper();
		while(frontIsClear()){
			move();
			putBeeper();
		}
	}
}