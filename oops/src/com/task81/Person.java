package com.task81;

import java.util.Objects;

public  class Person {
    private String name;
    private int age;

    protected  Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public  String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    @Override
//    public boolean equals(Object obj) {
//        if(this ==obj) return true;
//        if(obj.getClass()!= this.getClass()) return false;
//        Person p = (Person)obj;
//        return p.age == this.age && p.name.equals(this.name);
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
