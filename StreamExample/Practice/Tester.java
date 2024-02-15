package StreamExample.Practice;
import java.util.*;
import java.util.stream.Collectors;

public class Tester {
    static int count=0;
    public static void main(String[] args) {
    EmployeeFactory empRaw=new EmployeeFactory();
        List<Employee> allEmployee = empRaw.getAllEmployee();
//        System.out.println(allEmployee.stream().flatMap(employee -> employee.getProjects().stream())
//                        .distinct()
//                .collect(Collectors.toList()));

//        allEmployee.stream()
//                .filter(e->e.getFirstName().startsWith("A"))
//                .forEach(System.out::println);
//
//        allEmployee.stream()
//                .sorted(Comparator.comparing(Employee::getFirstName).thenComparing(Employee::getSalary))
//                .forEach(System.out::println);

        //Q5. Print names of all employee with 3rd highest salary. (generalise it for nth highest salary).
        System.out.println("\nQ5. Print names of all employee with 3rd highest salary. (generalise it for nth highest salary).\n");
        List<Integer> salList = allEmployee.stream().map(e -> e.getSalary()).collect(Collectors.toList());
        System.out.println("Salary of employees: "+salList);

//        allEmployee.stream()
//                .collect(Collectors
//                        .groupingBy(e -> e.getSalary(), ()->new TreeMap<>(Collections.reverseOrder()),
//                                Collectors.toList())).forEach((k,v)->{
//                                    if(++count==3){
//                                        System.out.println(k+" : "+v);
//                                        System.exit(0);
//                                    }
//                });

        //Q6. Min salary
        System.out.println("\nMinimum Salary:");
        Integer minSalary = allEmployee.stream()
                .map(e -> e.getSalary()).min(Integer::compareTo).orElse(0);
        System.out.println(minSalary);

        //Q7. Print list of all employee with min salary
        allEmployee.stream()
                .collect(Collectors.groupingBy(Employee::getSalary, Collectors.toList()))
                .entrySet().stream()
                .min((e1, e2) -> Integer.compare(e1.getKey(), e2.getKey()))
                .ifPresent(entry -> entry.getValue().forEach(System.out::println));

        //Q8. List of people working on more than 2 projects
        System.out.println("\nList of people working on more than 2 projects:");
        List<Employee> list = allEmployee.stream()
                .filter(e -> e.getProjects().size() > 2)
                .collect(Collectors.toList());
        System.out.println(list);

        //Q9. Count of total laptops assigned to the employees
        System.out.println("\nCount of total laptops assigned to the employees: ");
        Integer count = allEmployee.stream()
                .map(Employee::getTotalLaptopsAssigned).mapToInt(i -> i.intValue()).sum();
        System.out.println(count);

        //Q10. Count of all projects with Robert Downey Jr as PM
        System.out.println("\nCount of all projects with Robert Downey Jr as PM: ");
        long countPM = allEmployee.stream()
                .flatMap(e -> e.getProjects().stream())
                .filter(project -> project.getProjectManager().equals("Robert Downey Jr"))
                .count();
        System.out.println(countPM);

        //Q11. List of all projects with Robert Downey Jr as PM
        System.out.println("\nList of all projects with Robert Downey Jr as PM:");
        List<Project> listOfSamePM = allEmployee.stream()
                .flatMap(e -> e.getProjects().stream())
                .filter(project -> project.getProjectManager().equals("Robert Downey Jr"))
                .collect(Collectors.toList());
        System.out.println(listOfSamePM);

        //Q12. List of all people working with Robert Downey Jr
        System.out.println("\nList of all people working with Robert Downey Jr:");
        List<Employee> listOfEmpWorkWithRobert = allEmployee.stream()
                .filter(e -> e.getProjects().stream().anyMatch(project -> project.getProjectManager().equals("Robert Downey Jr")))
                .collect(Collectors.toList());
        System.out.println(listOfEmpWorkWithRobert);

        //13. Create a map based on this data, the key should be the year of joining,
        // and value should be list of all the employees who joined the particular year.
        System.out.println("\nCreate a map based on this data, they key should be the year of joining " +
                "and value should be list of all the employees who joined the particular year");
        allEmployee.stream()
                .collect(Collectors
                .groupingBy(e->e.getId().substring(0,4),TreeMap::new,Collectors.toList())).forEach((k,v)->{
            System.out.println(k+" : "+v);
        });

        //Create a map based on this data, the key should be year of joining
        // and value should be the count of people joined in that particular year
        System.out.println("Create a map based on this data, the key should be year of joining" +
                        "and value should be the count of people joined in that particular year");
         allEmployee.stream()
                .collect(Collectors.groupingBy(e -> e.getId().substring(0, 4),TreeMap::new, Collectors.counting()))
                 .forEach((k,v)->{
            System.out.println(k+" "+v);
        });
    }
}
