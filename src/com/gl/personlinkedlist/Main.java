package com.gl.personlinkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedPersonList ll = new LinkedPersonList();
//        ll.addPerson(new Person("Petya", 26));
//        ll.addPerson(new Person());
        ll.addPerson(new Person ("Katya1", 23));
        ll.addPerson(new Person ("Katya2", 33));
        ll.addPerson(new Person ("Katya3", 31));
        ll.addPerson(new Person ("Katya4", 31));
        ll.addPerson(new Person ("Katya5", 31));
        ll.addPerson(new Person ("Katya6", 43));
        System.out.println(ll);
        System.out.println("------------------------------------->>>>>>>>>>>>>>>>>>>>>>>>");
        ll.addByIndex(2,new Person("---->Dobavili", 55));
        System.out.println(ll);
    }
}
