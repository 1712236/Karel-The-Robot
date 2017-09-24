import stanford.karel.*;

public class beeper extends SuperKarel {
	public void run(){
		while(frontIsBlocked()){
			move();
		}
	}
}

