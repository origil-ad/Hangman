package views;

import javax.swing.*;
import java.awt.*;

public class TopPanel extends JPanel {

    private JLabel _chosenBank;
    private JComboBox _lettersBank;

    public TopPanel(JLabel chosenBank, JComboBox lettersBank, int size){
        _chosenBank = chosenBank;
        _lettersBank = lettersBank;

        setLayout(new BorderLayout());
        add(_chosenBank, BorderLayout.LINE_START);
        add(_lettersBank, BorderLayout.LINE_END);

        setSize(new Dimension(size, size /5));
    }
}