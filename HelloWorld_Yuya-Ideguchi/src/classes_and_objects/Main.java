package classes_and_objects;

public class Main {

	public static void main(String[] args) {
		
        Employee emp = new Employee();
		
     // setメソッドで値を設定
         emp.setEmployeeId("E002");
         emp.setName("田中花子");

        // getメソッドで値を取得して出力
         System.out.println("社員ID: " + emp.getEmployeeId());
         System.out.println("名前: " + emp.getName());
 
	}

}
