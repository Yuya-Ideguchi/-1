package interface_curriculam;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Billable> employees = new ArrayList<>();
		
		employees.add(new FullTimeEmployee(1,"成歩堂"));
		employees.add(new ContractEmployee(2,"古御門"));
		employees.add(new FullTimeEmployee(3,"御子柴"));
		
		int hoursWorked = 9;
		
		for (Billable b : employees) {
			System.out.println(b.costForDay(hoursWorked));
		
		}

	}

}
