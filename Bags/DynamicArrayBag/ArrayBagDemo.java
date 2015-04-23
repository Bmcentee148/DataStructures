import java.util.Arrays;

public class ArrayBagDemo {
	
	public static DynamicArrayBag<String> bag;
	public static void main(String[] args) {
		
		bag = new DynamicArrayBag<String>();
		System.out.println(bag.isEmpty()); //true
		System.out.println(bag.isFull()); //false

		for(int i = 0; i < 50; i++) {
			boolean result = bag.add("str: " + i);
			System.out.println(result);
		}

		System.out.println(bag.isFull()); //true

		display();

		//LEAD TO CLASS CAST EXCEPTION THROWN. NEED WORKAROUND.
		//String [] strings = bag.toArray();
		//System.out.println(Arrays.toString(strings));
		
		System.out.println(bag.contains("str: " + 19)); //true;
		System.out.println(bag.contains("not contained")); //false;

		bag.remove();
		bag.remove();
		bag.remove("str: " + 0);
		bag.remove("str: " + 3);
		System.out.println(bag.getCurrentSize());
		display();

		bag.add("str: " + 2);
		bag.add("str: " + 2);
		
		System.out.println( bag.getFrequencyOf("str: " + 2) ); //3
		System.out.println(bag.getFrequencyOf("no frequency")); //0

		System.out.println(bag.isFull()); //false
		System.out.println(bag.isEmpty()); //false;

		bag.clear();

		System.out.println(bag.isFull()); //false
		System.out.println(bag.isEmpty()); //true



	}

	public static void display() {
		System.out.println(Arrays.toString(bag.toArray()));
	}

}