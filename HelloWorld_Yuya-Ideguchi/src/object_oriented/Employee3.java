package object_oriented;

public class Employee3 {

	
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
		      
		      Employee3(String employeeId1,String name2){
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
