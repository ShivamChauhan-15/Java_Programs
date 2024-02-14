package CompanyAssignment.MapAssignment;

import java.util.Comparator;

public class CustomComparator implements Comparator<Employee> {
    private Integer choice;
    CustomComparator(){
        throw new IllegalArgumentException("Invalid Argument");
    }
    CustomComparator(Integer choice){
        this.choice=choice;
    }
    @Override
    public int compare(Employee e1, Employee e2) {
        switch (choice){
            case 1: return e1.getAddReference().getAddress().toLowerCase().compareTo(e2.getAddReference().getAddress().toLowerCase());
            case 2: return Double.compare(e1.getTotalSalary(),e2.getTotalSalary());
            default: throw new IllegalArgumentException("Invalid choice");
        }
    }
}
