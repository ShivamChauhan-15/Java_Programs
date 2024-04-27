package StreamExample;

import java.util.ArrayList;
import java.util.List;

class Employee{

    String city;
    int salary;
    int empCount;
    Employee(String city,int salary,int empCount){
        this.city=city;
        this.salary=salary;
        this.empCount=empCount;
    }
    public String getCity(){
        return city;
    }
    public int getSalary(){
        return salary;
    }
    public int getEmpCount(){
        return empCount;
    }
}

public class Practice2 {
    public static void main(String[] args) {
        Employee e1=new Employee("Noida",10000,10);
        Employee e2=new Employee("Delhi",20000,5);
        Employee e3=new Employee("Noida",15000,20);
        Employee e4=new Employee("Delhi",10000,15);
        List<Employee> empList=new ArrayList<>();
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);

    }
}
