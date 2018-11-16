package com.te;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Student {
    int age;
    String firstName;
    String lastName;

    public Student(String fn, String ln, int ag){
        this.age=ag;
        this.firstName=fn;
        this.lastName=ln;
    }

    public String toString(){
        return this.age+this.firstName+this.lastName;
    }

    public static void main(String[] args){
        Student student1=new Student("neo","xu",32);
        Student student2=new Student("chris","xu",25);
        Student student3=new Student("yishan","xu",26);
        Student student4=new Student("te","cai",7);
        StudentComparator studentComparator = new StudentComparator();
        List result=new ArrayList();
        result.add(student1);
        result.add(student2);
        result.add(student3);
        result.add(student4);
        Collections.sort(result,studentComparator);

        System.out.println(result.toString());

    }



}



