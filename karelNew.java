import stanford.karel.SuperKarel;

public class karelNew extends SuperKarel {
	public void run() {
    for (int k = 0; k < 5; k++) {
		turnLeft();
		for (int r = 0; r < 9; r++) {
			move();
		}
		turnRight();
		move();
		turnRight();
		for (int r = 0; r < 9; r++ ) {
			move();
		}
		turnLeft();
		move();
    }		
 }
}
