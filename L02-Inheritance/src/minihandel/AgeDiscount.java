package minihandel;

public class AgeDiscount implements Discount {
    private double birthYear;

    public AgeDiscount(double birthYear) {
        this.birthYear = birthYear;
    }

    @Override
    public double getDiscount(double price) {
        double percentage = (2023 - this.birthYear) / 100;
        double newPrice = price * (1-percentage);
        return newPrice;
    }
}
