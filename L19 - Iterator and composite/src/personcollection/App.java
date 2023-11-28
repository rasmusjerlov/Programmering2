package personcollection;

public class App {
    public static void main(String[] args) {
        Person p1 = new Person("Rasmus");
        Person p2 = new Person("Morten");
        Person p3 = new Person("Hans");
        Person p4 = new Person("Peter");
        Person p5 = new Person("Jens");

        PersonCollection persons = new PersonCollection(10);
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);
        persons.add(p5);

        System.out.println(persons.get(3));
        System.out.println(persons);
        persons.remove(3);
        System.out.println(persons);


        //Opgave 2
        Person p6 = new Person("Thomas");
        PersonCollection personsFail = new PersonCollection(1);
        personsFail.add(p6);
        MyIterator myIterator = new MyIterator(persons);
        System.out.println(myIterator.hasNext());
        System.out.println(myIterator.next());

        System.out.println(myIterator.iterator());
    }
}
