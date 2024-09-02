package java8EmpManagentprogms;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Java8EmpprogramsQA6to10 {
    public static void main(String[] args) {
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

// 6 count the number of employee in each department

        Map<String, Long> collect = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

        System.out.println(collect);

        System.out.println("*********************************************************");

        // 7 what is the average sal of each department
        Map<String, Double> collect1 = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(collect1);

        Set<Map.Entry<String, Double>> entries = collect1.entrySet();

        for (Map.Entry<String,Double> entry:entries){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
        System.out.println("*********************************************************");
// 8 get the details of yongest male employee inth cse department


        Employee employee1 = employees.stream().filter(employee -> employee.getDepartment() == "cse" && employee.getGender() == "male")
                .min(Comparator.comparingInt(Employee::getAge)).get();

        System.out.println(employee1);
        // 9 get the details of yongest female employee inth cse department


        Employee employee2 = employees.stream().filter(employee -> employee.getDepartment() == "cse" && employee.getGender() == "female")
                .min(Comparator.comparingInt(Employee::getAge)).get();

        System.out.println(employee2);

        System.out.println("*********************************************************");

// 9 who has the most work experience in the organization

        Optional<Employee> first = employees.stream()
                .sorted(Comparator.comparingInt(Employee::getYearOfJoining)).findFirst();
        System.out.println(first);

        System.out.println("*********************************************************");
// how many male and female employee are there in cse and ece

        Map<String, Long> collect2 = employees.stream().filter(employee -> employee.getDepartment() == "cse")
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(collect2);

    }
}
