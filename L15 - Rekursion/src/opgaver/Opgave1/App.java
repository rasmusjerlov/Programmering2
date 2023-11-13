package opgaver.Opgave1;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        ArrayList<Integer> elements = new ArrayList<>();
        elements.add(3);
        elements.add(5);
        elements.add(2);
        elements.add(8);
        elements.add(13);

        System.out.println(c1.sum(elements));
}
    }
