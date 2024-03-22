import java.util.Comparator;

public class EmployeeSalaryComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        return Integer.compare(o1.getSolary(), o2.getSolary());
    }
    
}
