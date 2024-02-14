package CompanyAssignment;

import java.util.*;

class Employee1 implements Comparable<Employee1> {
    private double sal;
    private int id;
    private int month;
    private int year;
    private String name;
    private String companyName;

    public Employee1(int id, double sal, int month, int year, String name, String companyName) {
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
    public int compareTo(Employee1 other) {
        return this.name.compareTo(other.name);  // Default sorting by name
    }
}

public class LinkedListTask {
    public static void main(String[] args) {
        List<Employee1> emp = new LinkedList<>();

        // Add some employees to the list (you can add more as needed)
        emp.add(new Employee1(1, 35000, 1, 2023,"Rahul Kumar", "TCS"));
        emp.add(new Employee1(2, 40000, 6, 2023,"Mohit Sharma", "Accenture"));
        emp.add(new Employee1(3, 60000, 5, 2023,"Sonali Singh", "HCL"));
        emp.add(new Employee1(4, 50000, 8, 2023,"Simran Gupta", "TCS"));
        emp.add(new Employee1(5, 650000, 9, 2023,"Sumit Gupta", "HCL"));


        // Sum of Salary
        double sumOfSalary = 0;
        for (Employee1 e : emp) {
            sumOfSalary += e.getSal();
        }
        System.out.println("Sum of Salary: " + sumOfSalary);

        LinkedList<String> comp = new LinkedList<>();
        for (Employee1 e : emp) {
            if (!comp.contains(e.getCompanyName()))
                comp.add(e.getCompanyName());
        }

        // Average Salary in a year
        double salCount=0.0;
        int empCount=0;
        int yr=2023;
        for(Employee1 e:emp){
            if(e.getYear()==yr){
                salCount+=e.getSal();
                empCount++;
            }
        }
        double avSal=salCount/empCount;
        if(empCount>0)
            System.out.printf("\nAverage Salary Of Employees of %d is : %,.2f\n",yr,avSal);
        else
            System.out.printf("\nAverage Salary Of Employees of %d is : %,.2f\n",yr,avSal);

        // Sum of Salary by Company
        System.out.println("Sum of Salaries by Company:");
        for(String c:comp){
            double sal=0;
            for(Employee1 e:emp){
                if(c.equals(e.getCompanyName()))
                    sal+=e.getSal();
            }
            System.out.println(c+": "+ sal);
        }

        // June Month Credited Salaried Employee
        for (Employee1 e: emp) {
            if (e.getMonth()==6 && e.getYear()==2023) {
                System.out.println("\nJune Month Credited Salaried Employee: Id:"+ e.getId()+"  "+ e.getName());
            }
        }


        // Sorting by Name (Default)
        Collections.sort(emp);
        System.out.println("\nSorting by Name (Default): ");
        for (Employee1 e : emp)
            System.out.println("Id:" + e.getId() + " " + e.getName());

        // Sorting by Salary (Ascending)
        System.out.println("\nSorted in Increasing Order of Salary:");
        Comparator<Employee1> asc = new Comparator<>() {
            @Override
            public int compare(Employee1 emp1, Employee1 emp2) {
                return Double.compare(emp1.getSal(), emp2.getSal());
            }
        };
        Collections.sort(emp, asc);
        for (Employee1 e : emp)
            System.out.println("Id:" + e.getId() + ", " + e.getName() + ", Salary: " + e.getSal());

        // Sorting by Salary (Descending)
        System.out.println("\nSorted in Decreasing Order of Salary:");
        Comparator<Employee1> des = new Comparator<>() {
            @Override
            public int compare(Employee1 emp1, Employee1 emp2) {
                return Double.compare(emp2.getSal(), emp1.getSal());
            }
        };
        Collections.sort(emp, des);
        for (Employee1 e : emp)
            System.out.println("Id:" + e.getId() + ", " + e.getName() + ", Salary: " + e.getSal());
    }
}
