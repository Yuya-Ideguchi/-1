package curriculum.C;

import java.util.Scanner;

public class Player {
	
	private Scanner scanner;
	
	 public Player(Scanner scanner) {
	        this.scanner = scanner;
	    }
			
	public int getHand() {
		int hand;
		
		while(true) {
			System.out.print("グー(0),チョキ(1),パー(2)　を入力：");
			
			if(!scanner.hasNextInt()) {
				scanner.next();
				System.out.println("数字を入力してください");
				continue;
				
			}
			
			hand = scanner.nextInt();
			
			
			if(hand >= 0 && hand <= 2) {
				break;
			}else {
				System.out.print("0～2の数字を入力してください");
				
			}
		}
		
		return hand;
		
	}

}
