/** This class will implement the ADT bag by linking data
    @author Brian McEntee
    @version 1.0 */

public class LinkedBag<T> implements BagInterface<T> {

    /** Gets the current number of entries in the bag
        @return the integer number of entries in the bag */
    public int getCurrentSize(){
        //TODO
        return -1;
    }

    /** Determines whether or not the bag is full
        @return true if the bag is full, else false */
    public boolean isFull(){
        //TODO
        return false;
    }

    /** Determines whether or not the bag is empty
        @return true if the bag is empty, else false */
    public boolean isEmpty(){
        //TODO
        return false;
    }

    /** Removes all of the items from the bag */
    public void clear(){
        //TODO
    }

    /** Adds a new item to the bag
        @param newEntry the item to add to the bag
        @return true if the item was successfully added, else false */
    public boolean add(T newEntry){
        //TODO
        return false;
    }

    /** Removes an arbitrary item from the bag
        @return the item removed from the bag if successfull, or null */
    public T remove(){
        //TODO
        return null;
    }

    /** Removes one occurrence of the given item from the bag
        @param entry the item to be removed from the bag
        @return the removed entry if successful, else null */
    public T remove(T entry){
        //TODO
        return null;        
    }

    /** Determines how many times the given item occurs in the bag
        @param entry the item to be counted
        @return the number of times entry appears in the bag */
    public int getFrequencyOf(T entry){
        //TODO
        return -1;
    }

    /** Determines whether or not the given item appears in the bag
        @param entry the item to search for
        @return true if the bag contains the item, else false */
    public boolean contains(T entry){
        //TODO
        return false;
    }

    /** Creates an array containing all of the elements in the bag
        @return the newly allocated array containing all of the bags elements */
    public T[] toArray(){
        //TODO
        return null;
    }

    //private inner utility class for linking data
    private class Node {

        private Node nextNode; //reference to next node
        private T data; //data stored

        private Node(T data) {
            this(data,null); 
        }

        private Node(T data, Node nextNode) {
            this.data = data;
            this.nextNode = nextNode;
        }
    } //end Node 
}

