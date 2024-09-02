package java8EmpManagentprogms;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;

public class Java8EmpPrograms {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        //ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee(2, "dharma", 24, "male", "cse", 2018, 30.000));
        employees.add(new Employee(3, "kassem", 25, "male", "ece", 2016, 36.900));
        employees.add(new Employee(6, "vanja", 20, "female", "cse", 2018, 39.000));
        employees.add(new Employee(4, "pralika", 21, "female", "cse", 2018, 34.200));
        employees.add(new Employee(8, "Asha", 22, "female", "eee", 2020, 80.200));
        employees.add(new Employee(5, "chaithu", 30, "male", "mech", 2015, 90.400));
        employees.add(new Employee(11, "max", 29, "male", "cse", 2018, 60.000));
        employees.add(new Employee(22, "ram", 35, "male", "ece", 2016, 33.900));
        employees.add(new Employee(12, "usha", 28, "female", "cse", 2018, 49.000));
        employees.add(new Employee(44, "siddiq", 19, "female", "cse", 2018, 89.200));
        employees.add(new Employee(1, "ramya", 16, "female", "eee", 2020, 99.200));
        employees.add(new Employee(99, "raghava", 30, "male", "mech", 2015, 23.400));

        Optional<Employee> max = employees.stream().max(Comparator.comparingDouble(Employee::getSalary));

        System.out.println("highest sal : "+max);

        Employee first = employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).findFirst().get();
        System.out.println("sec sal: "+first.getName());


    }
}
