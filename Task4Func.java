import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {

        int[] arr = {2, 3, 4, 10, 40};

        int max = Arrays.stream(arr)
                        .max()
                        .orElseThrow();

        System.out.println("Maximum element is: " + max);
    }
}
