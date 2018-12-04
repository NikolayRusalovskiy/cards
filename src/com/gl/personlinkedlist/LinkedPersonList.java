package com.gl.personlinkedlist;


import java.util.LinkedList;

public class LinkedPersonList  {
    private Person first;
    private Person last;

    @Override
    public String toString() {
        return "LinkedPersonList{" +
                "linkedPersons=" + linkedPersons +
                '}';
    }

    private LinkedList<Person> linkedPersons = new LinkedList<Person>();


    public Person getFirst() {
        return first;
    }

    public void setFirst(Person first) {
        this.first = first;
    }


    public Person getLast() {
        return last;
    }

    public void setLast(Person last) {
        this.last = last;
    }

    public boolean addPerson(Person person) {
        return linkedPersons.add(person);
    }

    public LinkedList<Person> getLinkedPersons() {
        return linkedPersons;
    }

    public void addToHead(Person person) {
        linkedPersons.addFirst(person);
    }

    public void addByIndex(int index, Person person) {
        linkedPersons.add(index, person);
    }

    public boolean remove(Person person) {
        return linkedPersons.remove(person);
    }

    public boolean removeFirst(Person person) {
        return linkedPersons.removeFirstOccurrence(person);
    }


    public boolean removeLast(Person person) {
        return linkedPersons.removeLastOccurrence(person);
    }


    public boolean removeByIndex(int index) {

        Person personFind = (Person) linkedPersons.get(index);

        if (personFind != null) {
            return linkedPersons.remove(personFind);
        } else {
            System.out.println("Can not find Person");
            return false;}
    }
}
