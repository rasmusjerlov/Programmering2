package opgave2;

public class Customer implements Comparable<Customer> {

    //Programmér metoden compareTo, så
    //en kunde kommer før en anden kunde, hvis kundens efternavn kommer før en anden kundes
    //efternavn i henhold til den naturlige ordning på Strings. Hvis to kunder har samme efternavne,
    //sammenlignes yderligere på fornavn, og hvis begge fornavne er ens, sammenlignes på alder (yngst
    //først).
    private String firstName;
    private String lastName;
    private int age;

    public Customer(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Customer c) {
        if (this.lastName.compareTo(c.lastName) < 0) {
            return -1;
        } else if (this.lastName.compareTo(c.lastName) > 0) {
            return 1;
        } else if (this.firstName.compareTo(c.firstName) < 0) {
            return -1;
        } else if (this.firstName.compareTo(c.firstName) > 0) {
            return 1;
        } else if (this.age < c.age) {
            return -1;
        } else if (this.age > c.age) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "" + firstName + " " + lastName + " " + age;
    }
}
