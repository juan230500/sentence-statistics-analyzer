
public class ResultFormatter {

    public static String formatResults(int wordCount, double avgWordLength, String longestWord, boolean isQuestion, int letterCount) {
        String result = "Analysis Results:\n";
        result += "Word count: " + wordCount + "\n";
        result += "Average word length: " + avgWordLength + "\n";
        result += "Longest word: " + longestWord + "\n";
        result += "Is question: " + (isQuestion ? "Yes" : "No") + "\n";
        result += "Count of 'a': " + letterCount;
        return result;
    }
}
