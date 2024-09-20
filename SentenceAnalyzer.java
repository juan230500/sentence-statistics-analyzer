
public class SentenceAnalyzer {

    public static String[] splitSentence(String sentence) {
        return sentence.split(" ");
    }

    public static int countWords(String[] words) {
        return words.length;
    }

    public static double calculateAvgWordLength(String[] words) {
        int totalLength = 0;
        for (String word : words) {
            totalLength += word.length();
        }
        return (double) totalLength / words.length;
    }

    public static String findLongestWord(String[] words) {
        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }

    public static boolean isQuestion(String sentence) {
        return sentence.charAt(sentence.length() - 1) == '?';
    }

    public static int countLetter(String sentence, char letter) {
        int count = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == letter) {
                count++;
            }
        }
        return count;
    }
}
