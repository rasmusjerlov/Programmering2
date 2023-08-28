package opgave1;

public class Mekaniker extends Person {
    private int svendÅr;
    private int timeløn;
    private int antalTimer = 37;

    public Mekaniker (String navn, String adresse, int svendÅr, int timeløn) {
        super (navn, adresse);
        this.svendÅr = svendÅr;
        this.timeløn = timeløn;
    }

    public int getSvendÅr() {
        return svendÅr;
    }

    public void setSvendÅr(int svendÅr) {
        this.svendÅr = svendÅr;
    }

    public int getTimeløn() {
        return timeløn;
    }

    public void setTimeløn(int timeløn) {
        this.timeløn = timeløn;
    }

    public double beregnLøn() {
        double løn = this.timeløn * antalTimer;
        return løn;
    }

    @Override
    public String toString() {
        return "Mekaniker{" + super.getNavn() + super.getAdresse() +
                "svendÅr=" + svendÅr +
                ", timeløn=" + timeløn +
                ", antalTimer=" + antalTimer +
                '}';
    }
}
