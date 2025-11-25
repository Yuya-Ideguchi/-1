package polymorphism;

class ContractEmployee extends Employee {
    public ContractEmployee(String id, String name) {
        super(id, name);
    }

    @Override
    public int calculateDailyWage(int hoursWorked) {
        return hoursWorked * 1000;
    }

}
