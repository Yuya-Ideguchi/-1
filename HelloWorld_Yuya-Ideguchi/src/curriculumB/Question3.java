package curriculumB;

import java.util.Random;
import java.util.Scanner;

public class Question3 {

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
        int input;

        do {
            System.out.print("数値を入力してください（0で終了）: ");
            input = scanner.nextInt();
        } while (input != 0);

        System.out.println("終了しました");
		
		
        scanner.nextLine();
		
/*****************************
 *  
 *   【概要】Qes11 for文を使用して九九を出力
 *  
 *****************************/	
		
		for (int i = 1; i <= 9; i++) {
            StringBuilder line = new StringBuilder();
            for (int j = 1; j <= 9; j++) {
                String expression = String.format("%02d * %02d = %02d", i, j, i * j);
                line.append(expression);
                if (j != 9) {
                    line.append(" || ");
                }
            }
            System.out.println(line);
        }

		
/*****************************
 *  
 *   【概要】Qes12 入力した商品の残り台数が出力されるシステムを構築
 *   　　　     →・拡張for文・Switch文・条件演算子を使用すること　※普通のif文は使用不可
 *　　　　　　　　・Switch文内でテレビとディスプレイは続けて書き、条件演算子で各項目を出力される値を変更してください
 *　　　　　　　　・テレビとディスプレイは同じ商品扱いとし、二つの合計値は常に11になるようにしてください。 
 *　　　　　　　　・例：テレビと受け取った場合、→「テレビの残り台数は〇台です」※〇はランダムで出た数字　ディスプレイは（11-〇）の値
 *　　　　　　　　・入力される値は右記の表のどれかが入力され、入力回数の縛りはありません
 *　　　　　　　・入力された値は「、」区切りで指定してください
 *　　　　　　　・そのほかの値が入力された場合下記を出力されるようにしてください
 *　　　　　　　・残り台数は0〜11までのランダムな値が出力されるようにしてください
 *  
 *****************************/	
		
        System.out.println("商品名を「、」区切りで入力してください：");

        String productInput = scanner.nextLine();
        String[] products = productInput.split("、");

        Random rand = new Random();

        int tvStock = rand.nextInt(12);  
        int displayStock = 11 - tvStock;

        for (String product : products) {
            product = product.trim();

            switch (product) {
                case "パソコン":
                    System.out.println("パソコンの残り台数は" + rand.nextInt(12) + "台です");
                    break;

                case "冷蔵庫":
                    System.out.println("冷蔵庫の残り台数は" + rand.nextInt(12) + "台です");
                    break;

                case "扇風機":
                    System.out.println("扇風機の残り台数は" + rand.nextInt(12) + "台です");
                    break;

                case "洗濯機":
                    System.out.println("洗濯機の残り台数は" + rand.nextInt(12) + "台です");
                    break;

                case "加湿器":
                    System.out.println("加湿器の残り台数は" + rand.nextInt(12) + "台です");
                    break;

                case "テレビ":
                case "ディスプレイ":
                    int stock = product.equals("テレビ") ? tvStock : displayStock;
                    System.out.println(product + "の残り台数は" + stock + "台です");
                    break;

                default:
                    System.out.println("『 " + product + " 』は指定の商品ではありません");
                    break;
            }
        }

        scanner.close();
		
		
		
	}

}
