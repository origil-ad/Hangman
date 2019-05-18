package views;

import Models.HangmanModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class HangmanView extends JFrame {
    private final int SIZE = 800;
    private JLabel _wordToGuess;
    private JLabel _chosenBank;
    private JComboBox _lettersBank;
    private JPanel _hangman;
    private JPanel _topPanel;

    public HangmanView(HangmanModel model) {
        _wordToGuess = new WordLabel(model.get_encryptedWord(), SIZE);
        _hangman = new HangmanPanel(model.get_numOfBadGuesses(), SIZE);
        _chosenBank = new UsedLettersLabel(SIZE);
        _lettersBank = new BankComboBox(model.get_lettersBank(), SIZE);
        _topPanel = new TopPanel(_chosenBank, _lettersBank, SIZE);

        setLayout(new BorderLayout());
        add(_topPanel, BorderLayout.PAGE_START);
        add(_hangman, BorderLayout.LINE_START);
        add(_wordToGuess, BorderLayout.PAGE_END);

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setSize(new Dimension(SIZE, SIZE));
        setVisible(true);
    }

    public void reset(HangmanModel model){
        _wordToGuess.setText(model.get_encryptedWord());
        ((HangmanPanel)_hangman).set_lines(0);
        _chosenBank.setText("");
        updateBank(model.get_lettersBank());
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