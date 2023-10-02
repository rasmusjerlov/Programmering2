package Opgave2;

import java.util.ArrayList;
import java.util.List;

public class Skole {
    private String navn;
    private List<Studerende> studerendeList = new ArrayList<>();

    public Skole(String navn) {
        this.navn = navn;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public List<Studerende> getStuderendeList() {
        return studerendeList;
    }

    public void setStuderendeList(List<Studerende> studerendeList) {
        this.studerendeList = studerendeList;
    }
    public void addStuderende(Studerende studerende) {
        if (!studerendeList.contains(studerende)) {
            studerendeList.add(studerende);
        }
    }
    public void removeStuderende(Studerende studerende) {
        if (studerendeList.contains(studerende)) {
            studerendeList.remove(studerende);
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
        for (Studerende s : studerendeList) {
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
                ", studerendeList=" + studerendeList +
                '}';
    }
}
