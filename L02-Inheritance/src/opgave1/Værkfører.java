package opgave1;

public class Værkfører extends Mekaniker{
    private int udnævnelsesÅr;
    private int tillægPrUge;

    public Værkfører (String navn, String adresse, int svendÅr, int timeløn, int udnævnelsesÅr, int tillægPrUge) {
        super(navn, adresse, svendÅr, timeløn);
        this.udnævnelsesÅr = udnævnelsesÅr;
        this.tillægPrUge = tillægPrUge;
    }

    public int getUdnævnelsesÅr() {
        return udnævnelsesÅr;
    }

    public void setUdnævnelsesÅr(int udnævnelsesÅr) {
        this.udnævnelsesÅr = udnævnelsesÅr;
    }

    public int getTillægPrUge() {
        return tillægPrUge;
    }

    public void setTillægPrUge(int tillægPrUge) {
        this.tillægPrUge = tillægPrUge;
    }
    @Override
    public double beregnLøn() {
        return super.beregnLøn() + getTillægPrUge();
    }
}
