package Opgave2x2;

import java.util.HashSet;

public class Skole {
    private String navn;
    private HashSet<Studerende> studerendeHashSet = new HashSet<>();

    public Skole(String navn) {
        this.navn = navn;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public HashSet<Studerende> getStuderendeHashSet() {
        return studerendeHashSet;
    }

    public void setStuderendeHashSet(HashSet<Studerende> studerendeHashSet) {
        this.studerendeHashSet = studerendeHashSet;
    }
    public void addStuderende(Studerende studerende) {
        if (!studerendeHashSet.contains(studerende)) {
            studerendeHashSet.add(studerende);
        }
    }
    public void removeStuderende(Studerende studerende) {
        if (studerendeHashSet.contains(studerende)) {
            studerendeHashSet.remove(studerende);
        }
    }
    public double gennemsnit(Studerende studerende) {
        double karakterSum = 0;
        double gennemsnit = 0;
            for (Integer k : studerende.getKarakterer()) {
                karakterSum += k;
            }
        gennemsnit = karakterSum / studerende.getKarakterer().size();
        return gennemsnit;
    }
    public Studerende findStuderende (int studieNr) {
        for (Studerende s : studerendeHashSet) {
            int currentnumber = s.getStudieNr();
            if (currentnumber == studieNr) {
                return s;
            } else {
                return null;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Skole{" +
                "navn='" + navn + '\'' +
                ", studerendeList=" + studerendeHashSet +
                '}';
    }
}
