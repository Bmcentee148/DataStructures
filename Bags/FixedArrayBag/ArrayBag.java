/**
	This uses a fixed sized array to implement the ADT bag
	@author Brian McEntee
	@version 1.0
*/

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

	public int getCurrentSize() {
		return numEntries;
	}

	public boolean isFull() {
		return numEntries == bag.length;
	}

	public boolean isEmpty() {
		return numEntries == 0;
	}

	public void clear() {
		//TODO
	}

	public boolean add(T newEntry) {
		boolean status = false;
		if(newEntry!= null && !isFull()) {
			bag[numEntries] = newEntry;
			numEntries++;
			status = true;
		}
		return status;
	}

	public T remove() {
		//TODO
		return null;
	}

	public T remove(T entry) {
		//TODO
		return null;
	}

	public int getFrequencyOf(T entry) {
		//TODO
		return 0;
	}

	public boolean contains(T entry) {
		//TODO
		return false;
	}

	public T[] toArray() {
		@SuppressWarnings("unchecked")
		T[] result = (T[])new Object[numEntries];
		for(int i = 0; i < numEntries; i++)
			result[i] = (T)bag[i];
		return result;
	}






}