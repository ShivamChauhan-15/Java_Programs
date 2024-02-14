package CollectorsClass;

import java.util.ArrayList;
import java.util.*;
import java.util.stream.Collectors;

class Employee{
    String country;
    String state;
    String city;
    String name;

    public Employee( String name,String country, String state, String city) {
        this.name = name;
        this.country = country;
        this.state = state;
        this.city = city;
    }
    String getName(){
        return name;
    }
    String getCountry(){
        return country;
    }
    String getState(){
        return state;
    }
    String getCity(){
        return city;
    }
}
public class MultipleGroupByExample {
    public static void main(String[] args) {
        Employee e1=new Employee("Shivam","India","UP","Noida");
        Employee e2=new Employee("Rahul","Canada","XY","Efg");
        Employee e3=new Employee("Atul","India","UP","Noida");
        Employee e4=new Employee("Mohit","India","UP","Noida");
        Employee e5=new Employee("Robin","America","PQ","Abc");
        Employee e6=new Employee("Rohini","America","PQ","Abc");
        Employee e7=new Employee("Rohan","India","UP","Ghaziabad");
        List<Employee>l= Arrays.asList(e1,e2,e3,e4,e5,e6,e7);
        Map<String, Map<String, Map<String, Long>>> collect = l.stream().collect(Collectors.groupingBy(
                x -> x.getCountry(),
                Collectors.groupingBy(x -> x.getState(),
                        Collectors.groupingBy(x -> x.getCity(),
                                TreeMap::new,
                                Collectors.counting())
                )
        ));
        System.out.println(collect);
    }
}