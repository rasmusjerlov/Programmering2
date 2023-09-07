package opgaver;

import java.util.Arrays;

public class App {


    public static void main(String[] args) {
        Measurable[] objects = new Measurable[5];
        objects[0] = new Chili("Habanero", 1000000);
        objects[1] = new Chili("Jalapeno", 575000);
        objects[2] = new Chili("Poblano", 312123);
        objects[3] = new Chili("Serrano", 712312);
        objects[4] = new Chili("Cayenne", 832131);

        System.out.println("The hottest chili is: " + max(objects).getMeasure());
        System.out.println("The average hotness is: " + avg(objects));

    }
    public static Measurable max(Measurable[] objects) {
        Measurable max = objects[0];
        for (Measurable object : objects) {
            if (object.getMeasure() > max.getMeasure()) {
                max = object;
            }
        }
        return max;
    }

    public static double avg (Measurable[] objects) {
        double sum = 0;
        for (Measurable object : objects) {
            sum += object.getMeasure();
        }
        return sum / objects.length;
    }
}
