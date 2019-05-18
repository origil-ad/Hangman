package views;

import javax.swing.*;
import java.awt.*;

class WordLabel extends JLabel {

    WordLabel(String text, int size) {
        super(text, SwingConstants.CENTER);
        setPreferredSize(new Dimension(size, size / 10));
        setFont(new Font("SansSerif", Font.BOLD, 40));
    }
}