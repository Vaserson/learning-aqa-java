public class Task_4_1 {

    public static int fiboSum (int num) {
        int sum = 0;
        int[] fibo = new int[num];
        fibo[0] = 0;
        fibo[1] = 1;
        for (int i = 2; i < fibo.length; ++i) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
            sum += fibo[i];
        }
        return fibo[1] + sum;
    }

    public static void main(String[] args) {

        System.out.println(fiboSum(45));

    }


}
