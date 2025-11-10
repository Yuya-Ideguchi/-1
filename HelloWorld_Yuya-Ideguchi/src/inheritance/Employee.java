package inheritance;

public abstract class Employee {
	
/************************************************
*
* Que ④ １	抽象クラス Employee		
*		      フィールド: employeeId（文字列）、name（文字列）	
*		    
*           コンストラクタ: Employee(String id, String name)	
*		      メソッド:	
*			           public String getEmployeeId()
*			           public String getName()
*			           public abstract int calculateDailyWage(int hoursWorked)
*         
*         ２  サブクラス FullTimeEmployee		
*		      定数: private static final int HOURLY_RATE = 1200	
*		       calculateDailyWage の実装（残業 8h 超過分は 25% 割増）	
*         
*         ３  サブクラス PartTimeEmployee		
*		      定数: private static final int HOURLY_RATE = 1000	
*		       calculateDailyWage の実装（割増なし）	 	
*      
**************************************************/
		      
	 String employeeId;
	 String name;
		      
	 public Employee(String id, String name) {
	        this.employeeId = id;
	        this.name = name;
	    }

	    // 社員IDを返す
	    public String getEmployeeId() {
	        return this.employeeId;
	    }

	    // 名前を返す
	    public String getName() {
	        return this.name;
	    }

	    // 日給を計算する抽象メソッド（サブクラスで実装する）
	    public abstract int calculateDailyWage(int hoursWorked);
	

}
