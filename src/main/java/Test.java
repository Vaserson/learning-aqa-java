import java.util.Arrays;
import java.util.Collections;

public class Test {


    public static void main(String[] args) {
//        String testString = "D Pictures 1% (1 of 400)";
//        System.out.println(getNumbersFromMessage(testString));

        int conditionalNumberDigits = 0;
        int maxNumberDigits = 159;

        conditionalNumber(conditionalNumberDigits);
        maxNumber(maxNumberDigits);
        System.out.println();

        int number = 1234;

        int sum = Integer.toString(number)
                .chars().map(c -> c-'0').boxed()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("The sum of digits: " + sum);

        int mult = Integer.toString(number)
                .chars().map(c -> c-'0').boxed()
                .mapToInt(Integer::intValue)
                .reduce(2, (a,b) -> a * b);
        System.out.println("Multiply result: " + mult);

        System.out.println("Final result: " + (mult - sum));


        System.out.println(digitsSum(number));
        System.out.println(digitsMult(number));


        int oddSumResult = 0;

        int num2 = 1234567;
        int[] digits2 = Integer.toString(num2).chars().map(c -> c - '0').toArray();
        for (int d : digits2) {
            if (d % 2 != 0) {
                oddSumResult += d;
            }
        }
        System.out.println("oddSumResult: " + oddSumResult);
    }



    public static void conditionalNumber(int num) {
        System.out.println(num > 0 ? num * num : num * -1);
    }

    public static void maxNumber(int num) {
        int[] digits = Integer.toString(num)
                .chars()
                .map(c -> c - '0')
                .boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();
        Arrays.stream(digits).forEach(System.out::print);
    }

    public static int digitsSum (int i) {
        return i == 0 ? 0 : i % 10 + digitsSum(i / 10);
    }

    public static int digitsMult (int i) {
        return i == 0 ? 0 : i % 10 * digitsMult(i / 10);
    }

    public static long addDigitsSum (int i) {
        int s = 0;
        return i == 0 ? 0 : i % 10 + digitsSum(i / 10);
    }
}


















//        System.out.println(Arrays.toString(digits)); // outputs [6, 5, 4, 3, 2, 1]
//        System.out.println(Arrays.toString(digits)); // outputs [6, 5, 4, 3, 2, 1]

/*        int res=0;
        for(int i=0;i<ar.length;i++) {
            res=res*10+ar[i];*/
//        }

        /*
    public static String getNumbersFromMessage(String testString) throws ParseException {
        String[] split1;
        String[] dateArr;
        Date parsedTime;
        split1 = testString.split("at ");
        String date = split1[1];
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm");
        parsedTime = simpleDateFormat.parse(split1[1]);


//        dateTime = simpleDateFormat.parse(time + " AM " + date);

        return parsedTime.toString();
//        return Arrays.toString(split1);
    }
}*/

/*
public class Test {


    public static void main(String[] args) {
        String testString = "+1(3423) dfsdfdf 324 3423 343 fjadjflajd 0124567 2348ds wfwe3234 rewr";
        System.out.println(getNumbersFromMessage(testString));
    }
    public static String getNumbersFromMessage(String testString) {
        System.out.println("The string is: " + testString);
        Pattern pattern = Pattern.compile("\\d{6}");
        Matcher matcher = pattern.matcher(testString);
        matcher.find();
        System.out.println("The verification code is: " + matcher.group());
        return matcher.group();
    }
}*/

/*
public static String getNumbersFromMessage(String testString) {
        String croped = testString.replaceAll("[^-?0-9]+", " ");
        return Arrays.asList(croped.trim().split(" ")).get(2);
        }
        */
