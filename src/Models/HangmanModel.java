package Models;

public class HangmanModel {
    private String[] _word;
    private String[] _encryptedWord;
    private String[] _lettersBank;
    private int _numOfBadGuesses;

    public HangmanModel() {
        reset();
    }

    public void reset() {
        _word = WordsGenerator.generateWordArray();
        _encryptedWord = new String[_word.length];
        for (int i = 0; i < _word.length; i++) {
            _encryptedWord[i] = "_";
        }
        _lettersBank = WordsGenerator.generateAlphaBetArray();
        _numOfBadGuesses = 0;
    }

    public void replaceAllCharOccurrencesInEncryptedWord(String ch) {
        for (int i = 0; i < _word.length; i++) {
            if (ch.equals(_word[i])) {
                _encryptedWord[i] = ch;
            }
        }
    }

    public int get_numOfBadGuesses() {
        return _numOfBadGuesses;
    }

    public String get_word() {
        return StringArrayToString(_word);
    }

    public boolean isLetterInWord(String letter){
        for (int i = 0; i < _word.length; i++) {
            if (letter.equals(_word[i])) {
                return true;
            }
        }
        return false;
    }

    public String get_encryptedWord() {
        return StringArrayToString(_encryptedWord);
    }

    public String[] get_lettersBank() {
        return _lettersBank;
    }

    public void removeCharFromBank(String ch) {
        String tempStr = "";
        for (int i = 0; i < _lettersBank.length; i++) {
            if (!ch.equals(_lettersBank[i])) {
                tempStr += _lettersBank[i];
            }
        }
        _lettersBank = tempStr.split("");
    }

    private String StringArrayToString(String[] array) {
        String tempStr = "";
        for (int i = 0; i < array.length; i++) {
            tempStr += array[i];
        }
        return tempStr;
    }

    public void addBadGuess() {
        _numOfBadGuesses++;
    }
}