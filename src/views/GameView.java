package views;
import Models.HangmanModel;

import javax.swing.*;

public class GameView extends JFrame {
    private JLabel _wordToGuess;
    private JLabel _chosenBank;
    private JComboBox _lettersBank;
    private JPanel _image;

    public GameView(HangmanModel model){
        _wordToGuess = new GameLabel(model.get_encryptedWord());
        _chosenBank = new GameLabel("");
        _lettersBank = new BankComboBox(model.get_lettersBank());

    }
}