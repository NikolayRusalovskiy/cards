package com.gl.personlinkedlist;

import org.testng.annotations.BeforeClass;
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
        assert equalsP2P(emptylinkedPersonList.getFirst(),person);
    }

@Test
    public void addToHeadTest(){
        linkedPersonList.addToHead(random);
        assert equalsP2P(linkedPersonList.getFirst(),random);
}


}
