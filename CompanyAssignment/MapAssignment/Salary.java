package CompanyAssignment.MapAssignment;

import java.time.LocalDate;

public class Salary {
    private String id;
    private LocalDate date;
    private double basic;
    private double hra;
    private double da;
    private double epf;
    public Salary(String id, LocalDate date, double basic, double hra, double da, double epf) {
        if (date == null) {
            throw new IllegalArgumentException("Date cannot be null");
        }
        this.id = id;
        this.date = date;
        this.basic = basic;
        this.hra = hra;
        this.da = da;
        this.epf = epf;
    }
    public double getSalary(){
        return basic+hra+da+-epf;
    }

    public double getHra(){
        return hra;
    }
    public double getDa(){
        return da;
    }
    public double getEpf(){
        return epf;
    }
}
