//　クラス
package curriculamA;

public class CurriculamA {
	
/**************************
 * 
 * メソッド
 * 
 *************************/
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
     
/**************************
 * 
 *　【概要】Qes1　変数宣言	
 *
 **************************/
	 byte byteNum;
	 short shortNum;
	 int intNum;
	 long longNum;
	 float floatNum;
	 double doubleNum;
	 char letter;
	 String letters;
	 boolean isBoolean;

/**************************
 *  
 *  【概要】Qes2　変数の代入 
 *  	 
 *************************/

	  byteNum = 10;
      shortNum = 100;
      intNum =1000;
      longNum = 10000;
      floatNum = 9.5f;
      doubleNum = 10.5;
      letter = 'a';
      letters = "ハロー";
      isBoolean = true;
      
/**************************
 *       
 *   【概要】Qes3　出力
 *   
 **************************/
      System.out.println(longNum + intNum + shortNum + byteNum);
      System.out.println(byteNum + byteNum);
      System.out.println(letter + letters + isBoolean);
      System.out.println(longNum + intNum + shortNum + byteNum + byteNum + byteNum);
      System.out.println(longNum * intNum * shortNum * byteNum);
      System.out.println(doubleNum / shortNum);
      System.out.println(byteNum - shortNum);
      
 /**************************
 *       
 *   【概要】Qes4　nameの宣言→山田太郎を代入→こんにちは、山田太郎さん！とコンソールに表示
 *   
 **************************/
      String name;
        
      name ="山田太郎";
        
      System.out.println("こんにちは、" + name + "さん！");
      
 /**************************
 *       
 *   【概要】Qes5　ageの宣言→25を代入→年齢:25歳とコンソールに表示
 *   
  **************************/      
      int age;
      
      age = 25;
      
      System.out.println("年齢:" + age + "歳");
      
/**************************
 *       
 *   【概要】Qes6　num1とnum2をそれぞれ宣言し10,5を代入→num1とnum2を足した結果をsumに代入しコンソールに表示
 *   
 **************************/       
      int num1;
      int num2;
      
      num1 = 10;
      num2 = 5;
      
      int sum =(num1 + num2);
      
      System.out.println(sum);
      
 /**************************
 *       
 *   【概要】Qes7　scoreを宣言し80を代入→20を足して更新→最終score:100をscoreを使用して表示
 *   
 **************************/       
      int score;
      
      score =80;
      
      score = score + 20;
      
      System.out.println(score);
      
 /**************************
 *       
 *   【概要】Qes8　
 *   
 **************************/      
      
      
      
      
      
      
      
      
	}

}
