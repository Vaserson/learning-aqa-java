public class Task_2_2 {


    public static void main(String[] args) {

        System.out.println(maxInt(132));
        System.out.println(maxInt(555));
        System.out.println(maxInt(989));
        System.out.println(maxInt(987));
        System.out.println(maxInt(1234));
        System.out.println(maxInt(200321));
    }

    public static int maxInt(int num) {
        int[] maxNum = Integer.toString(num)
                .chars()
                .sorted()
                .map(c -> c - '0')
                .toArray();
//        return maxNum[0] + (maxNum[1] * 10) + (maxNum[2] * 100);
        return maxNum[maxNum.length-3] + (maxNum[maxNum.length-2] * 10) + (maxNum[maxNum.length-1] * 100);
    }


}
