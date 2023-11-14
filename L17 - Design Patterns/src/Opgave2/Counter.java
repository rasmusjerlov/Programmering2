package Opgave2;

public class Counter {

    private static Counter instance;
    private static int value = 0;

    private Counter() {
    }

    public static Counter getInstance() {
        if (instance == null) {
            instance = new Counter();
        }
        return instance;
    }
    public static void count() {
        value++;
        System.out.println(value);
    }

    public static void times2() {
        value = value * 2;
        System.out.println(value);
    }

    public static void zero() {
        value = 0;
        System.out.println(value);
    }

    public static int getValue() {
        return value;
    }

}
