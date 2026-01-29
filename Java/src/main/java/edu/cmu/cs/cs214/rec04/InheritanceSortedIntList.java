package edu.cmu.cs.cs214.rec04;


/**
 * InheritanceSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */

public class InheritanceSortedIntList extends SortedIntList {
    // Write your implementation below with API documentation
    
    /**
     * Counter to track the total number of elements added to the list.
     */
    private int totalAdded;
    
    /**
     * Constructs a new InheritanceSortedIntList with totalAdded initialized to 0.
     */
    public InheritanceSortedIntList() {
        super();
        this.totalAdded = 0;
    }
    
    /**
     * Adds the specified int to the list and increments the totalAdded counter.
     *
     * @param num an integer to be added to the list
     * @return true if the list is changed as a result of the call
     */
    @Override
    public boolean add(int num) {
        totalAdded++;
        return super.add(num);
    }

    /**
     * No need to override addAll since add() is already overridden.
     * Calling the superclass's addAll will use the overridden add() method.
     * And thus, totalAdded will be updated correctly.
     */
    
    /**
     * Returns the total number of elements that have been added to the list
     * since it was created. This is not the same as the current size, which
     * can be reduced when elements are removed.
     *
     * @return the total number of elements added to the list
     */
    public int getTotalAdded() {
        return totalAdded;
    }
}