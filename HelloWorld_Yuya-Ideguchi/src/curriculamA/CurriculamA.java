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
      
      
	}

}
