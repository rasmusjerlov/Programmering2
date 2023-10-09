package Opgave2x2;

import java.util.HashSet;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Skole skole = new Skole("Erhvervsakademi");

        Studerende s1 = new Studerende(1, "Rasmus");
        Studerende s2 = new Studerende(2, "Mikkel");
        Studerende s3 = new Studerende(3, "Oliver");
        Studerende s4 = new Studerende(4, "Martin");

        HashSet<Integer> s1karakter = new HashSet<>();
        s1karakter.addAll(List.of(4, 7, 7, 10));
        s1.setKarakterer(s1karakter);

        HashSet<Integer> s2karakter = new HashSet<>();
        s2karakter.addAll(List.of(2, 2, 7, 12));
        s2.setKarakterer(s2karakter);

        HashSet<Integer> s3karakter = new HashSet<>();
        s3karakter.addAll(List.of(7, 7, 10, 2));
        s3.setKarakterer(s3karakter);

        HashSet<Integer> s4karakter = new HashSet<>();
        s4karakter.addAll(List.of(10, 10, 7, 12));
        s4.setKarakterer(s4karakter);

        skole.addStuderende(s1);
        skole.addStuderende(s2);
        skole.addStuderende(s3);
        skole.addStuderende(s4);

        System.out.println(skole);
    }
}
