package Opgave2x2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Studerende {
    private int studieNr;
    private String navn;
    private HashSet<Integer> karakterer = new HashSet<>();

    public Studerende(int studieNr, String navn) {
        this.studieNr = studieNr;
        this.navn = navn;
    }

    public int getStudieNr() {
        return studieNr;
    }

    public void setStudieNr(int studieNr) {
        this.studieNr = studieNr;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public HashSet<Integer> getKarakterer() {
        return karakterer;
    }

    public void setKarakterer(HashSet<Integer> karakterer) {
        this.karakterer = karakterer;
    }

    @Override
    public String toString() {
        return "Studerende{" +
                "studieNr=" + studieNr +
                ", navn='" + navn + '\'' +
                ", karakterer=" + karakterer +
                '}';
    }
}
