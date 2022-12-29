public class TestLambda {


    @FunctionalInterface
    public interface Testable {
        int someMethod(int a, int b);
    }


    public static void main(String[] args) {
        Testable tPlus = new Testable() {
            @Override
            public int someMethod(int a, int b) {
                return a + b;
            }
        };
        Testable tMinus = new Testable() {
            @Override
            public int someMethod(int a, int b) {
                return a - b;
            }
        };
        Testable tMult = new Testable() {
            @Override
            public int someMethod(int a, int b) {
                return a * b;
            }
        };

        Testable tDiv = (a, b) -> a / b;

        Testable tDivDbl = new Testable() {
            @Override
            public int someMethod(int a, int b) {
                if (a > b)
                    return a / b;
                else
                    return b / a;
            }
        };

        System.out.println(tPlus.someMethod(10, 5));
        System.out.println(tMinus.someMethod(10, 5));
        System.out.println(tMult.someMethod(10, 5));
        System.out.println(tDiv.someMethod(10, 5));

        System.out.println(tDivDbl.someMethod(100, 5));
        System.out.println(tDivDbl.someMethod(5, 100));
    }
}
