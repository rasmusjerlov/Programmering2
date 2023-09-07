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
        int result = 0;
        int compared = this.lastName.compareTo(c.getLastName());

        if (compared < 0) {
            result = -1;
        } else if (compared > 0) {
            result = 1;
        } else {
            int comparedFirstName = this.firstName.compareTo(c.getFirstName());
            if (comparedFirstName < 0) {
                result = -1;
            } else if (comparedFirstName > 0) {
                result = 1;
            } else {
                int comparedAge = 0;
                if (this.age > c.getAge()) {
                    comparedAge = 1;
                } else if (this.age < c.getAge()) {
                    comparedAge = -1;
                } else result = 0;

            }
        }
        return result;
    }
    @Override
    public String toString() {
        return "" + firstName + " " + lastName + " " + age;
    }
}
