package snackssupply;

public class SnackFactory implements Comparable<SnackFactory>
{
    @Override
    public int compareTo(SnackFactory s) {
        return 0;
    }
    // TODO: Implement getNewSnacks(E[] snackContainer)
    public static <E extends Comparable<E>> void getNewSnacks(E[] snackContainer) {
        for (int i = 0; i < snackContainer.length; i++) {
            snackContainer[i] = (E) new SnackFactory();
        }
    }
}
