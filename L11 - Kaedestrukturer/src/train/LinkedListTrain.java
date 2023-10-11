package train;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class LinkedListTrain
{
    private WagonNode firstWagon;

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
            return remove;
        }
    }

    /**
     * Counts the total number of wagon nodes in the linked list train.
     * 
     * @return the number of wagon nodes
     */
    public int count() {
        int sum = 0;
        WagonNode current = getFirst();
        while (current != null) {
            sum++;
            current = current.getNextWagon();
        }
        return sum;
    }

    /**
     * Removes the first wagon node in the linked list train.
     * 
     * @param wagon the wagon node to remove
     * @return <code>true</code> if the wagon node was found and removed;
     *         <code>false</code> otherwise
     */
    public boolean remove(WagonNode wagon) {
        // TODO: Assignment 4: Implement this remove method...
        if (this.firstWagon == null) {
            return false;
        } else {
            WagonNode current = this.firstWagon;
            WagonNode previous = null;
            while (current != null) {
                if (current == wagon) {
                    if (previous == null) {
                        this.firstWagon = current.getNextWagon();
                    } else {
                        previous.setNextWagon(current.getNextWagon());
                    }
                    return true;
                }
                previous = current;
                current = current.getNextWagon();
            }
            return false;
        }
    }

    /**
     * Inserts a wagon node at a given position in the linked list train.
     * 
     * @param wagon    the wagon node to add
     * @param position the position where to add the wagon node
     */
    public void insertAt(WagonNode wagon, int position)
    {
        // TODO: Assignment 5: Implement this insert method...
        if (position == 0) {
            this.addFirst(wagon);
        } else {
            WagonNode current = this.firstWagon;
            WagonNode previous = null;
            int count = 0;
            while (current != null) {
                if (count == position) {
                    previous.setNextWagon(wagon);
                    wagon.setNextWagon(current);
                    return;
                }
                previous = current;
                current = current.getNextWagon();
                count++;
            }
            if (count == position) {
                previous.setNextWagon(wagon);
            }
        }
        throw new UnsupportedOperationException("Not implemented");
    }
}
