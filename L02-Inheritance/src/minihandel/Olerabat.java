package minihandel;

public class Olerabat implements Discount {
    private String name;

    public Olerabat(String name) {
        this.name = name;
    }

    @Override
    public double getDiscount(double price) {
        if (name.equals("ole")) {
            return price - 2000;
        }
        return price;
    }
}
