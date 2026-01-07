package curriculumB;

public class Question5 {

		// TODO 自動生成されたメソッド・スタブ

		
/*****************************
 *  
 *   【概要】Qes1　次の条件を満たすメソッド Hello,World　を作成
 *   　　　     →引数無し
 *              →戻り値無し
 *              →Hello,Worldを表示　(1,2,3の結果に表示)
 *  
 *****************************/	
				
		public static void greet() {
			System.out.println("Hello,World!");
		}
	    
/*****************************
 *  
 *   【概要】Qes2 次の条件を満たすメソッド　doubleValue を作成
 *   　　　     →引数:整数(intnum)
 *              →戻り値:整数(引数の2倍の値)
 *              →次のように表示　10を2倍すると20です。(1,2,3の結果に表示)
 *  
 *****************************/	
				
		public static int doubleValue(int num) {
			return num * 2;
		}
		
/*****************************
 *  
 *   【概要】Qes3 次の条件を満たすメソッド isEvenを作成
 *              →引数:整数(intnum)
 *              →戻り値:偶数なら　true　奇数なら　false
 *              →num1に7、num2に10を設定　(1,2,3の結果に表示)
 *              実行例
 *              10 は偶数です。
 *              7 は奇数です。
 *  
 *****************************/	
	
	    public static boolean isEven(int num) {
	    	return num % 2 == 0;
	    }
		
/*****************************
 *  
 *   【概要】1,2,3の結果
 *  
 *****************************/			
	    public static void main(String[] args) {
/*************
 * 	    
 *  Qes1 表示
 * 
 *************/
	
	    greet();
	
/*************
 * 	    
 *  Qew2 表示
 * 
 *************/
		
	     int result = doubleValue(10);
	     System.out.println((result / 2)+ "を2倍すると" + result + "です。");
	
	     
	
/*************
 * 	    
 *  Qew3 表示
 * 
 *************/
	    
	     int num1 = 7;
	     int num2 = 10;
	     
	     if(isEven(num1)) {
	    	 System.out.println(num1 + "は偶数です。");
	     }else {
	    	 System.out.println(num1 + "は奇数です。");
	     }
	     
	     if(isEven(num2)) {
	    	 System.out.println(num2 + "は偶数です。");
	     }else {
	    	 System.out.println(num2 + "は奇数です。");
	     }
	
		    
/*****************************
 *  
 *   【概要】Qes4　次の2つのクラスを作成し、mainクラスからGreetingクラスのメソッドを呼び出す
 *               →Greeting java(別のクラス)
 *               →sayHello()メソッドを持ち、"こんにちは！"を表示
 *               
 *               →Main java
 *               →GreetingクラスをインポートしてsayHello()を実行　(全ての結果に表示)
 *   
 *****************************/	
	     
	     Greeting greeting = new Greeting();
	     	     
	     greeting.sayHello();
	     	     
	     	    				
/*****************************
 *  
 *   【概要】Qes5 次のクラスを作成し、下記がコンソールに出力されるように作成してください
 *              →※thisとsetterとgetterとフィールドを使ってください
 *              →動物名:ライオン
 *              →体長:2.1m
 *              →速度:80km/h
 *              
 *              →Animal java(別のクラス)
 *              →動物名、体長、速度の変数を持ち各変数のgetterとsetterを作成
 *              
 *              →Main java
 *              →変数の中身を設定し、出力の処理を行う　(全ての結果に表示)
 *              
 *****************************/	    

	     Animal lion = new Animal();
	     	     
	     lion.setName("ライオン");
	     lion.setLength(2.1);
	     lion.setSpeed(80);
	     	     
	     	 System.out.println("動物名" + lion.getName());
	     	 System.out.println("体長" + lion.getLength() + "m");
	     	 System.out.println("速度" + lion.getSpeed() + "km/h");	     
	     
}
	    
}
