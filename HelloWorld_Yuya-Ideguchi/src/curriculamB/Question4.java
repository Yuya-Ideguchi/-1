package curriculamB;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

/*****************************
 *  
 *   【概要】Qes1　int型の配列句を作成し、1,2,3,4,5を格納する
 *   　　　     →配列の全要素を順番に表示
 *  
 *****************************/	
		
		int[] numbers = {1,2,3,4,5};
		
		for(int z = 0; z < numbers.length; z++) {
			System.out.println(numbers[z]);
			
		}
		
/*****************************
 *  
 *   【概要】Qes2 int型の配列[10,20,30,40,50]を用意する
 *   　　　     →配列の要素を逆順に表示
 *  
 *****************************/	
		
	     int[] numbers1 = {10,20,30,40,50};
	     
	     for(int u = numbers1.length - 1; u >= 0; u--) {
	    	 System.out.println(numbers1[u]);
	    	 
	     }
		
/*****************************
 *  
 *   【概要】Qes3 int型の配列[3.5.7.9.11]を用意する
 *   　　　     →配列の全要素の合計値を計算し表示
 *  
 *****************************/	
		
	     int[] numbers2 = {3,5,7,9,11};
	     
	     int sum = 0;
	     
	     for(int v = 0; v < numbers2.length; v++ ) {
	    	 sum += numbers2[v];
	     }
	     
	     System.out.println("合計値 " + sum);
	     
		
/*****************************
 *  
 *   【概要】Qes4　int型の配列　12,7,9,21,5,18を用意する
 *   　　　     →配列の最大値と最小値を求めて表示
 *  
 *****************************/	
		
	     int[] numbers3 = {12,7,9,21,5,18};
	     
	     int max = numbers3[0];
	     int min = numbers3[0];
	     
	     for(int  x = 1; x < numbers3.length; x++) {
	    	 if(numbers3[x] > max) {
	    		 max = numbers3[x];
	    	}
	    	 if(numbers3[x] < min) {
	    		 min = numbers3[x];
	    	 }
	     }
		
	     System.out.println("最大値:" + max);
	     System.out.println("最小値:" + min);
	     
		
/*****************************
 *  
 *   【概要】Qes5 int型の配列　1,2,3,4,5を用意
 *   　　　     →配列のすべての要素を2倍し結果を表示
 *   　　　　　 →結果を表示する際の処理に拡張for文を使用してください
 *  
 *****************************/	
		
	     int[] numbers4 = {1,2,3,4,5};
	     
	     for(int y = 0; y < numbers4.length; y++) {
	    	 System.out.println(numbers[y] * 2);
	     }
	     
/*****************************
 *  
 *   【概要】Qes6　int 型の配列 {4, 7, 10, 15, 20} を用意する
 *　　　　　　　　→ユーザーが入力した数が 配列に含まれているか を判定し、結果を表示
 *　　　　　　　　→ 結果：（”入力した値”は配列に含まれています／含まれていません）
 *  
 *****************************/	
	     
	     int[] numbers5 = {4,7,10,15,20};
	     
	     Scanner scanner = new Scanner(System.in);
	     System.out.println("数字を入力してください :");
	     int input = scanner.nextInt();
	     
	     boolean found = false;
	     for(int num : numbers5) {
	    	 if(num == input) {
	    		 found = true;
	    		 break;
	    	 }
	     }
	     
	     if(found) {
	    	 System.out.println("入力した値 :" + input + "は配列に含まれています");
	     }else {
	    	 System.out.println("入力した値　:" + input + "は配列に含まれていません");
	     }
	     
	     
	     
	     
/*****************************
 *    
 *   【概要】Qes7　2次元配列 int[][] array = {{1, 2}, {3, 4}, {5, 6}}; を用意する
 *   　　　      →配列の すべての要素を表示 
 *  
 *****************************/	
	     
	     int[][] array = {
	    		 {1,2},
	    		 {3,4},
	    		 {5,6}
	     };
	     for(int a = 0; a < array.length; a++) {
	    	 for(int b = 0; b < array[a].length; b++) {
	    		 System.out.print(array[a][b] + " ");
	    	 }
	    	     System.out.println();
	     }
	     
	     
/*****************************
 *  
 *   【概要】Qes8　2次元配列 int[][] array = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}}; を用意する
 *   　　　     →配列の すべての要素の合計値を表示
 *      
 *****************************/	
	     
	     int [][] array1 = {
	    		 {10,20,30},
	    		 {40,50,60},
	    		 {70,80,90}
	     };
	     int sum1 = 0;
	      for(int c = 0; c < array1.length; c++) {
	         for(int d = 0; d < array1[c].length; d++) {
	    	 sum1 += array1[c][d];
	       }
	     }
	     System.out.println("合計 :" + sum1);
	     
	     
/*****************************
 *  
 *   【概要】Qes9　2次元配列 int[][] array = {{12, 15, 8}, {6, 19, 25}, {30, 2, 10}}; を用意する
 *   　　　     →配列内の 最大値と最小値 を求めて表示
 *  
 *****************************/	
	     
	     int[][]array2 = {
	    		 {12,15,8},
	    		 {6,19,25},
	    		 {30,2,10}
	     };
	     
	     int max1 = array2[0][0];
	     int min1 = array2[0][0];
	     
	     for(int e = 0; e < array2.length; e++) {
	    	 for(int f = 0; f < array2[e].length; f++) {
	    		 
	    	 int value = array2[e][f];
	    	 if(value > max1) {
	    		 max1 = value;
	    	 }
	    	 if(value < min1) {
	    		 min1 = value;
	    	 }
	       }
	     }
	     
	     System.out.println("最大値　:" + max1);
	     System.out.println("最小値　:" + min1);
	     
	     
	     
/*****************************
 *  
 *      【概要】Qes10　3次元配列 int[][][] array = {{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}}; を用意する
 *   　　　          →配列内のすべての要素を 表示
 *  
 *****************************/	
	     
	     int[][][] array3 = {
	    		 {
	    			 {1,2},
	    		     {3,4},
	    		     
	    		 },
	    		 {
	    			 {5,6},
	    		     {7,8}
	    		 }
	     };
	     
	     for(int g = 0; g < array3.length; g++) {
	    	 for(int h = 0; h < array3[g].length; h++) {
	    		 for(int i = 0; i < array3[g][h].length; i++) {
	    			 System.out.print(array3[g][h][i] + "");
	    		 }
	    		 System.out.println();
	    	 }
	    	 System.out.println("");
	     }
	     
	     
	     scanner.close();
	     
	     
	     
	     }
	     
}