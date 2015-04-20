import java.util.Arrays;

public class ArrayBagDemo {
	
	public static ArrayBag<String> bag;
	public static void main(String[] args) {
		
		bag = new ArrayBag<String>();
		System.out.println(bag.isEmpty()); //true
		System.out.println(bag.isFull()); //false

		for(int i = 0; i < 25; i++) {
			boolean result = bag.add("str: " + i);
			System.out.println(result);
		}

		System.out.println(bag.isFull()); //true

		display();

		//LEAD TO CLASS CAST EXCEPTION THROWN. NEED WORKAROUND.
		//String [] strings = bag.toArray();
		//System.out.println(Arrays.toString(strings));
		
		

	}

	public static void display() {
		System.out.println(Arrays.toString(bag.toArray()));
	}
}