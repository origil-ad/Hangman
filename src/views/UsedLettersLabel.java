package views;

import javax.swing.*;
import java.awt.*;

public class UsedLettersLabel extends JLabel {

    public UsedLettersLabel() {
        super("", SwingConstants.CENTER);
        setPreferredSize(new Dimension(500, 100));
        setFont(new Font("SansSerif", Font.BOLD, 10));
    }

    @Override
    public void setText(String text) {
        super.setText("Letters Already used:" + text);
    }
}