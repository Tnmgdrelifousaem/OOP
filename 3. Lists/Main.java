import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyLinkedList Card = new MyLinkedList();

        Card.addFirst("6 треф");
        Card.addFirst("Туз пик");
        Card.addFirst("Король треф");
        Card.addFirst("Дама буби");
        
        for (String card : Card) {
            System.out.println(card);
        }

        Employee worker1 = new Employee("Илья", 23, 55000);
        Employee worker2 = new Employee("Петр", 45, 40000);
        Employee worker3 = new Employee("Евгений", 45, 56000);
        Employee worker4 = new Employee("Петр", 23, 32000);

        if (worker1.compareTo(worker2) == 1) {
            System.out.format("Возраст %s больше возраста %s", worker1.getName(), worker2.getName());
        } else {
            System.out.format("Возраст %s меньше возраста %s", worker1.getName(), worker2.getName());
        }

        System.out.println();

        ArrayList<Employee> listWorker = new ArrayList<>(List.of(worker1,worker2,worker3,worker4));

        Collections.sort(listWorker, new EmployeeSalaryComparator());

        for (Employee employee : listWorker) {
            System.out.println(employee);
        }

    }
}
