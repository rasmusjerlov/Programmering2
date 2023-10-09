package Opgave3;

import java.util.List;

public class App {
    public static void main(String[] args) {
        Skole skole = new Skole("Erhvervsakademi");

        Studerende s1 = new Studerende(1, "Rasmus");
        Studerende s2 = new Studerende(2, "Mikkel");
        Studerende s3 = new Studerende(3, "Oliver");
        Studerende s4 = new Studerende(4, "Martin");

        s1.setKarakterer(List.of(4, 7, 7, 10));
        s2.setKarakterer(List.of(2, 2, 7, 12));
        s3.setKarakterer(List.of(7, 7, 10, 2));
        s4.setKarakterer(List.of(10, 10, 7, 12));

        skole.addStuderende(s1);
        skole.addStuderende(s2);
        skole.addStuderende(s3);
        skole.addStuderende(s4);

        System.out.println(skole);
    }
}
