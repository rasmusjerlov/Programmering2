package Opgave3;

import java.util.HashSet;

public class PersonAdministrator {
    private static PersonAdministrator instance;
    private HashSet<Person> personerSet = new HashSet<>();

    public static PersonAdministrator getInstance() {
        if (instance == null) {
            instance = new PersonAdministrator();
        }
        return instance;
    }

    public void addPerson(Person person) {
        if (!personerSet.contains(person)) {
            personerSet.add(person);
        } else {
            System.out.println("Person is already in set.");
        }
    }

    public HashSet<Person> getPersonerSet() {
        return personerSet;
    }

    public void removePerson(Person person) {
        if (!personerSet.contains(person)) {
            System.out.println("Person is not in set.");
        } else {
            System.out.println("Person has been removed");
        }
    }
}
