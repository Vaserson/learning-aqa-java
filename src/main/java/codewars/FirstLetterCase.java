package codewars;

import org.apache.commons.text.WordUtils;

public class FirstLetterCase {
    public static String toJadenCase(String phrase) {

        if (phrase == null) {
            return null;
        }
        String[] words = phrase.split(" ");
        String delimiter = " ";
        if (phrase.length() == 0) {
            return null;
        }
            for (int i = 0; i < words.length; i++) {
                words[i] = words[i].substring(0,1).toUpperCase() + words[i].substring(1);
            }
            return String.join(delimiter, words);


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

//    <dependencies>
//        <dependency>
//            <groupId>org.apache.commons</groupId>
//            <artifactId>commons-text</artifactId>
//            <version>1.9</version>
//        </dependency>
//    </dependencies>
*/
    }
    public static void main(String[] args) {
        System.out.println(toJadenCase("most trees are blue"));
        System.out.println(toJadenCase(""));
        System.out.println(toJadenCase(null));

    }
}
