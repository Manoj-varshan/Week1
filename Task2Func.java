import java.util.*;
import java.util.stream.*;

public class Task1Func {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an index value: ");
        int index = sc.nextInt();

        IntStream.of(numbers)
                 .skip(index)
                 .findFirst()
                 .ifPresentOrElse(
                     value -> System.out.println("Value at index " + index + " is: " + value),
                     () -> System.out.println("Invalid index")
                 );
    }
}
