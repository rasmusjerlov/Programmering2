package Opgave3;

public class AnvendPersonAdministrator {
    public static void main(String[] args) {
        Person p1 = new Person("Tully", 22);
        Person p2 = new Person("Rasmus", 23);
        Person p3 = new Person("Jens", 12);
        Person p4 = new Person("Mikkel", 24);
        Person p5 = new Person("Zazza", 23);

        PersonAdministrator.getInstance().addPerson(p1);
        PersonAdministrator.getInstance().addPerson(p2);
        PersonAdministrator.getInstance().addPerson(p3);
        PersonAdministrator.getInstance().addPerson(p4);

        PersonAdministrator.getInstance().removePerson(p1);
        PersonAdministrator.getInstance().removePerson(p5);

        System.out.println(PersonAdministrator.getInstance().getPersonerSet());

    }
}
