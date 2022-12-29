import java.util.stream.Stream;

public class Task_4_2 {

    public static int fiboSum(int num) {
        return Stream.iterate(new int[]{0, 1}, n -> new int[]{n[1], n[0] + n[1]})
                .limit(num)
                .map(y -> y[0])
                .mapToInt(Integer::intValue)
//                .mapToInt(i -> i)
                .sum();
    }

    public static void main(String[] args) {

        System.out.println(fiboSum(45));

    }


}
