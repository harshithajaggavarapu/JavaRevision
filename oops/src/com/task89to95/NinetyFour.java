package com.task89to95;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;



public class NinetyFour {
    public static class Student{
         int grade;
         String name;

         Student(int g, String n){
             grade= g;
             name= n;
         }
    }
    public static void main(String[] args) {
        Student s1 = new Student(2,"harshi");
        Student s2 = new Student(1,"hwllo");
        Queue<Student> q = new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.grade- o2.grade;
            }
        });
        q.add(s1);
        q.add(s2);
        for(Student x: q){
            System.out.println(x.name);
        }
    }
}
