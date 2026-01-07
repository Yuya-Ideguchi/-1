package solid;

public class FullTimeEmployee implements Employee {
   
	private String name;
    private int hours;

    public FullTimeEmployee(String name, int hours) {
        this.name = name;
        this.hours = hours;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getHours() {
        return hours;
    }

    @Override
    public int calculateSalary() {
        return hours * 1200;
    }
}