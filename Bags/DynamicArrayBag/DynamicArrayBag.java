/**
	This uses a fixed sized array to implement the ADT bag
	@author Brian McEntee
	@version 1.0
*/
import java.util.Arrays;

public class ArrayBag<T> implements BagInterface<T> {

	private static final int DEFAULT_CAPACITY = 20;
	private T[] bag;
	private int numEntries;

	@SuppressWarnings("unchecked")
	public ArrayBag(int capacity) {
		//the cast is safe because the array contains null entries
		T[] tempBag = (T[])new Object[capacity];  //unchecked cast
		bag = tempBag;
		numEntries = 0;
	}

	public ArrayBag() {
		this(DEFAULT_CAPACITY); 
	}

	/** Gets the current number of entries in the bag
		@return the integer number of entries in the bag */
	public int getCurrentSize() {
		return numEntries;
	}

	/** Determines whether or not the bag is full
		@return true if the bag is full, else false */
	public boolean isFull() {
		return numEntries == bag.length;
	}

	/** Determines whether or not the bag is empty
		@return true if the bag is empty, else false */
	public boolean isEmpty() {
		return numEntries == 0;
	}

	/** Removes all of the items from the bag */
	public void clear() {
		@SuppressWarnings("unchecked")
		T[] emptyBag = (T[])new Object[DEFAULT_CAPACITY];
		bag = emptyBag;
		numEntries  = 0;

		/*	We could just continually remove until the bag is
			empty. This is easier to program but is the bag is large
			performance will drop.

			while(!isEmpty()) {
				remove();
			}
		*/

	}

	/** Adds a new item to the bag
		@param newEntry the item to add to the bag
		@return true if the item was successfully added, else false */
	public boolean add(T newEntry) {
		boolean status = false;
		if(newEntry!= null && !isFull()) {
			bag[numEntries] = newEntry;
			numEntries++;
			status = true;
		}
		return status;
	}

	/** Removes an arbitrary item from the bag
		@return the item removed from the bag if successfull, or null */
	public T remove() {
		return removeFromIndex(numEntries - 1);
	}


	/** Removes one occurrence of the given item from the bag
		@param entry the item to be removed from the bag
		@return the removed entry if successful, else null */
	public T remove(T entry) {
		int index = getIndexOf(entry);
		return removeFromIndex(index);
	}

	/** Determines how many times the given item occurs in the bag
		@param entry the item to be counted
		@return the number of times entry appears in the bag */
	public int getFrequencyOf(T entry) {
		int freq = 0;
		for(int i = 0; i < numEntries; i++) {
			if(bag[i].equals(entry))
				freq++;
		}
		return freq;
	}

	/** Determines whether or not the given item appears in the bag
		@param entry the item to search for
		@return true if the bag contains the item, else false */
	public boolean contains(T entry) {
		return getIndexOf(entry) > -1;
		
	}


	/** Creates an array containing all of the elements in the bag
		@return the newly allocated array containing all of the bags elements */
	public T[] toArray() {
	/*
		@SuppressWarnings("unchecked")
		T[] result = (T[])new Object[numEntries];
		for(int i = 0; i < numEntries; i++)
			result[i] = (T)bag[i];
		return result;
	*/
		return Arrays.copyOf(bag,numEntries); //quicker
	}

	/** Finds the index of the given entry
		@param entry the element to look for
		@return the integer index of the entry in the array if contained, else -1 */
	private int getIndexOf(T entry) {
		int index = -1;
		for(int i = 0; i < numEntries; i++){
			if(bag[i].equals(entry)){
				index = i;
				break;
			}
		}
		return index;
	}

	/** Removes the element at the given entry from the array, and
		replaces it with the arrays last element.
		@param index the integer index of the element in the array to be removed
		@return the object removed from the array */
	private T removeFromIndex(int index) {
		T removedEntry = null;
		if(index >=0 && index < numEntries) {
			this.numEntries --;
			removedEntry = this.bag[index];
			this.bag[index] = this.bag[numEntries];
			this.bag[numEntries] = null; 
		}
		return removedEntry;
	}


}