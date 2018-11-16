package com.te;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    public int compare(Student student1, Student student2) {
//        if(age equal){
//            if(last name equal){
//
//            }else{
//                compare firstname
//            }
//        }else{
//            compare age
//        }


        if (student1.age == student2.age) {
            if (student1.lastName.equals(student2.lastName)) {
                if (student1.firstName.equals(student2.firstName)) {
                    return 0;
                } else {
                    return student1.firstName.compareTo(student2.firstName);
                }
            }else{
                return student1.lastName.compareTo(student2.lastName);
            }
        } else {

            return student2.age - student1.age;
        }
    }
//    class sortByLastName implements Comparator<Student> {
//        public int compare(Student student1, Student student2) {
//            return student1.lastName.compareTo(student2.lastName);
//        }
//    }
//    class sortByAge implements Comparator<Student>{
//        public int compare(Student student1, Student student2) {
//            return student1.age-student2.age;
//        }
//    }


}
