package CompanyAssignment.StreamTask;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.*;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        //create salary of emp1
        List<Salary> listOfEmp1Sal=new ArrayList<>();
        Salary emp1Sal1=new Salary(1,15000,LocalDate.of(2023,3,1));
        Salary emp1Sal2=new Salary(2,20000,LocalDate.of(2023,4,1));
        Salary emp1Sal3=new Salary(3,26000,LocalDate.of(2023,5,1));
        Salary emp1Sal4=new Salary(4,26000,LocalDate.of(2023,6,1));
        Salary emp1Sal5=new Salary(5,27000,LocalDate.of(2023,7,1));
        Salary emp1Sal6=new Salary(6,32000,LocalDate.of(2023,8,1));
        Salary emp1Sal7=new Salary(7,31000,LocalDate.of(2023,9,1));
        Salary emp1Sal8=new Salary(8,32000,LocalDate.of(2023,10,1));
        Salary emp1Sal9=new Salary(9,28500,LocalDate.of(2023,11,1));
        Salary emp1Sal10=new Salary(10,32300,LocalDate.of(2023,12,1));
        Salary emp1Sal11=new Salary(11,33500,LocalDate.of(2024,1,1));

        //Adding salary to emp1 list
        listOfEmp1Sal.add(emp1Sal1);listOfEmp1Sal.add(emp1Sal2);
        listOfEmp1Sal.add(emp1Sal3);listOfEmp1Sal.add(emp1Sal4);
        listOfEmp1Sal.add(emp1Sal5);listOfEmp1Sal.add(emp1Sal6);
        listOfEmp1Sal.add(emp1Sal7);listOfEmp1Sal.add(emp1Sal8);
        listOfEmp1Sal.add(emp1Sal9);listOfEmp1Sal.add(emp1Sal10);
        listOfEmp1Sal.add(emp1Sal11);

        Employee emp1=new Employee(11,"Rahul Kumar",listOfEmp1Sal,3,2023,"Tech Mahindra");

        //create list of salary of emp2
        List<Salary> listOfEmp2Sal=new ArrayList<>();
        Salary emp2Sal1=new Salary(211,21000,LocalDate.of(2023,5,1));
        Salary emp2Sal2=new Salary(212,23000,LocalDate.of(2023,6,1));
        Salary emp2Sal3=new Salary(213,25000,LocalDate.of(2023,7,1));
        Salary emp2Sal4=new Salary(214,28000,LocalDate.of(2023,8,1));
        Salary emp2Sal5=new Salary(215,29000,LocalDate.of(2023,9,1));
        Salary emp2Sal6=new Salary(216,32000,LocalDate.of(2023,10,1));
        Salary emp2Sal7=new Salary(217,34500,LocalDate.of(2023,11,1));
        Salary emp2Sal8=new Salary(218,33500,LocalDate.of(2023,12,1));
        Salary emp2Sal9=new Salary(219,35500,LocalDate.of(2024,1,1));

        //Adding salary to emp2 list
        listOfEmp2Sal.add(emp2Sal1);listOfEmp2Sal.add(emp2Sal2);
        listOfEmp2Sal.add(emp2Sal3);listOfEmp2Sal.add(emp2Sal4);
        listOfEmp2Sal.add(emp2Sal5);listOfEmp2Sal.add(emp2Sal6);
        listOfEmp2Sal.add(emp2Sal7);listOfEmp2Sal.add(emp2Sal8);
        listOfEmp2Sal.add((emp2Sal9));

        Employee emp2=new Employee(21,"Shivani Singh",listOfEmp2Sal,5,2023,"RX Logix");

        //create list of salary of emp3
        List<Salary> listOfEmp3Sal=new ArrayList<>();
        Salary emp3Sal1=new Salary(251,25500,LocalDate.of(2023,6,1));
        Salary emp3Sal2=new Salary(252,24000,LocalDate.of(2023,7,1));
        Salary emp3Sal3=new Salary(253,33000,LocalDate.of(2023,8,1));
        Salary emp3Sal4=new Salary(254,30500,LocalDate.of(2023,9,1));
        Salary emp3Sal5=new Salary(255,26800,LocalDate.of(2023,10,1));
        Salary emp3Sal6=new Salary(256,36300,LocalDate.of(2023,11,1));
        Salary emp3Sal7=new Salary(257,31500,LocalDate.of(2023,12,1));
        Salary emp3Sal8=new Salary(258,32500,LocalDate.of(2024,1,1));

        //Adding salary to emp3 list
        listOfEmp3Sal.add(emp3Sal1);listOfEmp3Sal.add(emp3Sal2);
        listOfEmp3Sal.add(emp3Sal3);listOfEmp3Sal.add(emp3Sal4);
        listOfEmp3Sal.add(emp3Sal5);listOfEmp3Sal.add(emp3Sal6);
        listOfEmp3Sal.add(emp3Sal7);listOfEmp3Sal.add(emp3Sal8);

        Employee emp3=new Employee(25,"Mohit Singh",listOfEmp3Sal,6,2023,"Tech Mahindra");

        //create list of salary of emp4
        List<Salary> listOfEmp4Sal=new ArrayList<>();
        Salary emp4Sal1=new Salary(51,22000,LocalDate.of(2023,8,1));
        Salary emp4Sal2=new Salary(52,24000,LocalDate.of(2023,9,1));
        Salary emp4Sal3=new Salary(53,24500,LocalDate.of(2023,10,1));
        Salary emp4Sal4=new Salary(54,26500,LocalDate.of(2023,11,1));
        Salary emp4Sal5=new Salary(55,27000,LocalDate.of(2023,12,1));
        Salary emp4Sal6=new Salary(56,28000,LocalDate.of(2024,1,1));

        //Adding salary to emp4 list
        listOfEmp4Sal.add(emp4Sal1);listOfEmp4Sal.add(emp4Sal2);
        listOfEmp4Sal.add(emp4Sal3);listOfEmp4Sal.add(emp4Sal4);
        listOfEmp4Sal.add(emp4Sal5);listOfEmp4Sal.add(emp4Sal6);

        Employee emp4=new Employee(5,"Priya Gupta",listOfEmp4Sal,8,2023,"RX Logix");

        //Adding Employee to employee list
        List<Employee> empList= Arrays.asList(emp1,emp2,emp3,emp4);

        //Q1. In the last 6 months calculate the total sum of salaries given by each company
        System.out.println("\nQ1. In the last 6 months calculate the total sum of salaries given by each company: ");
        LocalDate currentDate=LocalDate.now().minusMonths(7);
        Map<String, Integer> sumOfSalOfEachComp = empList.stream()
                .collect(Collectors.groupingBy(Employee::getCompany,
                        Collectors.flatMapping(emp -> emp.getSalList().stream(),
                                Collectors.filtering(sal ->sal.getDate().isAfter(currentDate),
                                        Collectors.summingInt(Salary::getSalary )))));
        System.out.println("Total sum of salaries in the last 6 months given by each company: ");
        sumOfSalOfEachComp.forEach((k, v) -> System.out.println(k + " : " + v));

