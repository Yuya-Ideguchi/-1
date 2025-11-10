package inheritance;

public class PartTimeEmployee extends Employee {
    private static final int HOURLY_RATE = 1000;

    // コンストラクタ
    public PartTimeEmployee(String id, String name) {
        super(id, name);
    }

    // 割増なし
    @Override
    public int calculateDailyWage(int hoursWorked) {
        return hoursWorked * HOURLY_RATE;
    }
}
