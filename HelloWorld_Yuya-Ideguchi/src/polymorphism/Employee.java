package polymorphism;

public abstract class Employee {

/************************************************
*
*      Que ④ abstract class Employee {
*             protected String id;
*             protected String name;
*             public Employee(String id, String name) {
*             this.id = id;
*             this.name = name;
*             }
*             public abstract int calculateDailyWage(int hoursWorked);
*             }
*
*             class FullTimeEmployee extends Employee {
*             public FullTimeEmployee(String id, String name) {
*             super(id, name);
*             }
*            @Override
*             public int calculateDailyWage(int hoursWorked) {
*             int hourlyRate = 1250;
*             int overtime = Math.max(0, hoursWorked - 8);
*             int regularHours = hoursWorked - overtime;
*             return (regularHours * hourlyRate) + (int)(overtime * hourlyRate * 1.25);
*               }
*             }
*
*             class ContractEmployee extends Employee {
*             public ContractEmployee(String id, String name) {
*             super(id, name);
*             }
*            @Override
*             public int calculateDailyWage(int hoursWorked) {
*             int hourlyRate = 1000;
*             return hoursWorked * hourlyRate;
*               }
*             }	
*      
*       1	社員リスト（List<Employee>）に FullTimeEmployee と ContractEmployee を複数追加する。
*       2	for-each ループで calculateDailyWage を呼び出し、各社員の給料を出力する。
*       3	サブクラスを明示的に扱わずに、共通の Employee 型で実装する。
*      
**************************************************/
	
	protected String id;
	protected String name;
	
	public Employee(String id, String name) {
	
	    this.id = id;
	    this.name = name;
	}
	
	public abstract int calculateDailyWage(int hoursWorked);
	
	
	
	
}
