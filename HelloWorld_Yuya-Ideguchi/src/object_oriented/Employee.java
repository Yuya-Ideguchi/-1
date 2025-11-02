package object_oriented;

public class Employee {

		// TODO 自動生成されたメソッド・スタブ
/************************+++++++++++++++++
 * 
 * Qes ①  1	クラス名は Employee とする。		
 *         2	Employee クラスには以下のメンバを持たせる。		
 *	             ・name（文字列型）フィールド	
 *	             ・work() メソッド：[name]は働いています。 と出力する。	
 *         3	Main クラスに main() メソッドを作り、以下の操作を行う。		
 *	             ・Employee クラスのインスタンス（オブジェクト）を生成する。	
 *	             ・name に「山田太郎」を設定する。	
 *	             ・work() を呼び出して出力を確認する。	
 * 
 ******************************************/
		
		 String name;
		
	public void work() {
		System.out.println(name + "は働いています。");
		
	}
	

		
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
	 
	 public Employee() {
		 
	 }
/******************************************
 * 
 * Qes ③   1	Employee クラスを作成し、以下のプライベートフィールドを定義する。	
 *		          employeeId（文字列型）
 *		          name（文字列型）
 *          2	これらのフィールドにアクセスするために、以下のメソッドを用意する。	
 *		          public void setEmployeeId(String id)
 *		          public String getEmployeeId()
 *		          public void setName(String name)
 *		          public String getName()
 *          3	Main クラスで Employee オブジェクトを生成し、set メソッドで
 *             「E002」「田中花子」を設定後、get メソッドで出力する。	
 * 
 ******************************************/
	 
	      private String employeeId1;
	      private String name2;
	      
	      Employee(String employeeId1,String name2){
	    	  this.employeeId1 = employeeId1;
	    	  this.name2 = name2;
	      }
	      
	      // set
	      public void setEmployeeId1(String id){
	    	  this.employeeId1 = id;
	      }
	      
	      public void setName2(String name2) {
	    	  this.name2 = name2;
	      }
	      
	      //get
	      public String getEmployeeId1() {
	    	  return employeeId1;
	      }
	      
	      public String getName2() {
	    	  return name2;
	      }
	      public void showEmployeeInfo() {
	    	    System.out.println("社員ID: " + employeeId1 + ", 名前: " + name2);
	    	}
	 
	 
	 
		
	}


