package com.Test.Java8;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeExample {
    public int id;
    public String name;
    public long salary;
    public String designation;

    public EmployeeExample() {
    }

    public EmployeeExample(int id, String name, long salary, String designation) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "EmployeeExample{" + "id=" + id + ", name='" + name + '\'' + ", salary=" + salary + ", designation='" + designation + '\'' + '}';
    }


    public static void main(String[] args) {
        EmployeeExample employee1 = new EmployeeExample(1,"prabhu",10000,"testing");
        EmployeeExample employee2 = new EmployeeExample(2,"ram",15000,"testing");
        EmployeeExample employee3 = new EmployeeExample(3,"hari",18000,"testing");
        EmployeeExample employee4 = new EmployeeExample(4,"sam",12000,"testing");
        EmployeeExample employeeExample = new EmployeeExample();

        List<EmployeeExample> emp= Arrays.asList(employee1,employee2,employee3,employee4);

        Double avgOfSalary=emp.stream()
                .collect(Collectors.averagingDouble(x->x.salary));
        System.out.println(avgOfSalary);

        Double sumOfSalary=emp.stream()
                .collect(Collectors.summingDouble(x->x.salary));
        System.out.println(sumOfSalary);
    }
}
