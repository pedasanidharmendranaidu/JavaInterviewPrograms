package java8EmpManagentprogms;

import java.util.*;
import java.util.stream.Collectors;

public class Java8empProgms11To15
{

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
// 11 what is the avearge salary of male and female employee

        Map<String, Double> collect = employees.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(collect);

        System.out.println("*********************************************************");
// 12 list down all the all the employeee name in each department
        Map<String, List<Employee>> collect1 = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));


        Set<Map.Entry<String, List<Employee>>> entries = collect1.entrySet();

        for (Map.Entry<String,List<Employee>> entry: entries){
            System.out.println("*********************************************************");

            System.out.println("depatment: "+entry.getKey());
            List<Employee> value = entry.getValue();
            System.out.println("*********************************************************");

            for (Employee employee:value){
                System.out.println("names :"+employee.getName());
            }
        }
        System.out.println("*********************************************************");

        System.out.println(collect1);


        System.out.println("*********************************************************");
// 13 what is the avearge salary and total salary of the organisation


        DoubleSummaryStatistics collect2 = employees.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
        System.out.println(" get the max salary : "+collect2.getMax());
        System.out.println("get the min sal : "+collect2.getMin());
        System.out.println("get total sal : "+collect2.getSum());
        System.out.println("get avg sal : "+collect2.getAverage());
        System.out.println("get count : "+collect2.getCount());

        System.out.println("*********************************************************");
// 14 sepate the employee who's are anger and equel to 25 age and old employess

        Map<Boolean, List<Employee>> collect3 = employees.stream().collect(Collectors.partitioningBy(employee -> employee.getAge() < 22));
        Set<Map.Entry<Boolean, List<Employee>>> entries1 = collect3.entrySet();
       // Set<Map.Entry<Boolean, List<Employee>>> entries11 = entries1;



    }
}
