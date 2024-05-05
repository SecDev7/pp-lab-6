import company.models.Worker;
import company.models.Manager;
import company.abstracts.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Worker("Kamil", 3000.00, 1, "2022-01-10", "Technik"));
        employees.add(new Worker("Samuel", 3500.00, 2, "2022-02-15", "Specjalista"));
        employees.add(new Worker("Adolf", 3200.00, 3, "2023-01-20", "Operator"));
        employees.add(new Worker("Bernadeta", 3300.00, 4, "2021-12-01", "Inżynier"));
        employees.add(new Manager("Adam", 5000.00, 5, "2019-07-30", "Manager"));
        employees.add(new Worker("Tomasz", 3100.00, 1, "2023-02-11", "Technik"));
        employees.add(new Manager("Ewa", 5100.00, 1, "2020-05-25", "Manager"));
      
        employees.add(new Worker("Marek", 3000.00, 1, "2024-01-01", "Technik"));
        employees.add(new Manager("Julia", 5200.00, 4, "2024-02-01", "Manager"));

 
        double totalSalary = 0, totalManagerSalary = 0, totalWorkerSalary = 0;
        for (Employee emp : employees) {
            totalSalary += emp.getSalary();
            if (emp instanceof Manager) {
                totalManagerSalary += emp.getSalary();
            } else if (emp instanceof Worker) {
                totalWorkerSalary += emp.getSalary();
            }
        }

        System.out.println("Total salary for all employees: " + totalSalary);
        System.out.println("Total salary for all managers: " + totalManagerSalary);
        System.out.println("Total salary for all workers: " + totalWorkerSalary);

        
        Map<Integer, List<Employee>> idMap = new HashMap<>();
        for (Employee emp : employees) {
            idMap.computeIfAbsent(emp.getId(), k -> new ArrayList<>()).add(emp);
        }

        System.out.println("Duplicates found:");
        for (Map.Entry<Integer, List<Employee>> entry : idMap.entrySet()) {
            if (entry.getValue().size() > 1) {
                System.out.print("Duplicate ID " + entry.getKey() + " found in: ");
                entry.getValue().forEach(e -> System.out.print(e.getName() + " (" + e.getPosition() + "), "));
                System.out.println();
            }
        }
    }
}
