package opgave3;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Product p1 = new Product(1, "Book", 50);
        Product p2 = new Product(2, "Backpack", 150);
        Product p3 = new Product(3, "Computer", 300);
        Product p4 = new Product(4, "Phone", 250);
        Product p5 = new Product(5, "Headphones", 100);

        Customer c1 = new Customer("Rasmus", LocalDate.of(2000, 02, 22));
        Customer c2 = new Customer("Michael", LocalDate.of(2003, 05, 9));

        Order o1 = new Order(1);
        o1.createOrderLine(3, p1);
        o1.createOrderLine(1, p3);
        o1.createOrderLine(1, p2);
        o1.createOrderLine(1, p5);


        Order o2 = new Order(2);
        o2.createOrderLine(2, p4);
        o2.createOrderLine(1, p1);
        o2.createOrderLine(2, p2);

        c1.addOrder(o1);
        c1.addOrder(o2);

        Order o3 = new Order(3);
        o3.createOrderLine(1, p1);
        o3.createOrderLine(2, p3);

        Order o4 = new Order(4);
        o4.createOrderLine(2, p5);
        o4.createOrderLine(4, p1);

        Order o5 = new Order(5);
        o5.createOrderLine(2, p3);
        o5.createOrderLine(1, p4);

        Order o6 = new Order(6);
        o6.createOrderLine(5, p1);
        o6.createOrderLine(2, p5);
        o6.createOrderLine(1, p3);

        c2.addOrder(o3);
        c2.addOrder(o4);
        c2.addOrder(o5);
        c2.addOrder(o6);

        System.out.println(o1.getOrderPrice());
        System.out.println(o2.getOrderPrice());
        System.out.println(c1.getTotalBuy());
    }
}
