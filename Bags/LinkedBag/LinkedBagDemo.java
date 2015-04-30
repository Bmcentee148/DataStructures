import java.util.Arrays;

public class LinkedBagDemo {

    public static void main(String [] args) {
        LinkedBag<String> testBag = new LinkedBag<String>();
        testBag.add("Hello");
        testBag.add("World");
        testBag.add("This");
        testBag.add("is");
        testBag.add("a");
        testBag.add("test");
        displayBag(testBag); // prints "test a is this world hello \n 6"

        testBag.remove();
        testBag.remove();
        displayBag(testBag); // prints "is this world hello \n 4"

        System.out.println(testBag.contains("Hello")); //true
        System.out.println(testBag.contains("Not in here")); //false

        testBag.add("World");
        testBag.add("is");
        testBag.add("is");

        System.out.println(testBag.getFrequencyOf("Not in here")); //0
        System.out.println(testBag.getFrequencyOf("Hello")); //1
        System.out.println(testBag.getFrequencyOf("World")); //2
        System.out.println(testBag.getFrequencyOf("is")); //3
    }
    public static void displayBag(LinkedBag strings) {
        System.out.println(Arrays.toString(strings.toArray()));
        System.out.println(strings.getCurrentSize());
    }
}