public class Hus extends Beboelse{

    private int grundKvm;
    public Hus(String adresse, int kvm, int grundKvm) {
        super(adresse, kvm);
        this.grundKvm = grundKvm;
    }
}
