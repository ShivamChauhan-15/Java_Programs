package CompanyAssignment.StreamTask;

import java.util.List;

public class Employee {
        private int id;
        private String name;
        private List<Salary> salary;
        private int monthJoined;
        private int year;
        private String company;

    public Employee(int id, String name, List<Salary> salary, int monthJoined, int year, String company) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.monthJoined = monthJoined;
        this.year = year;
        this.company = company;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Salary> getSalList() {
        return salary;
    }

    public int getMonthJoined() {
        return monthJoined;
    }

    public int getYear() {
        return year;
    }

    public String getCompany() {
        return company;
    }
}
