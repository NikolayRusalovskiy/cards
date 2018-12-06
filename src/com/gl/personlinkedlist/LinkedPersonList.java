package com.gl.personlinkedlist;

class LinkedPersonList {
    private Person first;
    private Person last;
    private Person current;

    public Person getCurrent() {
        return current;
    }

    @Override
    public String toString() {
        String result = "";
        current = first;
        while (hasNext()) {
            result += current + "\r\n";
            current = goNext();
        }
        result += current;
        return result;
    }

    public void setCurrent(Person current) {
        this.current = current;
    }

    public Person goNext() {
        return current.getNext();
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
        if (current != null && current.getNext() != null) {
            return true;
        }

        return false;
    }

    public void addPerson(Person person) {
        if (first == null) {
            first = person;
            current = person;
            last = person;
            return;
        }
        last.setNext(person);
        last = person;
    }

    public void addToHead(Person head) {
        head.setNext(first);
        first = head;
    }

    public void addByIndex(int index, Person person) {
        //todo Шото тут не  так
        if (first == null) {
            System.out.println("No Person ");
        }
        if (index == 1) {
            addToHead(person);
            return;
        }
        current = first;
        for (int i = 2; i < index; i++) {
            if (hasNext()) {
                current = goNext();
            } else {
                System.out.println("No item by index " + (i + 1));
                return;
            }
        }
        if (hasNext()) {
            person.setNext(goNext());
        }
        current.setNext(person);
    }

    public void remove(Person person) {
        if (first.equals(person)) {
            removeFirst();
            return;
        }
        if (last.equals(person)) {
            removeLast();
            return;
        }
        current = first;
        while (!(current.getNext()).equals(person)) {
            if (current.getNext().getNext() == null) {
                System.out.println("No such Person in the Box");
                return;
            }
            current = current.getNext();

        }
        if ((current.getNext()).getNext() != null) {
            current.setNext((current.getNext()).getNext());
        }
    }

    private boolean removeFirst() {
        if (first != null && first.getNext() != null) {
            first = first.getNext();
            current = first;
            return true;
        } else {
            return false;
        }
    }


    private boolean removeLast() {
        current = first;
        while ((current.getNext()).getNext() != null) {
            current = goNext();
        }
        current.setNext(null);
        last = current;
        return true;
    }


    public void removeByIndex(int index) {
        if (first == null) {
            System.out.println("No Person");
        }
        current = first;
        if (index == 0) {
            removeFirst();
        }
        for (int i = 1; i < index - 1; i++) {
            System.out.println(i);
            if (hasNext()) {
                current = goNext();
            } else {
                System.out.println("No item by index" + i);
                return;
            }
        }

        if ((current.getNext()) != null) {
            Person next = (current.getNext()).getNext();
            current.setNext(next);
        } else {
            current.setNext(null);
        }
    }
}
