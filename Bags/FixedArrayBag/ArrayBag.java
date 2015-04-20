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
		//TODO
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
		//TODO
		return null;
	}


	/** Removes one occurrence of the given item from the bag
		@param entry the item to be removed from the bag
		@return the removed entry if successful, else null */
	public T remove(T entry) {
		//TODO
		return null;
	}

	/** Determines how many times the given item occurs in the bag
		@param entry the item to be counted
		@return the number of times entry appears in the bag */
	public int getFrequencyOf(T entry) {
		//TODO
		return 0;
	}

	/** Determines whether or not the given item appears in the bag
		@param entry the item to search for
		@return true if the bag contains the item, else false */
	public boolean contains(T entry) {
		//TODO
		return false;
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






}