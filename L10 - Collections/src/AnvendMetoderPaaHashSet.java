import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

public class AnvendMetoderPaaHashSet {
    public static void main(String[] args) {
        //Opgave 1
        Collection<Integer> numbers = new HashSet<>();
//        Indsæt tallene 34,12,23,45,67,34,98 i mængden.
        numbers.add(34);
        numbers.add(12);
        numbers.add(23);
        numbers.add(45);
        numbers.add(67);
        numbers.add(34);
        numbers.add(98);
        //Opgave 1.3
        System.out.println("Opgave 1.3");
        System.out.println(numbers);

        //Opgave 1.5
        System.out.println("Opgave 1.5");
        numbers.add(23);
        System.out.println(numbers);

        //Opgave 1.7
        System.out.println("Opgave 1.7");
        numbers.remove(67);
        System.out.println(numbers);

        //Opgave 8
        System.out.println("Opgave 1.8");
        System.out.println(numbers.contains(23));

    }
}
