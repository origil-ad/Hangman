package views;

import javax.swing.*;
import java.awt.*;

public class UsedLettersLabel extends JLabel {

    public UsedLettersLabel() {
        super("Letters Already used:");
        setPreferredSize(new Dimension(500, 100));
        setFont(new Font("SansSerif", Font.BOLD, 10));
        setVerticalAlignment(SwingConstants.CENTER);
    }

    @Override
    public void setText(String text) {
        super.setText("Letters Already used:" + text);
    }
}