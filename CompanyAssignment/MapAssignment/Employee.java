package CompanyAssignment.MapAssignment;
import java.time.LocalDate;
import java.util.*;

public class Employee {
    private String id;
    private String name;
    private LocalDate dob;
    private Map<String,Salary> salMap;
    private Address add;
    private Map<String,Double> yearlyMap;
    public Employee(String id, String name, LocalDate dob, Map<String, Salary> salMap, Address add) {
        if(id==null || id.equals("") || name==null || name.equals("") || salMap==null || add==null)
            throw new IllegalArgumentException("Please enter valid details");
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.salMap=salMap ;
        this.add = add;
        this.yearlyMap=intializedYearlyMap();

    }
    public Address getAddReference(){
        return add;
    }
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getTotalSalary() {
        double sum = 0;
        for (Salary s : salMap.values()) {
            sum += s.getSalary();
        }
        return sum;

    }
    public Map<String,Double> getYearlyMap(){
        return yearlyMap;
    }

    public Map<String ,Double> intializedYearlyMap(){
        Map<String,Double> m=new HashMap<>();
        for (Map.Entry<String,Salary> e:salMap.entrySet()){
            String k=extractYear(e.getKey());
            Double sal=e.getValue().getSalary();
            m.put(k,m.getOrDefault(k,0.0)+sal);
        }
        return m;
    }
    private String extractYear(String monthYear) {
        String[] parts = monthYear.split("-");
        return parts[1];
    }

        @Override
    public String toString() {
        return "id: "+id+", name: "+ name;
    }
}



