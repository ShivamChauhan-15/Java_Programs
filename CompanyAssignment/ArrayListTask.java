package CompanyAssignment;

import java.util.*;

class Employee implements Comparable<Employee> {
    private double sal;
    private int id;
    private int month;
    private int year;
    private String name;
    private String companyName;

    public Employee(int id, double sal, int month, int year, String name, String companyName) {
        this.id = id;
        this.sal = sal;
        this.month = month;
        this.year = year;
        this.name = name;
        this.companyName = companyName;
    }

    public double getSal() {
        return sal;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getId() {
        return id;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Employee other) {
        return this.name.compareTo(other.name);  // Default sorting by name
    }
}

public class ArrayListTask {
    public static void main(String[] args) {
        List<Employee> emp = new ArrayList<>();

        // Add some employees to the list (you can add more as needed)
        emp.add(new Employee(1, 35000, 1, 2023,"Rahul Kumar", "TCS"));
        emp.add(new Employee(2, 40000, 6, 2023,"Mohit Sharma", "Accenture"));
        emp.add(new Employee(3, 60000, 5, 2023,"Sonali Singh", "HCL"));
        emp.add(new Employee(4, 50000, 8, 2023,"Simran Gupta", "TCS"));
        emp.add(new Employee(5, 650000, 9, 2023,"Sumit Gupta", "HCL"));

        // Sum of Salary
        double sumOfSalary = 0;
        for (Employee e : emp) {
            sumOfSalary += e.getSal();
        }
        System.out.println("Sum of Salary: " + sumOfSalary);

        ArrayList<String> comp=new ArrayList<>();
        for(Employee e:emp){
            if(!comp.contains(e.getCompanyName()))
                comp.add(e.getCompanyName());
        }

        // Average Salary in a year
        double avSal=sumOfSalary*12/ emp.size();
        System.out.printf("\nAverage Salary Of Companies(Yearly): %,.2f\n",avSal);


        // Sum of Salary by Company
        System.out.println("Sum of Salaries by Company:");
        for(String c:comp){
            double sal=0;
            for(Employee e:emp){
                if(c.equals(e.getCompanyName()))
                    sal+=e.getSal();
            }
            System.out.println(c+": "+ sal);
        }


        // June Month Credited Salaried Employee
        for (Employee e: emp) {
            if (e.getMonth()==6 && e.getYear()==2023) {
                System.out.println("\nJune Month Credited Salaried Employee: Id:"+ e.getId()+"  "+ e.getName());
            }
        }

        // Sorting by Name (Default)
        Collections.sort(emp);
        System.out.println("\nSorting by Name (Default): ");
        for(Employee e:emp)
            System.out.println("Id:"+e.getId()+" "+e.getName());

        // Sorting by Salary (Ascending)
        System.out.println("\nSorted in Increasing Order of Salary:");
        Comparator<Employee> asc=new Comparator<>() {
            @Override
            public int compare(Employee emp1, Employee emp2) {
                return Double.compare(emp1.getSal(), emp2.getSal());
            }
        };
        Collections.sort(emp,asc);
        for(Employee e:emp)
            System.out.println("Id:"+e.getId()+", "+e.getName()+", Salary: "+e.getSal());


        // Sorting by Salary (Descending)
        System.out.println("\nSorted in Decreasing Order of Salary:");
        Comparator<Employee> des=new Comparator<>() {
            @Override
            public int compare(Employee emp1, Employee emp2) {
                return Double.compare(emp2.getSal(), emp1.getSal());
            }
        };
        Collections.sort(emp,des);
        for(Employee e:emp)
            System.out.println("Id:"+e.getId()+", "+e.getName()+", Salary: "+e.getSal());
    }
}
