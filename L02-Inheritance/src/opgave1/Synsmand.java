package opgave1;

public class Synsmand extends Mekaniker{
    private int antalSynPrUge;
    private int tillæg = antalSynPrUge * 29;

    public Synsmand(String navn, String adresse, int svendÅr, int timeløn, int antalSynPrUge) {
        super(navn, adresse, svendÅr, timeløn);
        this.antalSynPrUge = antalSynPrUge;
    }

    public int getAntalSynPrUge() {
        return antalSynPrUge;
    }

    public void setAntalSynPrUge(int antalSynPrUge) {
        this.antalSynPrUge = antalSynPrUge;
    }

    public int getTillæg() {
        return tillæg;
    }

    public void setTillæg(int tillæg) {
        this.tillæg = tillæg;
    }

    @Override
    public double beregnLøn() {
        return super.beregnLøn() + getTillæg();
    }

}
