package views;

import javax.swing.*;
import java.awt.*;

public class UsedLettersLabel extends JLabel {

    UsedLettersLabel(int size) {
        super("", SwingConstants.LEFT);
        setPreferredSize(new Dimension(size*4/5, size / 10));
        setFont(new Font("SansSerif", Font.BOLD, 25));
    }

    @Override
    public void setText(String text) {
        super.setText("Letters Already used:" + text);
    }
}