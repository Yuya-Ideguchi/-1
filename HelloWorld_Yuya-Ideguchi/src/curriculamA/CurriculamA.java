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
 *   【概要】Qes8　priceというdouble型を宣言し、99.99を代入
 *                 priceをint型に変換し、誠意数価格:99とコンソールに表示
 *   
 **************************/      
      
     double price = 99.99;
     int intPrice =(int) price;
    		
     System.out.println("整数価格:" + intPrice);
    		
 /**************************
  *       
  *   【概要】Qes9　String 型の変数 numStr に "123" を代入numStr を int 型に変換し、
  *                 変換後の値: の後ろにnumStr + 10 した結果をコンソールに表示
  *   
  **************************/   
     
     String numStr = "123";
    		  
     int intNumStr = Integer.parseInt(numStr);
     
     System.out.println("変換後の値:" + (intNumStr + 10));
     
 /**************************
  *       
  *   【概要】Qes10　int型の変数numに50を代入
  *                 numをstring型に変換し、得点:50点の形で表示
  *   
  **************************/      
     
     int num = 50;

     String str = String.valueOf(num);
     
     System.out.println("得点:" + num + "点");
     
 /**************************
  *
  *   【概要】Qes11 条件を満たすプログラムを条件演算子を使用して作成
  *               →int型の変数aに10を代入
  *               →int型の変数bに20を代入
  *               →aがbより小さいかどうかをboolean変数resultに代入
  *               →resultの値を表示
  *   
  **************************/    
     
     int a = 10;
     int b = 20;
     
     boolean result =(a<b);
     
     System.out.println(result);
     
 /**************************
  *       
  *   【概要】Qes12　int型の変数xに15を代入
  *                  xが10以上ならOK、そうでなければNGを表示
  *   
  **************************/     
     
     int x = 15;
     System.out.println(x >=10 ? "OK" : "NG");
     
 /**************************
  *       
  *   【概要】Qes12　String text = 私はjavaが好きです。　javaは楽しい！という文章の中にある
  *   　　　　　　　 javaをPythonに変更
  *   
  **************************/  
     
     String text ="私はJavaが好きです。　Javaは楽しい！";
     
     text = "私はPythonが好きです。　Pythonは楽しい！";
     
     System.out.println(text);
     
     
     
     
     
	}

}
