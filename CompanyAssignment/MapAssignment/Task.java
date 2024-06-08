package CompanyAssignment.MapAssignment;
import java.time.LocalDate;
import java.util.*;

public class Task {
    public static void main(String[] args) {
        Address addemp1 = new Address("1A", "Newdelhi", "Delhi", "India", "15-A Rajiv Chowk");
        Address addemp2 = new Address("2B", "Ottawa", "Ontario", "Canada", "G-6 Ottawa");
        Address addemp3 = new Address("3C", "Noida", "UttarPradesh", "India", "G-48 Bishanpura");
        Address addemp4 = new Address("4D", "Noida", "UttarPradesh", "India", "G-48 Bishanpura");

        Map<String, Salary> salMapE1 = new HashMap<>();
        Salary sal1 = new Salary("1A", LocalDate.of(2021, 1, 2), 50000, 10000, 8000, 5000);
        Salary sal2 = new Salary("1A", LocalDate.of(2022, 2, 3), 60000, 12000, 9000, 6000);
        Salary sal3 = new Salary("1A", LocalDate.of(2021, 4, 2), 25000, 11000, 7000, 6500);
        salMapE1.put("jan-21", sal1);
        salMapE1.put("mar-22", sal2);
        salMapE1.put("april-21", sal3);

        Map<String, Salary> salMapE2 = new HashMap<>();
        Salary sal4 = new Salary("2B", LocalDate.of(2023, 6, 2), 30000, 9000, 8500, 5500);
        Salary sal5 = new Salary("2B", LocalDate.of(2022, 2, 3), 60000, 12000, 9000, 6000);
        salMapE2.put("feb-22", sal5);
        salMapE2.put("jun-23", sal4);


        Map<String, Salary> salMapE3 = new HashMap<>();
        Salary sal6 = new Salary("3C", LocalDate.of(2022, 2, 3), 60000, 12000, 9000, 6000);
        Salary sal7 = new Salary("3C", LocalDate.of(2023, 3, 3), 40000, 8000, 6000, 4500);
        Salary sal8 = new Salary("3C", LocalDate.of(2023, 6, 2), 30000, 9000, 8500, 5500);
        salMapE3.put("mar-23", sal7);
        salMapE3.put("feb-22", sal6);
        salMapE3.put("jun-23", sal8);

        Map<String, Salary> salMapE4 = new HashMap<>();
        Salary sal9 = new Salary("4D", LocalDate.of(2021, 4, 2), 25000, 11000, 7000, 6500);
        Salary sal10 = new Salary("4D", LocalDate.of(2022, 7, 2), 45000, 8500, 6500, 4600);
        salMapE4.put("apr-21", sal9);
        salMapE4.put("jul-22", sal10);


        Employee emp1 = new Employee("1A", "Rohan", LocalDate.of(2000, 04, 05), salMapE1, addemp1);
        Employee emp2 = new Employee("2B", "Mohit", LocalDate.of(2001, 06, 15), salMapE2, addemp2);
        Employee emp3 = new Employee("3C", "Naman", LocalDate.of(2002, 01, 10), salMapE3, addemp3);
        Employee emp4 = new Employee("4D", "Sohan", LocalDate.of(1998, 10, 01), salMapE4, addemp4);

        List<Employee> empList = new ArrayList<>();
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        empList.add(emp4);

        if(empList.isEmpty())
            throw new IllegalArgumentException("Add employee to the list");

        //(1)Sum of Salary who live in the same city
        System.out.println("(1)Sum of Salary who live in the same city:");
        checkCity(empList);


        //(2)Groupby employee who have same salary
        System.out.println("\n(2)Groupby employee who have same salary: ");
        groupEmployeesByYearly(empList);

        //(3)Average of Salary by State and Yearly
        System.out.println("\n(3)Average of Salary by State and Yearly: ");
        calAvgSalYearly(empList);

        //(4)Number of Employees who have same address
        System.out.println("\n(4)Number of Employees who have same address:");
        checkAdd(empList);
        //(5)Employee TDS from Salary Yearly
        System.out.println("\n(5)Employee TDS/TAX from Salary Yearly:");
        calculateTDS(empList);

        //(6)Sort Employee by salary
        System.out.println("(6)Sort Employee by Salary:");
        sortSal(empList);

        //(7)Sort Employee by address
        System.out.println("\n(7)Sorting of employee by address: ");
        addSort(empList);

        //(8)Employee live in the same country
        System.out.println("\n(8)Number of Employees who live in the same country: ");
        sameCountry(empList);

        //(9)Sum of Employee(Salary) between 20k-2lakh
        System.out.println("\n(9)Employees who have salary between 20k and 2lakh:");
        salRange(empList);
        //(10)Sum of salary and employee count by State
        System.out.println("\n(10)Sum of Salary and employee count by state: ");
        stateSalEmpCount(empList);

    }

    //(1)Sum of Salary who live in the same city
    public static void checkCity(List<Employee>eList){
        Map<String,Double>mapSal=new HashMap<>();
        Map<String,Integer>mapCount=new HashMap<>();
        for(Employee e: eList){
            String k=e.getAddReference().getCity().toLowerCase();
            mapSal.put(k,mapSal.getOrDefault(k,0.0)+ e.getTotalSalary());
            mapCount.put(k,mapCount.getOrDefault(k,0)+1);
        }
        for(Map.Entry<String,Integer>m:mapCount.entrySet()){
            if(m.getValue()>1)
                System.out.println(m.getKey()+" : "+mapSal.get(m.getKey()));
        }
    }

