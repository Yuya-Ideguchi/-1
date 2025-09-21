package curriculamB;

public class Question2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

/*****************************
 *  
 *   【概要】Qes1 int型の変数scoreに75代入
 *   　　　     →scoreが60以上なら合格です！と表示
 *  
 *****************************/
		
		int score = 75;
		
		if(score >= 60) { System.out.println("合格です！");}
		
/*****************************
 *  
 *   【概要】Qes2 int型の変数ageに25を代入
 *   　　　     →ageが20以上30以下なら適正年齢ですと表示
 *   　　　　　 →それ以外の場合は対象外ですと表示
 *  
 *****************************/		
		
		int age = 25;
		
		if(age >= 20 && age <= 30) {
			System.out.println("適正年齢です");
		}else {
			System.out.println("対象外です");
			
		}
		
/*****************************
*  
*   【概要】Qes3 int型の変数ageに18を代入 
*   　　　     →ageが20以上なら成人ですと表示
*   　　　　　 →ageが13以上19以下ならティーンエイジャーですと表示
*   　　　　　 →ageが12以下なら子供ですと表示
*  
*****************************/			
		
         int age1 =18;
 
		 if(age1 >=20) {
			System.out.println("成人です");
		 } else if (age1 >= 13 && age1 <= 19 ) {
		    System.out.println("ティーンエイジャーです");
		 } else if (age1 <= 12) {
			 System.out.println("子供です");
		 }
			
	     
/*****************************
*  
*   【概要】Qes4  int型の変数x,y,zに30,15,50を代入
*   　　　      →一番大きい数値を判定して表示
*  
*****************************/	
		 
		 int x = 30;
		 int y = 15;
		 int z = 50;
		 
		 int max = x;
		 
		 if (y > max) {
			 max = y;	 
		 }
		 if (z > max) {
			 max = z;
		 }
		 
		 System.out.println(max);
		
		
/*****************************
*  
*   【概要】Qes5 int型の変数numを用意
*   　　　     →numの値が0より大きければ正の数ですと表示
*   　　　　　 →numの値が0なら0ですと表示
*              →numの値が0より小さければ負の数ですと表示
*  
*****************************/	
		
		 int num = 0;
		 
		 if( num > 0) {
			 System.out.println("正の数です");
		 }else if( num == 0) {
			 System.out.println("0です");
		 }else if( num <= 0) {
			 System.out.println("負の数です");
		 }
		 
/*****************************
 *   
 *   【概要】Qes6 int 型の変数 value を用意
 *   　　　     →value が 偶数 なら "偶数です" と表示
 *   　　　　　 →value が 奇数 なら "奇数です" と表示
 *      
 *****************************/			
		
		 int value = 0;
		 
		 if(value % 2 == 0) {
			 System.out.println("偶数です");
		 }else {
			 System.out.println("奇数です");
		 }
		 
/*****************************
 *  
 *   【概要】Qes7 int 型の変数 score に 0 から 100 の数値を代入
 *    　　　     →90 以上なら "優"
 *   　　　　　  →70 以上なら "良"
 * 　　　　　　　→50 以上なら "可" 
 *               →50 未満なら "不可"　を表示
 *  
 *****************************/			 
		 
		 int score1 = 23;
		 
		 if(score1 >= 90) {
			 System.out.println("優");
		 }else if(score1 >= 70) {
			 System.out.println("良");
		 }else if(score1 >= 50) {
			 System.out.println("可");
		 }else {
			 System.out.println("不可");
		 }
		 
		 
 /*****************************
 *  
 *   【概要】Qes8 入力が null または空文字（""）のときに「入力が無効です」と
 *   　　　       表示する処理を作成してください
 *  
 *****************************/			 
		 
		 String text = "";
		 
		 if(text == null || text.isEmpty()){
			 System.out.println("入力が無効です");
		 }else{
			 System.out.println(text);
		 }
		 
		 
 /*****************************
 *  
 *   【概要】Qes9 int型の変数dayを用意(1～7の数値を代入)
 *   　　　     →1→月曜日　～7→日曜日
 *   　　　　　 →それ以外なら　無効な入力です　と表示　(※Switch文を使用してください)
 *  
*****************************/	
		
		 int day = 3; // ← 好きな数字（1〜7）に変えてOK

	        switch (day) {
	            case 1:
	                System.out.println("今日は月曜日です");
	                break;
	            case 2:
	                System.out.println("今日は火曜日です");
	                break;
	            case 3:
	                System.out.println("今日は水曜日です");
	                break;
	            case 4:
	                System.out.println("今日は木曜日です");
	                break;
	            case 5:
	                System.out.println("今日は金曜日です");
	                break;
	            case 6:
	                System.out.println("今日は土曜日です");
	                break;
	            case 7:
	                System.out.println("今日は日曜日です");
	                break;
	            default:
	                System.out.println("無効な入力です");
	                break;
	        }
		 
		 
 /*****************************
 *  
 *   【概要】Qes10 int型の変数monthを用意(1～12の数値を代入)
 *   　　　     →monthの値に応じて季節を表示
 *   　　　　　 →12,1,2　 →冬
 *              →3,4,5　　→春
 *              →6,7,8　　→夏
 *              →9,10,11　→冬
 *              それ以外の値なら　無効な月　です　と表示
 *****************************/	
		 
		 int month = 10;
		 
		 switch(month) {
		    case 12: case 1: case 2:
			   System.out.println("冬です");
			   break;
		    case 3: case 4: case 5:
		    	System.out.println("春です");
		    	break;
		    case 6: case 7: case 8:
		    	System.out.println("夏です");
		    	break;
		    case 9: case 10: case 11:
		    	System.out.println("秋です");
		    	break;
		    default:
		    	System.out.println("無効な月です");
		    	
		   }
	        
	        
	        
	        
		 
		
	}

}
