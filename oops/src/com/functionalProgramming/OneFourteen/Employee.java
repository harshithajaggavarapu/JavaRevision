package com.functionalProgramming.OneFourteen;

public class Employee {
    private final String name;
    private final int age;

    Employee(String n, int a){
        this.name= n;
        this.age =a;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
