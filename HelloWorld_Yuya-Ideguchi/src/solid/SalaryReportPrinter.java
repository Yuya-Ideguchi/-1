package solid;

public class SalaryReportPrinter {
   
	public void print(Employee employee, int salary) {
        
		System.out.println(employee.getName() + " の給料は " + salary + " 円");
   
	}
}