import stanford.karel.*;

public class fc extends SuperKarel {
	public void run() {
		while (frontIsClear()) {
			putBeepers();
			move();
		}
	}
}