/** This will implement the ADT bag by using an array which grows dynamically
	so there is no size restriction */

public class DynamicArrayBag<T> extends ArrayBag<T> {

	public DynamicArrayBag(int initialSize) {
		super(initialSize);
	}

	public DynamicArrayBag(){
		super();
	}

	public boolean add(T entry) {
		if(isFull()) {
			int len = this.getCurrentSize();

			T[] currBag = this.toArray();
			
			for(int i = 0; i < len; i++) {
				this.add(currBag[i]);
			}
		}
		return false;
	}
}