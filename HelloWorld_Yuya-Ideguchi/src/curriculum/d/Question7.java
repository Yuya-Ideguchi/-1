package curriculum.d;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;


class Character{
	String name;
	int hp;
	int at;
	int sp;
	
	public Character(String name, int hp, int at, int sp) {
		this.name = name;
		this.hp = hp;
		this.at = at;
		this.sp = sp;
	}
	
	public boolean isAlive() {
		return hp > 0;
		
	}
	
	public void attack(Character target) {
		target.hp -= this.at;
		if(target.hp < 0) {
			target.hp = 0;
		}
	}
}

public class Question7{
	
	public static Character loadDaemon(String filename) throws IOException {
		String absolutePath = "C:\\Users\\kapch\\git\\-1\\HelloWorld_Yuya-Ideguchi\\src\\curriculum\\d\\" + filename;

	    BufferedReader br = new BufferedReader(new FileReader(absolutePath));
		
		String name = br.readLine();
		int hp = Integer.parseInt(br.readLine());
		int at = Integer.parseInt(br.readLine());
		int sp = Integer.parseInt(br.readLine());
		br.close();
		
		
		return new Character(name, hp, at, sp);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
				Random rand = new Random();		
		
		try {
			System.out.print("プレイヤーの名前を入力してください： ");
			String playerName = scanner.nextLine();
			
			int playerHP = rand.nextInt(41) + 60;
			int playerAT = rand.nextInt(6) + 10;
			int playerSP = rand.nextInt(6) + 5;
			
			Character player =new Character(playerName, playerHP, playerAT, playerSP);
			
			Character daemon = loadDaemon("daemon_status.txt");
			
			BufferedWriter log = new BufferedWriter(new FileWriter("battle_log.txt"));
			
			log.write("=== バトル開始 === \n");
			log.write(player.name + " HP:" + player.hp + " AT: " + player.at + " SP: " + player.sp + "\n");
			log.write(daemon.name + " HP:" + daemon.hp + " AT: " + daemon.at + " SP: " + daemon.sp + "\n");
			
			Character first, second;
			if(player.sp > daemon.sp) {
				first = player;
				second =daemon;
			}else if(player.sp < daemon.sp) {
				first =daemon;
				second = player;
			} else {
				if(rand.nextBoolean()) {
					first = player;
					second = daemon;
				} else {
					first = daemon;
					second = player;
				}
			}
			
			log.write("先攻：" + first.name + "\n\n");
			
			
			int turn = 1;
			while(player.isAlive() && daemon.isAlive()) {
				log.write("【ターン　" + turn + "】\n");
				
				first.attack(second);
				log.write(first.name + "の攻撃！" + second.name + "のHP:　" + second.hp + "\n");
				
				if(!second.isAlive()) break;
				
				second.attack(first);
				log.write(second.name + "の攻撃！ " + first.name + "のHP: " + first.hp + "\n\n");
				
				turn++;
			}
			
			
			log.write("\n=== リザルト ===\n");
			if(player.isAlive()) {
				log.write(player.name + "の勝利！\n");
			} else {
				log.write(daemon.name + "の勝利！\n");
			}
			
			log.close();
			System.out.println("戦闘終了！リザルトは battle_log.txt に出力されました。");
			
			
		}catch(IOException e) {
			System.out.println("ファイル処理中にエラーが発生しました。");
		}
		
		scanner.close();
	}
}