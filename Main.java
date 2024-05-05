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
        Worker worker4 = new Worker("Emma", 2100, 4, "2023-04-30", "Senior Worker");

        Manager manager = new Manager("Michael", 3000, 5, "2022-12-31", "Project Manager");

        List<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(manager);

        for (Employee employee : employees) {
            employee.work();
            System.out.println("- " + employee.getName() + " (ID: " + employee.hashCode() +
                    ", Position: " + employee.getPosition() +
                    ", Hire date: " + employee.getHireDate() +
                    ", Salary: " + employee.getSalary() + ")");
        }
    }
}