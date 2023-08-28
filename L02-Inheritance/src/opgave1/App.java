package opgave1;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Mekaniker> mekanikere = new ArrayList<>();
        Mekaniker m1 = new Mekaniker("Rasmus", "Vej 1", 2012, 180);
        Mekaniker m2 = new Mekaniker("Mikkel", "Vej 2", 2008, 200);
        Mekaniker m3 = new Mekaniker("Peter", "Vej 3", 2013, 170);
        Mekaniker m4 = new Mekaniker("Morten", "Vej 4", 2016, 210);
        Værkfører v1 = new Værkfører(m1.getNavn(), m1.getAdresse(), m1.getSvendÅr(), m1.getTimeløn(), 2016, 800);
        Værkfører v2 = new Værkfører(m2.getNavn(), m2.getAdresse(), m2.getSvendÅr(), m2.getTimeløn(), 2011, 700);
        Værkfører v3 = new Værkfører(m3.getNavn(), m3.getAdresse(), m2.getSvendÅr(), m2.getTimeløn(), 2015, 1000);
        Synsmand s1 = new Synsmand(m1.getNavn(), m1.getAdresse(), m1.getSvendÅr(), m1.getTimeløn(), 18);
        mekanikere.add(m1);
        mekanikere.add(m2);
        mekanikere.add(m3);
        mekanikere.add(m4);
        mekanikere.add(v1);
        mekanikere.add(v2);
        mekanikere.add(v3);
        mekanikere.add(s1);
        double samletLøn = 0;
        for (Mekaniker m : mekanikere) {
            samletLøn += m.beregnLøn();
        }
        System.out.println(samletLøn);

    }
    public static double samletLoen(ArrayList<Mekaniker> mekanikere) {
        double samletLoen = 0;
        for (Mekaniker m : mekanikere) {
            samletLoen += m.beregnLøn();
        }
        return samletLoen;
    }
}
