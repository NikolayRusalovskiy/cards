package com.gl.personlinkedlist;


import java.util.LinkedList;

public class LinkedPersonList {
    private Person first;
    private Person last;
    private Person current;

    public Person getCurrent() {
        return current;
    }

    public void setCurrent(Person current) {
        this.current = current;
    }

    public Person goNext() {
        return current.getNext();
    }

    @Override
    public String toString() {
        String result = null;
        while (hasNext()) {
            result += current.toString();
            current = goNext();
        }
        return "LinkedPersonList{" +
                "linkedPersons=" + result +
                '}';
    }

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

    public boolean hasNext() {
        if (current.getNext() != null) {
            return true;
        }

        return false;
    }

    public void addPerson(Person person) {
        if (first == null) {
            first = person;
            current = person;
            last = person;
        }
        last.setNext(person);
        last=person;
    }

    public void addToHead(Person head) {
        head.setNext(first);
        first = head;
    }

    public void addByIndex(int index, Person person) {
        if (first == null) {
            System.out.println("No Person ");
        }
        Person currentPerson = first;
        for (int i = 0; i < index; i++) {
            if (currentPerson.getNext() != null) {
                currentPerson = currentPerson.getNext();
            } else System.out.println("No item by index" + i);
        }
        person.setNext(currentPerson.getNext());
        currentPerson.setNext(person);
    }

    public boolean remove(Person person) {
        Person currentPerson = first;
        while (!currentPerson.equals(person) && currentPerson.getNext() != null) {
            currentPerson = currentPerson.getNext();
        }
        return false;
    }

    public boolean removeFirst() {
        if (first != null && first.getNext() != null) {
            first = first.getNext();
            current = first;
            return true;
        } else {
            return false;
        }
    }


    public boolean removeLast() {
        current = first;
        while ((current.getNext()).getNext() != null) {
            current = current.getNext();
        }
        current.setNext(null);
        last = current;
        return true;
    }


    public boolean removeByIndex(int index) {
        if (first == null) {
            System.out.println("No Person");
        }
        current = first;
        for (int i = 0; i < index; i++) {
            if (current.getNext() != null) {
                current = current.getNext();
            } else System.out.println("No item by index" + i);
        }
        Person next = (current.getNext()).getNext();
        if (next != null) {
            current.setNext(next);
        } else {
            current.setNext(null);
        }
        return true;
    }
}
