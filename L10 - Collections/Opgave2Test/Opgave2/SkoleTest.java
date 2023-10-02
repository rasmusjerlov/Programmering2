package Opgave2;

import org.junit.jupiter.api.BeforeAll;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SkoleTest {

    @org.junit.jupiter.api.Test
    void getStuderendeList() {
        //Arrange
        Skole skole = new Skole("Erhvervsakademi");

        Studerende s1 = new Studerende(1, "Rasmus");
        Studerende s2 = new Studerende(2, "Mikkel");
        Studerende s3 = new Studerende(3, "Oliver");
        Studerende s4 = new Studerende(4, "Martin");

        //Act
        skole.addStuderende(s1);
        skole.addStuderende(s2);
        skole.addStuderende(s3);
        skole.addStuderende(s4);

        //Assert
        assertTrue(skole.getStuderendeList().contains(s1));
        assertTrue(skole.getStuderendeList().contains(s2));
        assertTrue(skole.getStuderendeList().contains(s3));
        assertTrue(skole.getStuderendeList().contains(s4));


    }

    @org.junit.jupiter.api.Test
    void setStuderendeList() {
    }

    @org.junit.jupiter.api.Test
    void addStuderende() {
    }

    @org.junit.jupiter.api.Test
    void removeStuderende() {
    }

    @org.junit.jupiter.api.Test
    void gennemsnit() {
    }

    @org.junit.jupiter.api.Test
    void findStuderende() {
    }
}