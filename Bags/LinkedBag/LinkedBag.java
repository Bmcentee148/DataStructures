/** This class will implement the ADT bag by linking data
    @author Brian McEntee
    @version 1.0 */

public class LinkedBag<T> implements BagInterface<T> {

    private Node headNode;
    private int numEntries;

    public LinkedBag() {
        headNode = null;
        numEntries = 0;
    }

    /** Gets the current number of entries in the bag
        @return the integer number of entries in the bag */
    public int getCurrentSize(){
       return numEntries;
    }

    /** Determines whether or not the bag is full
        @return true if the bag is full, else false */
    public boolean isFull(){
        return false;
    }

    /** Determines whether or not the bag is empty
        @return true if the bag is empty, else false */
    public boolean isEmpty(){
        return numEntries == 0;
    }

    /** Removes all of the items from the bag */
    public void clear(){
        //TODO
    }

    /** Adds a new item to the bag
        @param newEntry the item to add to the bag
        @return true if the item was successfully added, else false */
    public boolean add(T newEntry){
        Node newNode = new Node(newEntry,headNode);
        headNode = newNode;
        numEntries++;
        return true;
    }

    /** Removes an arbitrary item from the bag
        @return the item removed from the bag if successfull, or null */
    public T remove(){
        Node removedNode = headNode;
        T removedData = headNode.data;
        headNode = headNode.nextNode;
        removedNode = null;
        numEntries--;
        return removedData;
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
        @SuppressWarnings("unchecked")
        T[] entries = (T[])new Object[numEntries];

        Node currentNode = headNode;
        int index = 0;
        while(index < numEntries && currentNode != null) {
            entries[index] = currentNode.data;
            index++;
            currentNode = currentNode.nextNode;
        }
        
        return entries;
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

