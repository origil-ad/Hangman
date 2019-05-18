import Models.HangmanModel;
import views.HangmanView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HangmanController {

    private final int MAX_BAD_GUESSES = 10;
    private HangmanView _view;
    private HangmanModel _model;

    public HangmanController(HangmanView view, HangmanModel model) {
        _model = model;
        _view = view;
        _view.addLetterSelectListener(new letterSelectedListener());
    }

    /** When a letter is selected.
     *  1. Get the user input letter from the View.
     *  2. check if exist in model
     *  3.1 yes
         *  3.1.1 Call the Model to replace all occurrences.
         *  3.1.2 call the Model to update the bank
         *  3.1.3 call the View to update used-letters
         *  3.1.4 check if game is over
         *  3.1.5 yes
             *  3.1.5.1 game completed
         *  3.1.6 no
             * 3.1.6.1 do nothing
     *  3.2 no
         *  3.2.1 call the Model to update the bank and used-letters
         *  3.2.2 call the View to add line to hangman
         *  3.2.3 check if game is over
         *  3.2.4 yes
            *  3.2.4.1 game over
         *  3.2.5 no
            * 3.2.5.1 do nothing
     *
     * If there was an error, tell the View to display it.
     */

    class letterSelectedListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String userInput = "";
            try {
                JComboBox combo = (JComboBox) e.getSource();
                var letter = (String) combo.getSelectedItem();
                if (_model.isLetterInWord(letter)) {
                    _model.replaceAllCharOccurrencesInEncryptedWord(letter);
                    _view.updateWord(_model.get_encryptedWord());
                    if (!_model.get_encryptedWord().contains("_")){
                        gameEnd("Game Completed !");
                    }
                } else {
                    _view.addLineToHangman();
                    _model.addBadGuess();
                    if (_model.get_numOfBadGuesses() >= MAX_BAD_GUESSES){
                        gameEnd("game over !");
                    }
                }
                _model.removeCharFromBank(letter);
                _view.updateBank(_model.get_lettersBank());
                _view.updateUsedLetters(letter);

            } catch (Exception ex) {
            }
        }
    }

    private void gameEnd(String text){
        System.out.println(text);
        var result = JOptionPane.showConfirmDialog(_view, "Would you like another try?", text, JOptionPane.YES_NO_OPTION);
        if (result == 0){
            _model.reset();
            _view.reset(_model);
        }
        else {
            _view.dispose();
        }
    }
}