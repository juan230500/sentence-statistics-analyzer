
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();

        String[] words = SentenceAnalyzer.splitSentence(sentence);
        int wordCount = SentenceAnalyzer.countWords(words);
        double avgWordLength = SentenceAnalyzer.calculateAvgWordLength(words);
        String longestWord = SentenceAnalyzer.findLongestWord(words);
        boolean isQuestion = SentenceAnalyzer.isQuestion(sentence);
        int letterCount = SentenceAnalyzer.countLetter(sentence, 'a');

        String result = ResultFormatter.formatResults(wordCount, avgWordLength, longestWord, isQuestion, letterCount);
        System.out.println(result);

        scanner.close();
    }
}