//        int checkForMonth= (currentMonth<=6?currentMonth+6:currentMonth-6);
//        int currYear=LocalDate.now().getYear();
//        int prevYear=currYear-1;
//        Map<String, Integer> sumOfSalOfEachComp = empList.stream()
//                .collect(Collectors.groupingBy(Employee::getCompany,
//                        Collectors.flatMapping(emp -> emp.getSalList().stream(),
//                                Collectors.filtering(sal -> (checkForMonth>=8?(sal.getMonth()>=checkForMonth ||
//                                        sal.getMonth()<checkForMonth-6):(sal.getMonth()>=checkForMonth)) &&
//                                                (sal.getYear()==prevYear || sal.getYear()==currYear),
//                                        Collectors.summingInt(Salary::getSalary)))));



//         Q2. Each month top salary of the employees
        String []month={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sept","Oct","Nov","Dec"};
        Map<String, Integer> topSalariesByMonth = empList.stream()
                .flatMap(emp -> emp.getSalList().stream())
                .collect(Collectors.toMap(s->month[s.getDate().getMonthValue()-1], Salary::getSalary,
                        BinaryOperator.maxBy(Integer::compare),TreeMap::new));
        System.out.println("\nQ2. Each month top salary of the employees:");
        System.out.println(topSalariesByMonth);


//       Q3. Month wise percentage growth of salaries for each employee
       Map<String, Map<Integer, String>> percentageGrowthByEmployee = empList.stream()
                .collect(Collectors.toMap(
                        Employee::getName,
                        emp -> calculatePercentageGrowth(emp.getSalList()),
                        (oldValue, newValue) -> oldValue,
                        LinkedHashMap::new
                ));

        System.out.println("\nQ3. Month wise percentage growth of salaries for each employee:");
        System.out.println(percentageGrowthByEmployee);

//    Q4 Make a list of all the employees in this format
        List<String> listInFormat = empList.stream()
                .map(e -> e.getId() + "_" + e.getName() + "_" + sumOfSalary(e.getSalList()) + "_" + e.getCompany())
                .collect(Collectors.toList());

        System.out.println("\nQ4. List of all the employees in the given format:");
        System.out.println(listInFormat);

        //Q5. Now make two lists which contains the employees of only that company.
        Map<String, List<String>> companyMap = empList.stream().collect(Collectors.groupingBy(c -> c.getCompany(),
                Collectors.mapping(e -> e.getId() + "_" + e.getName() + "_" + sumOfSalary(e.getSalList()) + "_" + e.getCompany(),
                        Collectors.toList())));

        System.out.println("\nQ5. List of all employees Companywise:");
        for(List<String> l:companyMap.values()){
            System.out.println(l);
        }

//     Q6. Company Wise map which shows the max salary given by the company each month
        Map<String, TreeMap<String, Integer>> comMaxSal = empList.stream()
                .collect(Collectors.groupingBy(Employee::getCompany,
                        Collectors.flatMapping(emp -> emp.getSalList().stream(),
                                Collectors.toMap((sal) -> sal.getDate().getYear()+"-"+month[sal.getDate().getMonthValue()-1],
                                        Salary::getSalary, BinaryOperator.maxBy(Integer::compare), TreeMap::new))));
        System.out.println("\nQ.6 Company Wise map which shows the max salary given by the company each month:");
        comMaxSal.forEach((k, v) -> System.out.println(k + " " + v));

    }

    private static Map<Integer, String> calculatePercentageGrowth(List<Salary> salaries) {
        Map<Integer, String> growthMap = new LinkedHashMap<>();
        growthMap.put(salaries.get(0).getDate().getMonthValue(), "100%");
        for (int i = 1; i < salaries.size(); i++) {
            Salary prevSalary = salaries.get(i - 1);
            Salary currSalary = salaries.get(i);
                double growth = ((double) (currSalary.getSalary() - prevSalary.getSalary()) / prevSalary.getSalary()) * 100;
                growthMap.put(currSalary.getDate().getMonthValue(), String.format("%.2f",growth)+"%");
        }
        return growthMap;
    }

    private static Integer sumOfSalary(List<Salary>listSal){
       return listSal.stream().collect(Collectors.summingInt(x->x.getSalary()));
    }


}
