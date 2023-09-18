package minihandel;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {

        //Produkt objekter
        Product p1 = new Product(1,"Bajer",120);
        Product p2 = new Product(2,"Sodavand",15);
        Product p3 = new Product(3,"Energidrik",20);
        Product p4 = new Product(4,"Burger",30);
        Product p5 = new Product(5,"Pizza",50);

        //Customer objekter
        Customer c1 = new Customer("ole", 1988);
        Customer c2 = new Customer("Bo", 2002);
        Customer c3 = new Customer("Rasmus", 2000);

        //Age discount
        AgeDiscount ad = new AgeDiscount(2000);

        //Order Objekter
        Order or1 = new Order(1);
        Order or2 = new Order(2);
        Order or3 = new Order(3);
        Order or4 = new Order(4);
        Order or5 = new Order(5);
        Order or6 = new Order(6);

        //Order skaber Orderline objekter
        or1.createOrderLine(4,p1);
        or1.createOrderLine(4,p1);
        or2.createOrderLine(4,p1);
        or2.createOrderLine(4,p1);
        or3.createOrderLine(4,p1);
        or3.createOrderLine(4,p1);
        or4.createOrderLine(4,p1);
        or4.createOrderLine(4,p1);
        or5.createOrderLine(4,p1);
        or5.createOrderLine(4,p1);
        or6.createOrderLine(4,p1);
        or6.createOrderLine(4,p1);

        //Customer 1 får tilknyttet 2 ordre
        c1.addOrder(or1);
        c1.addOrder(or2);

        //Customer 2 får tilknyttet 4 ordre
        c2.addOrder(or3);
        c2.addOrder(or4);
        c2.addOrder(or5);
        c2.addOrder(or6);

        //Discount objekter af forskellige typer bliver oprettet
        FixedDiscount fd = new FixedDiscount(250,1000);
        PercentDiscount pd = new PercentDiscount(15);
        Olerabat or = new Olerabat(c1.getName());

        System.out.println("Prisen på order 1:");
        System.out.println(or1.getOrderPrice());
        System.out.println();

        System.out.println("Total prisen for kunde 1's ordre:");
        System.out.println(c1.totalBuy());
        System.out.println();

        //Discount bliver tilknyttet kunder
        c2.setDiscount(pd);
        c1.setDiscount(or);

        System.out.println("Totalpris efter discount for kunde 1 med OleRabat:");
        System.out.println((c1.getDiscount().getDiscount(c1.totalBuy())));
        System.out.println();

        System.out.println("Totalprisen for kunde 2's ordre");
        System.out.println(c2.totalBuy());
        System.out.println();

        System.out.println("Prisen efter discount for kunde 2 med procentRabat:");
        System.out.println(pd.getDiscount(c2.totalBuy()));

        System.out.println("Pris efter discount i en alder af 23 år: ");
        System.out.println(ad.getDiscount(c2.totalBuy()));


    }
}
