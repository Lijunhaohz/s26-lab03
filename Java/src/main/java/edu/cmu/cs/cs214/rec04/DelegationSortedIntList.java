package edu.cmu.cs.cs214.rec04;

/**
 * DelegationSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */

public class DelegationSortedIntList implements IntegerList {
    // Write your implementation below with API documentation
    
    /**
     * The SortedIntList instance to which operations are delegated.
     */
    private final SortedIntList list;
    
    /**
     * Counter to track the total number of elements added to the list.
     */
    private int totalAdded;
    
    /**
     * Constructs a new DelegationSortedIntList with an empty SortedIntList
     * and totalAdded initialized to 0.
     */
    public DelegationSortedIntList() {
        this.list = new SortedIntList();
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
        return list.add(num);
    }
    
    /**
     * Adds all of the elements of the IntegerList to the list.
     * Increments the totalAdded counter by the number of elements in the list.
     *
     * @param list IntegerList containing elements to be added to the list
     * @return true if the list changed as a result of the call
     */
    @Override
    public boolean addAll(IntegerList list) {
        totalAdded += list.size();
        return this.list.addAll(list);
    }
    
    /**
     * Returns the integer at the specified position in this list.
     *
     * @param index index of the element to return
     * @return the element at the specified position in this list
     */
    @Override
    public int get(int index) {
        return list.get(index);
    }
    
    /**
     * Removes the first occurrence of the specified element from the list,
     * if it is present.
     *
     * @param num an integer to be removed from the list, if present
     * @return true if an element was removed as a result of this call
     */
    @Override
    public boolean remove(int num) {
        return list.remove(num);
    }
    
    /**
     * Removes from the list all of its elements that are contained in the
     * specified IntegerList.
     *
     * @param list IntegerList containing elements to be removed from the list
     * @return true if the list changed as a result of the call
     */
    @Override
    public boolean removeAll(IntegerList list) {
        return this.list.removeAll(list);
    }
    
    /**
     * Returns the number of elements in this list.
     *
     * @return number of elements in the list
     */
    @Override
    public int size() {
        return list.size();
    }
    
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