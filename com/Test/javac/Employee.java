package com.Test.javac;

class EmpActions {
    //instance variables (represents states of the object)
    long id;
    String name;
    String organisationName;
    String departmentName;
    double salary;

    //instance methods (represents actions of the object)
    public void signIn() {
        System.out.println("Signin completed!");
    }

    public void signOut() {
        System.out.println("Sign out completed!");
    }

    public void salaryDrawn() {
        System.out.println("Salary received!");
    }

    public void applyLeave() {
        System.out.println("Leave applied!!");
    }
}

public class Employee {

    public static void main(String[] args) {

        EmpActions employee1 = new EmpActions();
        employee1.id = 262;
        employee1.name = "Raman";
        employee1.organisationName = "ABC pvt ltd.";
        employee1.salary = 70000;
        employee1.signIn();
        employee1.signOut();
        employee1.applyLeave();
        employee1.salaryDrawn();


        EmpActions employee2 = new EmpActions();
        employee2.id = 567;
        employee2.name = "Anil";
        employee2.organisationName = "ABC pvt ltd.";
        employee2.salary = 60000;
        employee2.signIn();
        employee2.signOut();
        employee2.applyLeave();
        employee2.salaryDrawn();

        EmpBeh employee3 = new EmpBeh();
        employee3.id = 262;
        employee3.name = "Raman";
        employee3.organisationName = "ABC pvt ltd.";
        employee3.salary = 70000;
        employee3.signIn();
        employee3.signOut();
        employee3.applyLeave();
        employee3.salaryDrawn();


        EmpBeh employee4 = new EmpBeh(567, "Anil", "XYZ pvt. ltd.", "It department", 67000);
        employee4.signIn();
        employee4.signOut();
        employee4.applyLeave();
        employee4.salaryDrawn();

        System.out.println(employee4);
        System.out.println(employee4);
    }
}

class EmpBeh {
    //instance variables / Data members (represents states of the object)
    long id;
    String name;
    String organisationName;
    String departmentName;
    double salary;

    //default constructor
    public EmpBeh() {
        System.out.println("constructor invoked");
    }

    //parameterized constructor
    public EmpBeh(long eid, String ename, String oname, String dname, double esalary) {
        System.out.println("parameterized constructor invoked");
        id = eid;
        name = ename;
        organisationName = oname;
        departmentName = dname;
        salary = esalary;
    }

    //instance methods (represents actions of the object)
    public void signIn() {
        System.out.println("Signin completed!");
    }

    public void signOut() {
        System.out.println("Sign out completed!");
    }


    public void salaryDrawn() {
        System.out.println("Salary received!");
    }


    public void applyLeave() {
        System.out.println("Leave applied!!");
    }
}

