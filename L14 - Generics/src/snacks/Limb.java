package snacks;

import java.util.Comparator;
import java.util.Random;

public class Limb extends Snack implements Comparable<Limb> {
    @Override
    public int compareTo(Limb o) {
        return this.type.compareTo(o.type);
    }

    public enum Types
    {
        Finger, Foot, Hand, Heel, Knee, Toe
    }

    private Types type;

    public Limb()
    {
        Random random = new Random();
        Types[] types = Types.values();
        this.type = types[random.nextInt(types.length)];
    }

    public Limb(Types type)
    {
        this.type = type;
    }

    public Types getType()
    {
        return type;
    }

    @Override
    public String toString() {
        return "Limb: " +
                "\n\t type = " + type +
                "\n";
    }
}
