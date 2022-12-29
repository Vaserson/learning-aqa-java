public class Task_3_1 {

    public static int someSum (int num) {
        return Integer.toString(num)
                .chars()
                .map(c -> c - '0')
                .filter(f -> f % 2 != 0)
                .sum();
    }

    public static void main(String[] args) {
        System.out.println(someSum(-2));

        String someString = "Hi";
        System.out.println(someString.charAt(1));

/*        Integer.toString(num)
                .chars()
                .map(c -> c - '0')
                .filter(f -> f % 2 != 0)
                .forEach(p -> System.out.println("Odd: " + p));*/




        int num2 = 1234;
        int sum2 = 0;
        while (num2 > 0) {
            int tmp = num2 % 10;
            if (tmp % 2 != 0) {
                sum2 += tmp;
            }
            num2 /= 10;
        }
        System.out.println("sum2 = " + sum2);







        int num3 = -123;
        int sum3 = 0;
        do {
            int tmp = num3 % 10;
            if (tmp % 2 != 0) {
                sum3 += tmp;
            }
            num3 /= 10;
        }
        while (num3 > 0);

        System.out.println("sum3 = " + sum3);
    }


}
