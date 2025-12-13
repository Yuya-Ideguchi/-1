package interface_curriculam;

public abstract class Employee implements Billable {

	private int id;
	private String name;
	
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public abstract int costForDay(int hoursWorked);
	
}
