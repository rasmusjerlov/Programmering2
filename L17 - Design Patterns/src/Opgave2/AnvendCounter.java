package Opgave2;

public class AnvendCounter {
    public static void main(String[] args) {
        Counter c = Counter.getInstance();
        for (int i = 0; i < 5; i++) {
            c.count();
        }
        c.times2();
        c.zero();
        c.getValue();

    }
}
