package curriculum.C;

public class Question6 {

	public static void main(String[] args) {
		
		Player player = new Player();
		CPU cpu =new CPU();
		
		while(true) {
			int playerHand = player.getHand();
			int cpuHand = cpu.getHand();
			
			System.out.println("あなたの手：" + handToString(playerHand));
			System.out.println("CPUの手：" + handToString(cpuHand));
			
			if(isWin(playerHand, cpuHand)) {
				System.out.println("あなたの勝ち!");
				break;
			}else if(playerHand == cpuHand) {
				System.out.println("あいこです。もう一度！");
			}else {
				System.out.println("あなたの負けです。もう一度！");
			}
		}
	}
	
	
	private static String handToString(int hand) {
		switch(hand) {
		    case 0: return "グー";
		    case 1: return "チョキ";
		    case 2: return "パー";
		    default: return "不正な手";
		}
	}
	
	private static boolean isWin(int player, int cpu) {
		  return(player == 0 && cpu == 1) ||
				(player == 1 && cpu == 2) ||
				(player == 2 && cpu == 0);
	}
	
	
}
