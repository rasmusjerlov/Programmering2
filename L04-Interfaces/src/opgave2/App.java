package opgave2;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Customer[] customers = new Customer[5];
        customers[0] = new Customer("Zans", "Hansen", 20);
        customers[1] = new Customer("Peter", "Petersen", 30);
        customers[2] = new Customer("Jens", "Jensen", 40);
        customers[3] = new Customer("Jørgen", "Jørgensen", 50);
        customers[4] = new Customer("Hans", "Zansen", 60);


        System.out.println(lastCustomer(customers));
        System.out.println(Arrays.toString(afterCustomer(customers, customers[0])));;


    }
    public static Customer lastCustomer(Customer[] customers) {
        Customer last = customers[0];
        for (Customer customer : customers) {
            if (customer.compareTo(last) > 0) {
                last = customer;
            }
        }
        return last;
    }
    public static Customer[] afterCustomer(Customer[] customers, Customer customer) {
        Customer[] after = new Customer[customers.length];
        int i = 0;
        for (Customer c : customers) {
            if (c.compareTo(customer) > 0) {
                after[i] = c;
                i++;
            }
        }
        return after;
    }
}
