import java.util.Random;

public class WordsGenerator {
    private static String[] getWords() {
        return new String[]{"polymorphism", "umbrella", "encyclopedia", "mattermost", "ilovejava", "yallahabayta"};
    }

    public static String generateWord() {
        var words = getWords();
        var chosen = new Random().nextInt(words.length - 1);
        return words[chosen];
    }

    public static char[] generateAlphaBet() {
        return "abcdefghijklmnopqrstuvqxyz".toCharArray();
    }
}