package com.functionalProgramming.OneFourteen;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        Employee e1 = new Employee("harshi",22);
        Employee e2 = new Employee("hha",21);
        Employee e3 = new Employee("harshi",25);
        List<Employee> l =  List.of(e1,e2,e3);
        l.stream().sorted((x,y)-> x.getAge()-y.getAge()).forEach(System.out::println);
    }
}
