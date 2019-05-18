package views;

import Models.HangmanModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class HangmanView extends JFrame {
    private final int SIZE = 500;
    private JLabel _wordToGuess;
    private JLabel _chosenBank;
    private JComboBox _lettersBank;
    private JPanel _hangman;

    public HangmanView(HangmanModel model) {
        _wordToGuess = new WordLabel(model.get_encryptedWord(), SIZE);
        _chosenBank = new UsedLettersLabel(SIZE);
        _lettersBank = new BankComboBox(model.get_lettersBank());
        _hangman = new HangmanPanel(model.get_numOfBadGuesses(), SIZE);

        setLayout(new BorderLayout());
        add(_chosenBank, BorderLayout.PAGE_START);
        add(_hangman, BorderLayout.LINE_START);
        add(_lettersBank, BorderLayout.LINE_END);
        add(_wordToGuess, BorderLayout.PAGE_END);

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setSize(new Dimension(SIZE, SIZE));
        setVisible(true);
    }

    public void showError(String s) {
        //TODO
    }

    public void addLetterSelectListener(ActionListener letterSelectedListener) {
        _lettersBank.addActionListener(letterSelectedListener);
    }

    public void updateBank(String[] lettersBank) {
        _lettersBank.removeAllItems();
        for (String s : lettersBank) {
            _lettersBank.addItem(s);
        }
        repaint();
    }

    public void updateUsedLetters(String letter) {
        var previousLetters = _chosenBank.getText().split(":");
        String temp = previousLetters.length > 1 ? previousLetters[1] : "";
        temp+= letter;
        _chosenBank.setText(orderByAlphabet(temp));
        repaint();
    }

    public void updateWord(String encryptedWord) {
        _wordToGuess.setText(encryptedWord);
        repaint();
    }

    private String orderByAlphabet(String s){
        char[] array = s.toCharArray();
        Arrays.sort(array);
        return new String(array);
    }

    public void addLineToHangman() {
        ((HangmanPanel)_hangman).addLine();
    }
}