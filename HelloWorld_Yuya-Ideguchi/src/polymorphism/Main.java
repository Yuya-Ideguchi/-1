package polymorphism;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new FullTimeEmployee("F001", "山田　太郎"));
        employees.add(new FullTimeEmployee("F002", "高嶺野　花子"));
        employees.add(new ContractEmployee("C001", "成歩堂　龍一"));
        employees.add(new ContractEmployee("C002", "夜神　月"));

        
        for (Employee employee : employees) {
            int wage = employee.calculateDailyWage(10);
            System.out.println(employee.getName() + " の給料: " + wage + " 円");
        }
    }
}