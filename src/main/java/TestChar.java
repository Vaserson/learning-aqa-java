import java.util.function.Function;

public class TestChar {
    public static void main(String[] args) {

        int chr = '-' - '0';
        System.out.println(chr);


/*
        int num = 1234567890;
        System.out.println(Integer.toString(num).chars().map(c -> c - '0').filter(f -> f % 2 != 0).sum());*/





        int num = 1234;
        System.out.println(Integer.toString(num) // Перетворення інта в стрінгу
                .chars() // Перетворення стрінги в intStream (ASCII значення символів)
                        /*
                        '0' = 48
                        '1' = 49
                        '2' = 50
                        ........
                        '9' = 57
                        'A' = 65
                        'z' = 122
                        */

                .map(c -> c - '0') // хитрість для отримання нормальних інтових значень:
                        /*
                        '1' - '0' = 49 - 48 = 1
                        '9' - '0' = 57 - 48 = 9`
                        і т.д.
                         */

                .filter(f -> f % 2 != 0) // фільтрація значень (тільки непарні в даному випадку)
                .sum()); // простий метод який додасть всі значення (які залишились після фільтрації)
    }

}
