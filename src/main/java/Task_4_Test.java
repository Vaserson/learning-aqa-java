import java.util.stream.Stream;

public class Task_4_Test {


    public static void test1(int num) {
        Stream.iterate(2, n -> n + 2)
                .limit(num)
                .forEach(System.out::println);
    }


    public static void test2(int num) {
        Stream.iterate(0, n -> n + 1)
                .filter(x -> x % 2 == 0)
                .limit(num)
                .forEach(System.out::println);
    }

    public static void main(String[] args) {

        test2(10);

    }


}
