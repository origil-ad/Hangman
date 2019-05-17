package Models;

public class HangmanModel {
    private String[] _word;
    private String[] _encryptedWord;
    private String[] _lettersBank;
    private int _numOfBadGuesses;

    public HangmanModel(){
        reset();
    }

    public void reset() {
        _lettersBank = WordsGenerator.generateAlphaBetArray();
        _word = WordsGenerator.generateWordArray();
        _encryptedWord = new String[_word.length];
        for (int i = 0; i < _word.length; i++) {
            _encryptedWord[i] = "_";
        }
        _numOfBadGuesses = 0;
    }

    public void replaceAllCharOccurrencesInEncryptedWord(String ch) {
        for (int i = 0; i < _word.length; i++) {
            if (ch == _word[i]) {
                _encryptedWord[i] = ch;
            }
        }
        removeCharFromBank(ch);
    }

    public int get_numOfBadGuesses(){
        return _numOfBadGuesses;
    }

    public String get_word() {
        return StringArrayToString(_word);
    }

    public String get_encryptedWord() {
        return StringArrayToString(_encryptedWord);
    }

    public String[] get_lettersBank() {
        return _lettersBank;
    }

    private void removeCharFromBank(String ch) {
        String tempStr = "";
        for (int i = 0; i < _lettersBank.length; i++) {
            if (ch != _lettersBank[i]) {
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

}