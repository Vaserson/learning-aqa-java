import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Task_3_2 {
    public static void main(String[] args) {

        int num = 1234;

        int sum = Integer.toString(num)
                .chars()
                .map(c -> c - '0')
                .sum();

        int product = Integer.toString(num)
                .chars()
                .map(c -> c - '0')
                .reduce(1, (a,b) -> a * b);

        System.out.println(product - sum);






        int[] lst = Integer.toString(num)
                .chars()
                .map(c -> c - '0').toArray();

        int sumT = Arrays.stream(lst).sum();
        System.out.println(Arrays.stream(lst).reduce(1, (a,b) -> a*b) - sumT);

    }

}
