package com.gl.personlinkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedPersonList linkedPersonList = new LinkedPersonList();
        linkedPersonList.addPerson(new Person("Petya", 26));
        linkedPersonList.addPerson(new Person());
        linkedPersonList.addPerson(new Person ("Katya", 23));
        System.out.println(linkedPersonList);
        System.out.println("------------------------------------->>>>>>>>>>>>>>>>>>>>>>>>");
    }
}
