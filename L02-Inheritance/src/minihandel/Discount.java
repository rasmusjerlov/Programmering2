package minihandel;

import java.util.ArrayList;

//Dette er Superklassen som Customer har en get metode til.
//Der bliver udnyttet polymorfi så, hver gang der bliver lavet en ny slags Discount
//Vil det ikke være nødvendigt med ændringer andre steder i systemet.
public interface Discount {

    public double getDiscount(double price);
    }
