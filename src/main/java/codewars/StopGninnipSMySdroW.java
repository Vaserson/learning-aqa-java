package codewars;

public class StopGninnipSMySdroW {

    public static String spinWords(String sentence) {
        String[] sentences = sentence.split(" ");
        for (int i = 0; i < sentences.length; i++) {
            if (sentences[i].length() >= 5) {
                sentences[i] = new StringBuilder(sentences[i]).reverse().toString();
            }
        }
        String delimiter = " ";
        return String.join(delimiter, sentences);

/*
        for (String a : sentence.split(" ")) {
            if (a.length() > 4) {
                sentence = sentence.replace(a, new StringBuffer(a).reverse());
            }
        }
        return sentence;
*/
/*
        return Arrays.stream(sentence.split(" "))
                .map(i -> i.length() > 4 ? new StringBuilder(i).reverse().toString() : i)
                .collect(Collectors.joining(" "));
    }
*/

    }

    public static void main(String[] args) {
        System.out.println(spinWords("Welcome"));
        System.out.println(spinWords("Hey fellow warriors"));
    }
}
