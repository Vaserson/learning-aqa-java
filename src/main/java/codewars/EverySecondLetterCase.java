package codewars;

public class EverySecondLetterCase {
    public static String everySecondToUpperCase(String phrase) {

        String[] letters = phrase.split("");
        String delimiter = "";
        int tmp = 1;
            for (int i = 0; i < letters.length; i++) {
                if (tmp == 1) {
                    letters[i] = letters[i].toUpperCase();
                    tmp *= -1;
                } else {
                    tmp *= -1;
                }
//                words[i] = words[i].substring(0,1).toUpperCase() + words[i].substring(1);
            }
            return String.join(delimiter, letters);


/*        if (null == phrase || phrase.length() == 0) {
            return null;
        }

        return Arrays.stream(phrase.split(" "))
                .map(i -> i.substring(0, 1).toUpperCase() + i.substring(1, i.length()))
                .collect(Collectors.joining(" "));
    }
*/

/*        if(phrase == ""){
            return null;
        }
        else{
            return WordUtils.capitalize(phrase);
        }
*/
    }
    public static void main(String[] args) {
        System.out.println(everySecondToUpperCase("most trees are blue"));

    }
}
