package com.gl.personlinkedlist;

import java.util.Objects;

public class Person {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getAge() == person.getAge() &&
                Objects.equals(getName(), person.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge());
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Person() {
        this.name = "NameDefault";
        this.age = 99;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private String name;
    private int age;
    private Person next;

    public Person getNext() {
        return next;
    }

    public void setNext(Person next) {
        this.next = next;
    }

    public String getName() {
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
}
