package codewars;

public class GetSum {
    public static int getSum(int a, int b) {
        if (a == b)
            return a;

        int sum = b;

        if (a < b) {
            do {
                sum += a;
                a++;
            }
            while (a != b);

        } else {
            do {
                sum += a;
                a--;
            }
            while (a != b);

        }
        return sum;

/*        int sum = 0;

        if(a < b)
            while(a <= b) { sum += a; a++; }
        else if(a > b)
            while(b <= a) { sum += b; b++; }
        else
            return a;

        return sum;
*/


    }

    public static void main(String[] args) {
        System.out.println(getSum(0, 4));
        System.out.println(getSum(0, -1));
    }

}
