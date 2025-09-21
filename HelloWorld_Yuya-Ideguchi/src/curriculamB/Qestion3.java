package curriculamB;

import java.util.Scanner;

public class Qestion3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

/*****************************
 *  
 *   【概要】Qes1 for文を使って1から10までの数字を1つずつ表示
 *  
 *****************************/	
		
		for(int i = 1; i <=10; i++){
			System.out.println(i);
		}
		
/*****************************
 *  
 *   【概要】Qes2 for文を使って2から20までの偶数を1つずつ表示
 *  
 *****************************/	
		
		for(int w = 2; w <=20; w += 2) {
				System.out.println(w);
		}
		
/*****************************
 *  
 *   【概要】Qes3 for文を使って10から1までカウントダウンして表示
 *  
 *****************************/	
		
		for(int u = 10; u >= 1; u--) {
			System.out.println(u);
		}
		
/*****************************
 *  
 *   【概要】Qes4 for文を使って1から100までの合計を表示
 *  
 *****************************/	
		
		int sum = 0;
		
		
		for(int i = 1; i <= 100; i++) {
			sum += i;
		}
		
		System.out.println(sum);
		
		
/*****************************
 *  
 *   【概要】Qes5 for文を使って以下のような三角形を出力
 *   　　　     →*
 *                **
 *                ***
 *                ****
 *                *****
 *  
 *****************************/	
		
		String stars = "";
		
		for(int i = 1; i <=5; i++) {
			stars += "*";
			System.out.println(stars);
		}
		
/*****************************
 *  
 *   【概要】Qes6 while文を使って1から10まで1つずつ表示
 *  
 *****************************/	
		
		int count = 1;
		
		while (count <= 10) {
			System.out.println(count);
			count++;
		}
		
		
/*****************************
 *  
 *   【概要】Qes7 while分を使って2から20までの偶数を1つずつ表示
 *  
 *****************************/	
		
		int count2 = 1;
		
		while(count2 <= 20 ) {
			if(count2 % 2 == 0) {
				System.out.println(count2);
			}
			count2++;
		}
		
/*****************************
 *  
 *   【概要】Qes8 while分を使って10から1を表示
 *  
 *****************************/	
		
		int count3 = 10;
		
		while(count3 >= 1 ){
			System.out.println(count3);
			count3--;	
		}
		
		
/*****************************
 *  
 *   【概要】Qes9 while分を使って1から100までの合計を表示
 *  
 *****************************/	
		
		int sum1 = 0;
		int count4 = 1;
		
		while(count4 <= 100) {
			sum1 += count4;
			count4++;
		}
		
		System.out.println(sum1);
		
		
/*****************************
 *  
 *   【概要】Qes10 ユーザーから数値を入力してもらう
 *   　　　     →入力が０になるまで何度でも入力を受け付ける
 *   　　　　　 →0が入力されたら「終了しました」と表示
 *              →※Scannerを使用、While分を使用
 *              
 *****************************/	

		Scanner scanner = new Scanner(System.in);
		int input = 0;
		
		while(input != 0) {
			System.out.println("数値を入力してください（0で終了）: ");
			input = scanner.nextInt();
		}
		
		System.out.println("終了しました");
		scanner.close();
		
		
		
/*****************************
 *  
 *   【概要】Qes11 for文を使用して九九を出力　(途中)
 *  
 *****************************/	
		
		for (int i = 1; i <= 9; i++) {
            String line = "";
            for (int j = 1; j <= 9; j++) {
                
                line += String.format("%02d * %02d = %02d  ", i, j, i * j);

                
                if (j % 3 == 0 && j != 9) {
                    line += "||  ";
                }
            }
            System.out.println(line);
        }

		
/*****************************
 *  
 *   【概要】Qes8 12
 *   　　　     →
 *  
 *****************************/	
		
		
		
		
		
	}

}
