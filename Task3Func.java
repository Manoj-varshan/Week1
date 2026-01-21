import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Task3 {
    public static void main(String[] args) {

        int[] arr = {2, 3, 4, 10, 40};
        int key = 10;

        OptionalInt index =
                IntStream.range(0, arr.length)
                         .filter(i -> arr[i] == key)
                         .findFirst();

        if (index.isPresent()) {
            System.out.println("Element found at index: " + index.getAsInt());
        } else {
            System.out.println("Element not found");
        }
    }
}
