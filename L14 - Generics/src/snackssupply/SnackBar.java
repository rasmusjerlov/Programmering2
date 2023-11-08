package snackssupply;

import snacks.Limb;
import snacks.Pez;
import snacks.Smartie;

import java.util.*;

public class SnackBar {
    // TODO: Implement sortSnacks(E[] snackContainer)
    public static <E extends Comparable<E>> void sortSnacks(E[] snackContainer) {
        Arrays.sort(snackContainer);
    }

    public static void main(String[] args) {
        Limb[] limbs = new Limb[7];
        limbs[0] = new Limb(Limb.Types.Heel);
        limbs[1] = new Limb(Limb.Types.Foot);
        limbs[2] = new Limb(Limb.Types.Hand);
        limbs[3] = new Limb(Limb.Types.Finger);
        limbs[4] = new Limb(Limb.Types.Toe);
        limbs[5] = new Limb(Limb.Types.Heel);
        limbs[6] = new Limb(Limb.Types.Knee);

        Pez[] pez = new Pez[8];
        pez[0] = new Pez(Pez.Flavors.Cherry);
        pez[1] = new Pez(Pez.Flavors.Orange);
        pez[2] = new Pez(Pez.Flavors.Grape);
        pez[3] = new Pez(Pez.Flavors.Banana);
        pez[4] = new Pez(Pez.Flavors.CandyCorn);
        pez[5] = new Pez(Pez.Flavors.Strawberry);
        pez[6] = new Pez(Pez.Flavors.Lemon);
        pez[7] = new Pez(Pez.Flavors.Raspberry);

        Smartie[] smarties = new Smartie[8];
        smarties[0] = new Smartie(Smartie.Colors.Violet);
        smarties[1] = new Smartie(Smartie.Colors.Yellow);
        smarties[2] = new Smartie(Smartie.Colors.Orange);
        smarties[3] = new Smartie(Smartie.Colors.Blue);
        smarties[4] = new Smartie(Smartie.Colors.Red);
        smarties[5] = new Smartie(Smartie.Colors.Pink);
        smarties[6] = new Smartie(Smartie.Colors.Brown);
        smarties[7] = new Smartie(Smartie.Colors.Green);


        sortSnacks(limbs);
        sortSnacks(pez);
        sortSnacks(smarties);


        System.out.println("limbs: " + Arrays.toString(limbs));
        System.out.println("pez: " + Arrays.toString(pez));
        System.out.println("smarties: " + Arrays.toString(smarties));


    }
}