package solid;

import java.util.List;

public class Main {
  
	public static void main(String[] args) {
   
		List<Employee> employees = List.of(
    	 new FullTimeEmployee("山田", 200),
    	 new ContractEmployee("市川", 160),
    	 new FullTimeEmployee("原", 180)
    	 );

        SalaryCalculator calculator = new SalaryCalculator();
        SalaryReportPrinter printer = new SalaryReportPrinter();

        for (Employee employee : employees) {
        	
        	int salary = calculator.calculate(employee);
        	printer.print(employee, salary);
        }	
    }
}