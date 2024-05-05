import company.models.Worker;
import company.models.Manager;

public class Main {
    public static void main(String[] args) {
        Worker w1 = new Worker("Kamil", 3000, 1);
        Worker w2 = new Worker("Samuel", 3200, 2);
        Worker w3 = new Worker("Adolf", 2900, 3);
        Worker w4 = new Worker("Bernadeta", 3100, 4);
        Manager m1 = new Manager("Adam", 5000, 5);

        Worker[] workers = {w1, w2, w3, w4};
        for (Worker w : workers) {
            System.out.println(w.getName() + "'s salary: " + w.getSalary());
            w.work();
        }

        System.out.println(m1.getName() + "'s salary: " + m1.getSalary());
        m1.work();
    }
}
