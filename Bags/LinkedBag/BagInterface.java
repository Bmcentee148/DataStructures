/** 
	An interface that describes the operations of a bag of objects.
	@author Brian McEntee
	@version 1.0
	@since 2015-04-15
*/

public interface BagInterface<T> {

	/** Gets the current number of entries in the bag
		@return the integer number of entries in the bag */
	public int getCurrentSize();

	/** Determines whether or not the bag is full
		@return true if the bag is full, else false */
	public boolean isFull();

	/** Determines whether or not the bag is empty
		@return true if the bag is empty, else false */
	public boolean isEmpty();

	/** Removes all of the items from the bag */
	public void clear();

	/** Adds a new item to the bag
		@param newEntry the item to add to the bag
		@return true if the item was successfully added, else false */
	public boolean add(T newEntry);

	/** Removes an arbitrary item from the bag
		@return the item removed from the bag if successfull, or null */
	public T remove();

	/** Removes one occurrence of the given item from the bag
		@param entry the item to be removed from the bag
		@return the removed entry if successful, else null */
	public T remove(T entry);

	/** Determines how many times the given item occurs in the bag
		@param entry the item to be counted
		@return the number of times entry appears in the bag */
	public int getFrequencyOf(T entry);

	/** Determines whether or not the given item appears in the bag
		@param entry the item to search for
		@return true if the bag contains the item, else false */
	public boolean contains(T entry);

	/** Creates an array containing all of the elements in the bag
		@return the newly allocated array containing all of the bags elements */
	public T[] toArray();
}