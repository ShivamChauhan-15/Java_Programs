package CompanyAssignment.StreamTask;

import java.time.LocalDate;

public class Salary {
    private int id;
    private int salary;
    LocalDate date;

    public Salary(int id, int salary, LocalDate date) {
        this.id = id;
        this.salary = salary;
        this.date=date;
    }
    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

   public LocalDate getDate(){
        return date;
   }
}
