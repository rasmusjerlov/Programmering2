package train;

import java.util.NoSuchElementException;

public class LinkedListTrain2 extends LinkedListTrain
{
    private WagonNode lastWagon;
    private WagonNode firstWagon;
    private int size = 0;

    /**
     * Constructs an empty double linked list train.
     */
    public LinkedListTrain2()
    {
        super();
        this.lastWagon = null;
    }

    /**
     * Returns the last wagon node in the double linked list train.
     * 
     * @return the last wagon node
     * 
     * @throws NoSuchElementException if the train has no wagon nodes
     */
    public WagonNode getLast()
    {
        if (this.lastWagon == null)
        {
            throw new NoSuchElementException();
        }
        return this.lastWagon;
    }

    /**
     * Adds a wagon node to the end of the double linked list train.
     * 
     * @param wagon the wagon node to add
     */
    public void addLast(WagonNode wagon)
    {
        if (this.lastWagon == null) {
            throw new NoSuchElementException();
        }
        if (lastWagon == null) {
            firstWagon = wagon;
            lastWagon = wagon;
        } else {
            lastWagon.setNextWagon(wagon);
            wagon.setPreviousWagon(lastWagon);
            lastWagon = wagon;
        }
        size++;

    }
}
