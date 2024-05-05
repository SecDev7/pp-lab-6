import company.models.Worker;
import company.models.Manager;
import company.abstracts.Employee;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Kamil", 3000.00, 1, "2022-01-10", "Technik");
        Worker worker2 = new Worker("Samuel", 3500.00, 2, "2022-02-15", "Specjalista");
        Worker worker3 = new Worker("Adolf", 3200.00, 3, "2023-01-20", "Operator");
        Worker worker4 = new Worker("Bernadeta", 3300.00, 4, "2021-12-01", "Inżynier");
        Manager manager = new Manager("Adam", 5000.00, 5, "2019-07-30", "Manager");

        List<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(manager);

        for (Employee emp : employees) {
            System.out.println(emp.getName() + " has code: " + emp.hashCode());
        }

        System.out.println("Comparing " + worker3.getName() + " with others:");
        for (Employee emp : employees) {
            System.out.println(worker3.getName() + " is equal to " + emp.getName() + ": " + worker3.equals(emp));
        }
    }
}
