import java.util.*;

public class AnvendMetoderPaaHashSet {
    public static void main(String[] args) {
        //Opgave 1
        HashSet<Integer> numbers = new HashSet<>();
//        Indsæt tallene 34,12,23,45,67,34,98 i mængden.
        numbers.addAll(List.of(34, 12, 23, 45, 67, 34, 98));

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

        //Opgave 9
        System.out.println("Opgave 1.9");
        System.out.println(numbers.size());


    }
}
