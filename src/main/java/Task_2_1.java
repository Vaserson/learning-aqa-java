public class Task_2_1 {

    public static int maxInt(int num) {
        int one = 0;
        int two = 0;
        int three = 0;

        while (num > 0) {
            int tmp = num % 10;
            if (tmp >= one) {
                three = two;
                two = one;
                one = tmp;
            } else {
                if (tmp >= two) {
                    three = tmp;
                    two = tmp;
                } else if (tmp > three) {
                    three = tmp;
                }
            }
            num /= 10;
        }

        return (one * 100) + (two * 10) + three;
    }

    public static void main(String[] args) {

        System.out.println(maxInt(789));
        System.out.println(maxInt(123));
        System.out.println(maxInt(989));
        System.out.println(maxInt(555));
        System.out.println(maxInt(798));

    }

}
