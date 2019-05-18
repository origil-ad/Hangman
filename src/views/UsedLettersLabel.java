package views;

import javax.swing.*;
import java.awt.*;

public class UsedLettersLabel extends JLabel {

    public UsedLettersLabel(int size) {
        super("", SwingConstants.LEFT);
        setPreferredSize(new Dimension(size*4/5, size / 5));
        setFont(new Font("SansSerif", Font.BOLD, 20));
    }

    @Override
    public void setText(String text) {
        super.setText("Letters Already used:" + text);
    }
}