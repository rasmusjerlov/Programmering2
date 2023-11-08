package snacks;

import java.util.ArrayList;

public class Snack
{
    ArrayList<Limb> limbsList = new ArrayList<Limb>();
    ArrayList<Pez> pezList = new ArrayList<>();
    ArrayList<Smartie> smartieList = new ArrayList<>();

    private double weight;

    public double getWeight()
    {
        return weight;
    }

    public void setWeight(double weight)
    {
        this.weight = weight;
    }
}
