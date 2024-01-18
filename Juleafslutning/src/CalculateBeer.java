public class CalculateBeer {
    public static double amountOfBeers(double kroner) {
        double prisPrØl = 7;
        double amount = kroner / prisPrØl;
        if (amount + (kroner % 7) < prisPrØl) {
            return amount;
        } else {
            amount = amount + amountOfBeers(amount);
        }
        System.out.println(amount);
        return amount;
    }

    public static void main(String[] args) {
//        amountOfBeers(1202);
//        amountOfBeers(650);
        amountOfBeers(8000);
    }
}
