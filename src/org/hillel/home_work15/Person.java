package org.hillel.home_work15;

class Person {

    private String [] allFriends = new String[1];
    private Person[] persons;
    private String name;

    Person(){}

    Person(String[] allFriends, String name) {
        this.allFriends = allFriends;
        this.name = name;
    }

    Person[] getPersons() {
        return persons;
    }

    void setPersons(Person[] persons) {
        this.persons = persons;
    }

    String[] getAllFriends() {
        return allFriends;
    }

    void setAllFriends(String[] allFriends) {
        this.allFriends = allFriends;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

}
