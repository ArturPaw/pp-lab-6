import company.models.Manager;
import company.models.Worker;


public class Main {

    public static void main(String[] args) {
        Worker worker1 = new Worker("Jan Kowalski", 2500, 1);
        Worker worker2 = new Worker("Anna Nowak", 3000, 2);
        Worker worker3 = new Worker("Piotr Wiśniewski", 2200, 3);
        Worker worker4 = new Worker("Katarzyna Zielińska", 2800, 4);

        Manager manager = new Manager("Tomasz Sikorski", 4500, 5);

        System.out.println("Worker 1 salary: " + worker1.getSalary());
        worker1.work();

        System.out.println("Worker 2 salary: " + worker2.getSalary());
        worker2.work();

        System.out.println("Worker 3 salary: " + worker3.getSalary());
        worker3.work();

        System.out.println("Worker 4 salary: " + worker4.getSalary());
        worker4.work();

        System.out.println("Manager salary: " + manager.getSalary());
        manager.work();
    }
}
