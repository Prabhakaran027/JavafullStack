package com.Test.HashTableExample;

import java.util.*;

public class EmployeeComparator {

    public long id;
    public String name;
    public long phone;
    public double salary;
    public EmployeeComparator() {
        super();

    }
    public EmployeeComparator(long id, String name, long phone, double salary) {
        super();
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.salary = salary;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public long getPhone() {
        return phone;
    }
    public void setPhone(long phone) {
        this.phone = phone;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", phone=" + phone + ", salary=" + salary + "]";
    }


    public static void main(String[] args) {
        EmployeeComparator e1 = new EmployeeComparator(213123,"Raman",35355,20000);
        EmployeeComparator e2 = new EmployeeComparator(656566,"Rina",5653535,25000);
        EmployeeComparator e3 = new EmployeeComparator(553535,"Smita",3333323,12000);
        EmployeeComparator e4 = new EmployeeComparator(213123,"Anita",33535656,15000);

        ArrayList<EmployeeComparator> employees= new ArrayList<>(Arrays.asList(e1, e2, e3, e4));

        System.out.println("Before sorting");
        for(EmployeeComparator e:employees)
        {
            System.out.println(e);
        }

        Collections.sort(employees, new SalaryComparator());

        System.out.println("After sorting");
        for(EmployeeComparator e:employees) {
            System.out.println(e);
        }
    }
}
class SalaryComparator implements Comparator<EmployeeComparator>
{
    @Override
    public int compare(EmployeeComparator o1, EmployeeComparator o2) {

        return (int) (o1.salary - o2.salary);
    }
}

class NameComparator implements Comparator<EmployeeComparator>
{
    @Override
    public int compare(EmployeeComparator o1, EmployeeComparator o2) {

        return o1.name.compareTo( o2.name);
    }
}




