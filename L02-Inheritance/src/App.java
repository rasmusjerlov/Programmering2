public class App {
    public static void main(String[] args) {
        Hus[] huse = new Hus[5];
        huse[0] = new Hus("Vandet 2", 110, 1500);
        huse[1] = new Sommerhus("Vandet 4", 66, 1000, false);
        huse[2] = new Hus("Havet 1", 187, 2000);
        huse[3] = new Sommerhus("Havet 2", 98, 900, true);
        huse [4] = new Hus("Havet 3", 100, 600);

        int sum = 0;
        for (Hus hus : huse) {
            sum = sum + hus.ejendomsVaerdi();
        }

    }
}
