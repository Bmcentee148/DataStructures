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
        displayBag(testBag); // prints "test a is this world hello"

        testBag.remove();
        testBag.remove();
        displayBag(testBag);



    }
    public static void displayBag(LinkedBag strings) {
        System.out.println(Arrays.toString(strings.toArray()));
        System.out.println(strings.getCurrentSize());
    }
}