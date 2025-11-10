package Classes_and_Objects;

public class Employee {

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
		 
	 private String employeeId;
	 private String name;
		      
	 public void setEmployeeId(String id) {
	        this.employeeId = id;
	    }

	    
	    public String getEmployeeId() {
	        return this.employeeId;
	    }

	    
	    public void setName(String name) {
	        this.name = name;
	    }

	   
	    public String getName() {
	        return this.name;
	 }
	
	
	
	
	
	
	
}