    //(2)Groupby employee who have same salary
    public static void groupEmployeesByYearly(List<Employee> eList) {
        Map<String, List<Employee>> groupedBySalary = new HashMap<>();

        for (Employee emp : eList) {
            for (Map.Entry<String, Double> entry : emp.getYearlyMap().entrySet()) {
                double salaryKey = entry.getValue();
                String key= entry.getKey()+ " "+salaryKey;
                groupedBySalary.computeIfAbsent(key, k -> new ArrayList<>()).add(emp);
            }
        }
        for(Map.Entry<String,List<Employee>> m:groupedBySalary.entrySet()){
            if(m.getValue().size()>1)
                System.out.println("20"+m.getKey()+" : "+m.getValue());
        }

    }

    //(3)Average of Salary by State and Yearly
    public static void calAvgSalYearly(List<Employee>eList){
        Map<String,Double>salMap=new HashMap<>();
        Map<String,Integer>countMap=new HashMap<>();
        for(Employee e:eList){
            for(Map.Entry<String,Double> m:e.getYearlyMap().entrySet()){
                String key=e.getAddReference().getState().toLowerCase()+" "+ m.getKey();
                salMap.put(key,salMap.getOrDefault(key,0.0)+m.getValue());
                countMap.put(key,countMap.getOrDefault(key,0)+1);
            }
        }
        for(Map.Entry<String,Double> e:salMap.entrySet()){
            System.out.println(e.getKey()+" : "+e.getValue()/countMap.get(e.getKey()));
        }
    }

    //(4)Number of Employees who have same address
    public static void checkAdd(List<Employee>eList){
        Map<String,Integer> map=new HashMap<>();
        for(Employee e:eList){
            String k=e.getAddReference().getAddress().toLowerCase();
            map.put(k,map.getOrDefault(k,0)+1);
        }
        for(Map.Entry<String,Integer>m: map.entrySet()){
            if(m.getValue()>1)
                System.out.println(m.getKey()+" : "+ m.getValue());
        }
    }

    //(5)Employee TDS from Salary Yearly
    public static void calculateTDS(List<Employee> eList){
        for(Employee e:eList){
            System.out.println("For "+e.getId()+", "+e.getName());
            for(Map.Entry<String,Double> m: e.getYearlyMap().entrySet()){
                double tds=m.getValue()*30/100;
                System.out.println("In 20"+m.getKey()+" TDS is: "+tds);
            }
            System.out.println();
        }
    }

    //(6)Sort Employee by salary
    public static void sortSal(List<Employee> eList){
        Collections.sort(eList,new CustomComparator(2));
        for(Employee e:eList){
            System.out.println(e.getId()+", "+e.getName()+" : "+e.getTotalSalary());
        }
    }

    //(7)Sort Employee by address
    public static void addSort(List<Employee> empList){
        Collections.sort(empList,new CustomComparator(1));
        for(Employee e:empList){
            System.out.println(e.getId()+", "+e.getName()+", "+e.getAddReference().getAddress());
        }
    }

    //(8)Employee who have same country
    public static void sameCountry(List<Employee> eList){
        HashMap<String,Integer> map=new HashMap<>();
        for(Employee e:eList){
            String k=e.getAddReference().getCountry().toLowerCase();
            map.put(k,map.getOrDefault(k,0)+1);
        }
        for(Map.Entry<String,Integer> m:map.entrySet()){
            if(m.getValue()>1)
                System.out.println(m.getKey()+": "+m.getValue());
        }
    }

    //(9)Sum of Employee(Salary) between 20k-2lakh
    public static void salRange(List<Employee>eList){
        Map<String,List<Employee>>mapCount=new HashMap<>();
        for(Employee e:eList){
            Map<String,Double>empMap=e.getYearlyMap();
            for(Map.Entry<String,Double> m:empMap.entrySet()){
                if(m.getValue()>20000 && m.getValue()<200000){
                    mapCount.computeIfAbsent(m.getKey(), k -> new ArrayList<>()).add(e);
                }
            }
        }
        for(Map.Entry<String,List<Employee>>m:mapCount.entrySet()){
            System.out.println("In 20"+m.getKey()+" : "+m.getValue());
        }
    }

    //(10)sum of salary and employee count by state
    public static void stateSalEmpCount(List<Employee> eList){
        HashMap<String,Double> salmap=new HashMap<>();
        HashMap<String,Integer> statemap=new HashMap<>();
        for(Employee e:eList){
            String k=e.getAddReference().getState().toLowerCase();
            salmap.put(k, salmap.getOrDefault(k, 0.0) + e.getTotalSalary());
            statemap.put(k, statemap.getOrDefault(k, 0) + 1);
        }
        for(Map.Entry<String,Double> m:salmap.entrySet()){
            System.out.println(m.getKey()+": Sum of Salary: "+m.getValue()+", Employee count: "+statemap.get(m.getKey()));
        }
    }
}