
import java.util.ArrayList;
import java.util.List;

import company.abstracts.Employee;
import company.models.Manager;
import company.models.Worker;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("John", 2000, 1, "2023-01-15", "Junior Worker");
        Worker worker2 = new Worker("Alice", 1800, 2, "2023-02-20", "Senior Worker");
        Worker worker3 = new Worker("Bob", 1900, 3, "2023-03-25", "Mid-level Worker");
        Worker worker4 = new Worker("Emma", 2100, 1, "2023-04-30", "Senior Worker");
        Worker worker5 = new Worker("Tom", 2200, 2, "2023-05-15", "Junior Worker");

        Manager manager1 = new Manager("Michael", 3000, 4, "2022-12-31", "Project Manager");
        Manager manager2 = new Manager("Sarah", 3200, 6, "2022-11-30", "Senior Project Manager");

        List<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(worker5);
        employees.add(manager1);
        employees.add(manager2);

        double totalSalary = 0;
        double totalManagerSalary = 0;
        double totalWorkerSalary = 0;

        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
            if (employee instanceof Manager) {
                totalManagerSalary += employee.getSalary();
            } else if (employee instanceof Worker) {
                totalWorkerSalary += employee.getSalary();
            }
        }

        System.out.println("Total salary of all employees: " + totalSalary);
        System.out.println("Total salary of all managers: " + totalManagerSalary);
        System.out.println("Total salary of all workers: " + totalWorkerSalary);

        
        for (Employee employee : employees) {
            for (Employee otherEmployee : employees) {
                if (employee != otherEmployee && employee.equals(otherEmployee)) {
                    System.out.println("Found matching employee for: " + employee.getName());
                }
            }
        }
    }
}
