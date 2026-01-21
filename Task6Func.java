import java.util.stream.IntStream;

class Check {

    public void oddeven(int input1, String input2) {

        String type = input2.toLowerCase();

        if (!type.equals("even") && !type.equals("odd")) {
            System.out.println("Invalid Input Operation");
            return;
        }

        int sum =
                String.valueOf(input1)
                      .chars()
                      .map(c -> c - '0')
                      .filter(d -> type.equals("even") ? d % 2 == 0 : d % 2 != 0)
                      .sum();

        System.out.println(type.substring(0, 1).toUpperCase() + type.substring(1) + ": " + sum);
    }
}

public class Task6 {
    public static void main(String[] args) {
        Check obj = new Check();

        obj.oddeven(1234, "Od");
        obj.oddeven(1234, "Even");
        obj.oddeven(25123, "ODD");
    }
}
