package curriculum.C;

import java.util.Random;

public class CPU {
	
	private Random random = new Random();
	
	public int getHand() {
		return random.nextInt(3);
		
	}

}
