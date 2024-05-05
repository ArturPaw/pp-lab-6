
import company.models.Manager;
import company.models.Worker;


public class Main {

    @SuppressWarnings("unlikely-arg-type")
    public static void main(String[] args) {
        Worker worker1 = new Worker("John", 2000, 1, "2023-01-15", "Junior Worker");
        Worker worker2 = new Worker("Alice", 1800, 2, "2023-02-20", "Senior Worker");
        Worker worker3 = new Worker("Bob", 1900, 1, "2023-03-25", "Mid-level Worker");
        Manager manager = new Manager("Michael", 3000, 4, "2022-12-31", "Project Manager");

        System.out.println(worker1.getName() + " has code: " + worker1.hashCode());
        System.out.println(worker2.getName() + " has code: " + worker2.hashCode());
        System.out.println(worker3.getName() + " has code: " + worker3.hashCode());
        System.out.println(manager.getName() + " has code: " + manager.hashCode());

        System.out.println(worker1.getName() + " equals worker2: " + worker1.equals(worker2));
        System.out.println(worker1.getName() + " equals worker3: " + worker1.equals(worker3));
        System.out.println(worker1.getName() + " equals manager: " + worker1.equals(manager));
    }
}
