public class TestLambdaGeneric {


    @FunctionalInterface
    public interface Testable<T> {
        T someMethod(T a, T b);
    }


    public static void main(String[] args) {

        Testable<Integer> tPlusInt = new Testable<Integer>() {
            @Override
            public Integer someMethod(Integer a, Integer b) {
                return a + b;
            }
        };

        Testable<String> tPlusStr = (a, b) -> a + b;

        Testable<Double> tPlusDbl = Double::sum;

        System.out.println(tPlusInt.someMethod(10, 5));
        System.out.println(tPlusStr.someMethod("10", "5"));
        System.out.println(tPlusDbl.someMethod(10.1, 5.5));
    }
}
