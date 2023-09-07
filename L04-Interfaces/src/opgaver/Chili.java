package opgaver;

public class Chili implements Measurable{
    private String navn;
    private int styrke;

    public Chili(String navn, int styrke) {
        this.navn = navn;
        this.styrke = styrke;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public int getStyrke() {
        return styrke;
    }

    public void setStyrke(int styrke) {
        this.styrke = styrke;
    }

    @Override
    public String toString() {
        return " " + navn + " " + styrke;
    }

    @Override
    public double getMeasure() {
        return styrke;
    }
}
