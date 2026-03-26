// Count words using StringTokenizer

import java.util.*;

class WordCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sentence = sc.nextLine();
        StringTokenizer st = new StringTokenizer(sentence);

        System.out.println("Word Count: " + st.countTokens());
    }
}
