public class PrintAllChars {
    public static void main(String[] args) {

/*        int temp = 0;

        for (int i = 0; i < 100; i += 1) {
            temp = temp + 1004095;
            System.out.println(temp);
        }*/


        char chr;
        for (int i = 0; i < 65536; i++) {
            chr = (char) i;
            System.out.print(chr + " ");
//            System.out.println(i + ": " + chr + " ");
        }

    }
}
