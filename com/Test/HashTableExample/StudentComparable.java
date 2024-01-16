package com.Test.HashTableExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class StudentComparable implements Comparable<StudentComparable>{
    private int id;
    private String name;
    private long p_no;

    public StudentComparable() {
        super();
    }

    public StudentComparable(int id, String name, long p_no) {
        super();
        this.id = id;
        this.name = name;
        this.p_no = p_no;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getP_no() {
        return p_no;
    }

    public void setP_no(long p_no) {
        this.p_no = p_no;
    }

    @Override
    public String toString() {
        return "StudentComparable {" + "id=" + id + ", name='" + name + '\'' + ", p_no=" + p_no + '}';
    }

    @Override
    public int compareTo(StudentComparable o) {
        /*if (this.name.equals(o.name)){
            return 0;
        } else {
            return this.name.compareTo(o.name);
        }*/
        if (this.id > o.id){
            return 1;
        } else if (this.id < o.id) {
            return -1;
        }else
            return 0;
    } // or return Integer.compare(this.id, o.id);

    public static void main(String[] args) {
        StudentComparable s1 = new StudentComparable(1,"akil",9745);
        StudentComparable s2 = new StudentComparable(2,"prabhu",9745);
        StudentComparable s3 = new StudentComparable(5,"zoya",9745);
        StudentComparable s4 = new StudentComparable(4,"viraj",9745);

        ArrayList<StudentComparable> StudentComparables=new ArrayList<StudentComparable>(Arrays.asList(s1,s2,s3,s4));

        System.out.println("Before sorting..");
        for(StudentComparable s:StudentComparables)
        {
            System.out.println(s);
        }
        Collections.sort(StudentComparables);

        System.out.println("After sorting..");
        for(StudentComparable s:StudentComparables)
        {
            System.out.println(s);
        }
    }
}
