package codewars;

import java.util.Arrays;

public class CreatePhoneNumber {

    public static String createPhoneNumber(int[] numbers) {
        String number = Arrays.toString(numbers).replaceAll("\\[|\\]|,|\\s", "");
        String firstPart = number.substring(0, 3);
        String secondPart = number.substring(3, 6);
        String thirdPart = number.substring(6, 10);

        return ("(" + firstPart + ")" + " " + secondPart + "-" + thirdPart);

        // return "("+n[0]+n[1]+n[2]+") "+n[3]+n[4]+n[5]+"-"+n[6]+n[7]+n[8]+n[9];

        // return String.format("(%d%d%d) %d%d%d-%d%d%d%d",numbers[0],numbers[1],numbers[2],numbers[3],numbers[4],numbers[5],numbers[6],numbers[7],numbers[8],numbers[9]);

        // return String.format("(%d%d%d) %d%d%d-%d%d%d%d", java.util.stream.IntStream.of(numbers).boxed().toArray());
    }

    public static void main(String[] args) {

        System.out.println(createPhoneNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }
}
