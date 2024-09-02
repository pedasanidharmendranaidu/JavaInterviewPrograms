package java8EmpManagentprogms;

import java.util.*;
import java.util.stream.Collectors;

;
public class Java8EmpProgmQA1to5 {
    public static void main(String[] args) {



        System.out.println("*********************************************************");
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee(2, "dharma", 24, "male", "cse", 2018, 30.000));
        employees.add(new Employee(3, "kassem", 25, "male", "ece", 2016, 36.900));
        employees.add(new Employee(6, "vanja", 20, "female", "cse", 2018, 39.000));
        employees.add(new Employee(4, "pralika", 21, "female", "cse", 2018, 34.200));
        employees.add(new Employee(8, "Asha", 22, "female", "eee", 2020, 80.200));
        employees.add(new Employee(5, "chaithu", 30, "male", "mech", 2015, 90.400));
        employees.add(new Employee(11, "max", 29, "male", "cse", 2018, 60.000));
        employees.add(new Employee(22, "ram", 35, "male", "ece", 2016, 33.900));
        employees.add(new Employee(12, "usha", 28, "female", "cse", 2018, 49.000));
        employees.add(new Employee(44, "siddiq", 19, "female", "cse", 2018, 80.200));
        employees.add(new Employee(1, "ramya", 16, "female", "eee", 2020, 99.200));
        employees.add(new Employee(99, "raghava", 30, "male", "mech", 2015, 23.400));

        System.out.println("*********************************************************");
        //1 how many male and female employee are there in the organization

        Map<String, Long> collect = employees.stream()
                .collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
        System.out.println(collect);
        System.out.println("*********************************************************");
// 2 print all thd deparment in the organisation


        List<String> list = employees.stream().map(Employee::getDepartment).distinct().toList();
        System.out.println(list);
        System.out.println("*********************************************************");
// 3  what is the average age of male and female employee in the organization

        Map<String, Double> collect1 = employees.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
        System.out.println(collect1);
        System.out.println("*********************************************************");

// 4 get the details of highest paid employee in organization


        Optional<Employee> max = employees.stream().max(Comparator.comparingDouble(Employee::getSalary));
        System.out.println(max);
        Employee employee=max.get();
        System.out.println("emp id"+employee.getId());
        System.out.println("emp name"+employee.getName());
        System.out.println("emp salary "+employee.getSalary());

        System.out.println("*********************************************************");
// 5 get the names of all employee who joined after 2018

        List<String> collect2 = employees.stream().filter(employee1 -> employee1.getYearOfJoining() > 2018)
                .map(Employee::getName).collect(Collectors.toList());
        System.out.println(collect2);














    }
}
