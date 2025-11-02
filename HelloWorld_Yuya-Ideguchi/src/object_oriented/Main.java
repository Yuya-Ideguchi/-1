package object_oriented;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

/************************
 * 		
 * Qes ① 表示
 * 
 ************************/
		
		Employee emp = new Employee();
		
		emp.name = "山田太郎";
		
		emp.work();
		
/************************
 * 		
 * Qes ② 表示
 * 
 ************************/		
		
		Employee Id = new Employee();
		
		Id.employeeId = "E001";
		Id.name1 = "佐藤太郎";
		Id.showInfo();
		
/************************
 * 		
 * Qes ③ 表示
 * 
 ************************/			
		
		Employee emp1 = new Employee("E002","田中花子");
		System.out.println("社員ID :" + emp1.getEmployeeId1() + ", 名前 :" + emp1.getName2());
		
		
		
		
	}

}
