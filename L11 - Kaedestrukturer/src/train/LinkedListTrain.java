package train;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class LinkedListTrain
{
    private WagonNode firstWagon;
    private int count = 0;

    /**
     * Constructs an empty linked list train.
     */
    public LinkedListTrain() {
        this.firstWagon = null;
    }

    /**
     * Returns the first wagon node in the linked list train.
     * 
     * @return the first wagon node
     * 
     * @throws NoSuchElementException if the train has no wagon nodes
     */
    public WagonNode getFirst()
    {
        if (this.firstWagon == null)
        {
            throw new NoSuchElementException();
        }
        return this.firstWagon;
    }

    /**
     * Adds a wagon node to the front of the linked list train.
     * 
     * @param wagon the wagon node to add
     */
    public void addFirst(WagonNode wagon)
    {
        if (this.firstWagon == null) {
            this.firstWagon = wagon;
        } else {
            wagon.setNextWagon(this.firstWagon);
            this.firstWagon = wagon;
        }
        count++;
    }

    /**
     * Removes the first wagon node in the linked list train.
     * 
     * @return the removed wagon node
     * 
     * @throws NoSuchElementException if the train has no wagon nodes
     */
    public WagonNode removeFirst() {
        if (this.firstWagon == null) {
            throw new NoSuchElementException();
        } else {
            WagonNode remove = this.firstWagon;
            this.firstWagon = remove.getNextWagon();
            count--;
            return remove;
        }
    }

    /**
     * Counts the total number of wagon nodes in the linked list train.
     * 
     * @return the number of wagon nodes
     */
    public int count() {
        return count;
    }

    /**
     * Removes the first wagon node in the linked list train.
     * 
     * @param wagon the wagon node to remove
     * @return <code>true</code> if the wagon node was found and removed;
     *         <code>false</code> otherwise
     */
    public boolean remove(WagonNode wagon) {

        boolean found = false;
        if (wagon == this.firstWagon) {
            found = true;
            removeFirst();
            return found;
        }
        WagonNode current = this.firstWagon;
        while (current != null) {
            if (current.getNextWagon() == wagon) {
                current.setNextWagon(wagon.getNextWagon());
                found = true;
                return found;
            }
            current = current.getNextWagon();
        }
        return found;
    }

    /**
     * Inserts a wagon node at a given position in the linked list train.
     * 
     * @param wagon    the wagon node to add
     * @param position the position where to add the wagon node
     */
    public void insertAt(WagonNode wagon, int position) {
        WagonNode current = this.firstWagon;
        WagonNode previous = null;
        int count = 0;
        while (current != null) {
            if (position == count) {
                previous.setNextWagon(wagon);
                wagon.setNextWagon(current);
            }
            previous = current;
            current = current.getNextWagon();
            count++;
        }
    }
}
