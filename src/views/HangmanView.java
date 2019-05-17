package views;

import Models.HangmanModel;

import javax.swing.*;
import java.awt.*;

public class HangmanView extends JFrame {
    private JLabel _wordToGuess;
    private JLabel _chosenBank;
    private JComboBox _lettersBank;
    private JPanel _image;

    public HangmanView(HangmanModel model) {
        _wordToGuess = new GameLabel(model.get_encryptedWord());
        _chosenBank = new GameLabel("Letters Already used:");
        _lettersBank = new BankComboBox(model.get_lettersBank());
        _image = new HangmanPanel(model.get_numOfBadGuesses());

        setLayout(new BorderLayout());
        add(_chosenBank, BorderLayout.PAGE_START);
        add(_image, BorderLayout.LINE_START);
        add(_lettersBank, BorderLayout.LINE_END);
        add(_wordToGuess, BorderLayout.PAGE_END);

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setSize(new Dimension(500, 500));
        setVisible(true);
    }
    
    public void showError(String s) {
        //TODO
    }
}