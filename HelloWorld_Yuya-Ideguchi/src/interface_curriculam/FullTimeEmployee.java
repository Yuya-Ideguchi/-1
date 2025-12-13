package interface_curriculam;

public class FullTimeEmployee extends Employee{
	
	public FullTimeEmployee(int id, String name) {
		super(id, name);
	}

	@Override
	public int costForDay(int hoursWorked) {
		int baseRate = 1250;
		
		if(hoursWorked <= 8) {
			return hoursWorked * baseRate;
		}else {
			int normalpay = 8 * baseRate;
			int overtimepay = (int)((hoursWorked -8) * baseRate * 1.25);
			return normalpay + overtimepay;
			
		}
	}
	
}
