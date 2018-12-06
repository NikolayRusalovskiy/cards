package com.gl.personlinkedlist;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LinkedPersonListTest {
    LinkedPersonList emptylinkedPersonList = new LinkedPersonList();
    LinkedPersonList linkedPersonList;
    Person random = new Person("Random", 88);

    private boolean equalsP2P(Person fromList, Person to) {
        return fromList.toString().equalsIgnoreCase(to.toString());
    }

    @BeforeMethod
    public void createList() {
        linkedPersonList = new LinkedPersonList();
        linkedPersonList.addPerson(new Person("Katya1", 23));
        linkedPersonList.addPerson(new Person("Katya2", 33));
        linkedPersonList.addPerson(new Person("Katya3", 31));
        linkedPersonList.addPerson(new Person("Katya4", 31));
        linkedPersonList.addPerson(new Person("Katya5", 31));
        linkedPersonList.addPerson(new Person("Katya6", 43));
    }

    @Test
    public void addPersonFirstTest() {
        Person person = new Person("Katya1", 23);
        emptylinkedPersonList.addPerson(person);
        assert equalsP2P(emptylinkedPersonList.getFirst(), person);
    }

    @Test
    public void addToHeadTest() {
        linkedPersonList.addToHead(random);
        assert equalsP2P(linkedPersonList.getFirst(), random);
    }

    @Test
    public void addByIndexFirstTest(){
        linkedPersonList.addByIndex(1,random);
        assert equalsP2P(linkedPersonList.getFirst(), random);
    }

    @Test
    public void getByIndexFirstTest(){
        Person person= linkedPersonList.getByIndex(1);
        assert equalsP2P(person, new Person("Katya1", 23));
    }
    @Test
    public void getByIndexMiddleTest(){
        Person person= linkedPersonList.getByIndex(3);
        assert equalsP2P(person, new Person("Katya3", 31));
    }
    @Test
    public void getByIndexlastTest(){
        Person person= linkedPersonList.getByIndex(6);
        assert equalsP2P(person,new Person("Katya6", 43) );
    }
    @Test
    public void getByIndexAnyTest(){
        Person person= linkedPersonList.getByIndex(7);
        assert equalsP2P(person, new Person("No more index",0));
    }

    @Test
    public void addByIndexToFirstTest(){
        linkedPersonList.addByIndex(1,random);
        assert equalsP2P(linkedPersonList.getByIndex(1),random);
    }
    @Test
    public void addByIndexToMiddleTest(){
        linkedPersonList.addByIndex(3,random);
        assert equalsP2P(linkedPersonList.getByIndex(3),random);
    }
    @Test
    public void addByIndexToLastItemTest(){
        linkedPersonList.addByIndex(6,random);
        assert equalsP2P(linkedPersonList.getByIndex(6),random);
    }
    @Test
    public void addByIndexToLastTest(){
        linkedPersonList.addByIndex(7,random);
        assert equalsP2P(linkedPersonList.getByIndex(7),random);
    }
}































