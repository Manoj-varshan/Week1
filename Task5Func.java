import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {

        int[] arr = {2, 5, 63, 63, 86, 23, 98};
        int k = 3;

        int kthSmallest =
                Arrays.stream(arr)
                      .sorted()
                      .skip(k - 1)
                      .findFirst()
                      .orElseThrow();

        System.out.println(k + "th smallest element is: " + kthSmallest);
    }
}
