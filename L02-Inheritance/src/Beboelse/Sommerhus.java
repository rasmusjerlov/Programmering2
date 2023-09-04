package Beboelse;

public class Sommerhus extends Hus{

    private boolean beboet;
    public Sommerhus(String adresse, int kvm, int grundKvm, boolean beboet) {
        super(adresse, kvm, grundKvm);
        this.beboet = beboet;
    }

    @Override
    public int ejendomsVaerdi(){
        return super.ejendomsVaerdi() - 24;
    }
}
