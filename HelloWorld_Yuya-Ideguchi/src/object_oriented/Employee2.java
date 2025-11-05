package object_oriented;

public class Employee2 {

/******************************************
 * 
 * Qes ②　 1	クラス名は Employee とする。		
 *　　　　　2	Employee クラスに以下のメンバを持たせる。		
 *		         employeeId（文字列型）フィールド	
 *		         name（文字列型）フィールド	
 *		         showInfo() メソッド：社員ID: [employeeId], 名前: [name] と出力する。	
 *          3	Main クラスに main() メソッドを作り、以下の操作を行う。		
 *		         Employee クラスのインスタンスを生成する。	
 *		         employeeId に「E001」、name に「佐藤太郎」を設定する。	
 *		         showInfo() を呼び出して、出力を確認する。		
 *	
 ******************************************/
		
	     String employeeId;
	     String name1;
	    
	 public void showInfo() {
		 System.out.println("社員ID :" + employeeId + " 名前 :" + name1);
	 }
	 
}	 
