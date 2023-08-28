public class Sommerhus extends Hus {
    private boolean beboet;
    public Sommerhus(String adresse, int kvm, int grundKvm, boolean beboet) {
        super (adresse, kvm, grundKvm);
        this.beboet = beboet;
    }

    public boolean isBeboet() {
        return beboet;
    }
}
