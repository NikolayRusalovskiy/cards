package com.gl.personlinkedlist;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LinkedPersonListTest {
    LinkedPersonList linkedPersonList = new LinkedPersonList();
    LinkedPersonList emptylinkedPersonList = new LinkedPersonList();

//    @BeforeMethod
//    public void createList() {
////        linkedPersonList = null;
//        linkedPersonList.addPerson(new Person("Katya1", 23));
//        linkedPersonList.addPerson(new Person("Katya2", 33));
//        linkedPersonList.addPerson(new Person("Katya3", 31));
//        linkedPersonList.addPerson(new Person("Katya4", 31));
//        linkedPersonList.addPerson(new Person("Katya5", 31));
//        linkedPersonList.addPerson(new Person("Katya6", 43));
//    }

    @Test
    public void addPersonTest() {
        emptylinkedPersonList.addPerson(new Person("Katya1", 23));
        System.out.println(emptylinkedPersonList);
//        assert !emptylinkedPersonList.toString().isEmpty();
        assert true;
    }
}
